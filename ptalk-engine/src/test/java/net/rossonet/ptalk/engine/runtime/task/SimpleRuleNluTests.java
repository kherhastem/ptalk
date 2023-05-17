package net.rossonet.ptalk.engine.runtime.task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rossonet.utils.NetworkHelper;

import com.google.common.io.Resources;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.DataType;
import net.rossonet.ptalk.base.grpc.Quality;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.base.grpc.RpcCoreV1Grpc;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.base.grpc.UnitType;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1BlockingStub;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc.RpcChannelUnitV1ImplBase;
import net.rossonet.ptalk.engine.GlobalConfiguration;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.nlu.grpc.NluListModelsReply;
import net.rossonet.ptalk.nlu.grpc.NluListModelsRequest;
import net.rossonet.ptalk.nlu.grpc.NluMessageReply;
import net.rossonet.ptalk.nlu.grpc.NluMessageRequest;
import net.rossonet.ptalk.nlu.grpc.NluModel;
import net.rossonet.ptalk.nlu.grpc.RpcNluUnitV1Grpc.RpcNluUnitV1ImplBase;

public class SimpleRuleNluTests {

	// TODO salvare dati di contesto in memoria per ultima sessione e recuperarli

	public class GrpcChannelServiceImpl extends RpcChannelUnitV1ImplBase {

		private final SimpleRuleNluTests simpleRuleTests;

		public GrpcChannelServiceImpl(SimpleRuleNluTests simpleRuleTests) {
			this.simpleRuleTests = simpleRuleTests;
		}

		@Override
		public void callSync(ChannelMessageRequest request, StreamObserver<ChannelMessageReply> responseObserver) {
			System.out.println("REPLY: " + request.getMessage().getValue());
			responseObserver.onNext(ChannelMessageReply.newBuilder().setFlowReference(request.getFlowReference())
					.setStatus(StatusValue.STATUS_GOOD)
					.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
					.build());
			responseObserver.onCompleted();
			assertEquals("NLU REPLY NLU CLASS 123", request.getMessage().getValue());
			simpleRuleTests.setComplete(true);
		}

	}

	public class GrpcNluServiceImpl extends RpcNluUnitV1ImplBase {

		private final SimpleRuleNluTests simpleRuleTests;

		public GrpcNluServiceImpl(SimpleRuleNluTests simpleRuleTests) {
			this.simpleRuleTests = simpleRuleTests;
		}

		@Override
		public void callSync(NluMessageRequest request, StreamObserver<NluMessageReply> responseObserver) {
			System.out.println("--- NLU QUERY ---\n" + request.toString());
			try {
				final String reply = "NLU CLASS 123";
				final Data contentReply = Data.newBuilder().setKey("nlu_reply").setQuality(Quality.GOOD)
						.setTypeData(DataType.STRING).setValue(reply).build();
				responseObserver.onNext(NluMessageReply.newBuilder().setFlowReference(request.getFlowReference())
						.setStatus(StatusValue.STATUS_GOOD).setReply(contentReply)
						.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
						.build());
				responseObserver.onCompleted();
				simpleRuleTests.setComplete(true);
			} catch (final Exception a) {
				responseObserver.onError(a);
			}
		}

		@Override
		public void listModels(NluListModelsRequest request, StreamObserver<NluListModelsReply> responseObserver) {
			final NluModel model = NluModel.newBuilder().setModel("test_model").build();
			final NluListModelsReply modelsReply = NluListModelsReply.newBuilder().addModel(model).build();
			responseObserver.onNext(modelsReply);
			responseObserver.onCompleted();

		}

	}

	private static final String TEST_CHANNEL_UNIQUE_NAME = "test-channel";

	private static final String TEST_NLU_UNIQUE_NAME = "test-nlu";

	private static PTalkEngineRuntime pTalkEngineRuntime = null;

	@BeforeAll
	public static void createRuntime() throws TaskManagerException {
		final GlobalConfiguration configuration = GlobalConfiguration.getNewBuilder().setHazelcastEmbedded(true)
				.build();
		pTalkEngineRuntime = new PTalkEngineRuntime(configuration);
	}

	@AfterAll
	public static void terminateRuntime() {
		pTalkEngineRuntime.stop();
	}

	private boolean complete = false;

	private Server server;

	private String checkValue = null;

	private int nluUnitPort;

	private int channelUnitPort;

	private ManagedChannel channelUnit;

	private ManagedChannel nluUnit;

	@BeforeEach
	public void assignPorts() {
		nluUnitPort = NetworkHelper.findAvailablePort(5610);
		channelUnitPort = NetworkHelper.findAvailablePort(5710);
	}

	private void createNluUnit() throws IOException {
		server = ServerBuilder.forPort(nluUnitPort).addService(new GrpcNluServiceImpl(this)).build();
		server.start();
		registerNLuUnit();
	}

	private void createOutputChannel() throws IOException {
		server = ServerBuilder.forPort(channelUnitPort).addService(new GrpcChannelServiceImpl(this)).build();
		server.start();
		registerChannelUnit();
	}

	public String getCheckValue() {
		return checkValue;
	}

	private RpcChannelCoreV1BlockingStub getInputChannel() {
		final ManagedChannel mc = getManagedChannel();
		return RpcChannelCoreV1Grpc.newBlockingStub(mc);
	}

	private ManagedChannel getManagedChannel() {
		final ManagedChannel mc = ManagedChannelBuilder
				.forAddress("127.0.0.1", GlobalConfiguration.DEFAULT_GRPC_SERVER_PORT).usePlaintext().build();
		return mc;
	}

	private void loadSingleRule() throws IOException, TaskManagerException, JSONException {
		// System.out.println(pTalkEngineRuntime.toString());
		final URL url = Resources.getResource("one-rule/test-nlu.json");
		final String configuration = Resources.toString(url, StandardCharsets.UTF_8);
		// System.out.println("\n\n" + configuration + "\n\n");
		pTalkEngineRuntime.replaceJsonConfiguration(configuration);
		final JSONObject json = pTalkEngineRuntime.getJsonConfiguration();
		System.out.println(json.toString(2));
	}

	private void registerChannelUnit() {
		channelUnit = getManagedChannel();
		final RegisterRequest registerRequest = RegisterRequest.newBuilder().setUnitType(UnitType.CHANNEL)
				.setUnitUniqueName(TEST_CHANNEL_UNIQUE_NAME).setHost("127.0.0.1").setPort(channelUnitPort).build();
		RpcCoreV1Grpc.newBlockingStub(channelUnit).register(registerRequest);

	}

	private void registerNLuUnit() {
		nluUnit = getManagedChannel();
		final RegisterRequest registerRequest = RegisterRequest.newBuilder().setUnitType(UnitType.NLU)
				.setUnitUniqueName(TEST_NLU_UNIQUE_NAME).setHost("127.0.0.1").setPort(nluUnitPort).build();
		RpcCoreV1Grpc.newBlockingStub(nluUnit).register(registerRequest);

	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Test
	public void simpleNluQueryTest() throws TaskManagerException, IOException, InterruptedException {
		loadSingleRule();
		final RpcChannelCoreV1BlockingStub inputChannel = getInputChannel();
		createOutputChannel();
		createNluUnit();
		checkValue = UUID.randomUUID().toString();
		final ChannelMessageRequest request = ChannelMessageRequest.newBuilder()
				.setChannelUniqueMessageId(UUID.randomUUID().toString()).setChannelUniqueName(TEST_CHANNEL_UNIQUE_NAME)
				.setMessage(Data.newBuilder().setValue(checkValue).build()).build();
		final ChannelMessageReply reply = inputChannel.callSync(request);
		System.out.println(reply.toString());
		channelUnit.shutdown();
		channelUnit.awaitTermination(30, TimeUnit.SECONDS);
		nluUnit.shutdown();
		nluUnit.awaitTermination(30, TimeUnit.SECONDS);
		server.shutdown();
		server.awaitTermination(30, TimeUnit.SECONDS);
		assertTrue(complete);
	}

}
