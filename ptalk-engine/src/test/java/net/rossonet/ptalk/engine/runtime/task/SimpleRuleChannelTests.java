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
import org.junit.jupiter.api.Test;

import com.google.common.io.Resources;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Data;
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

public class SimpleRuleChannelTests {

	public class GrpcChannelServiceImpl extends RpcChannelUnitV1ImplBase {

		private final SimpleRuleChannelTests simpleRuleTests;

		public GrpcChannelServiceImpl(SimpleRuleChannelTests simpleRuleTests) {
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
			assertEquals("OK " + simpleRuleTests.getCheckValue(), request.getMessage().getValue());
			simpleRuleTests.setComplete(true);
		}

	}

	private static final String TEST_CHANNEL_UNIQUE_NAME = "test-channel";

	private static final int GRPC_UNIT_TEST_PORT = 8250;

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

	private ManagedChannel mc;

	@Test
	public void channelTestIteraction() throws TaskManagerException, IOException, InterruptedException {
		loadSingleRule();
		final RpcChannelCoreV1BlockingStub inputChannel = getInputChannel();
		createOutputChannel();
		checkValue = UUID.randomUUID().toString();
		final ChannelMessageRequest request = ChannelMessageRequest.newBuilder()
				.setChannelUniqueMessageId(UUID.randomUUID().toString()).setChannelUniqueName(TEST_CHANNEL_UNIQUE_NAME)
				.setMessage(Data.newBuilder().setValue(checkValue).build()).build();
		final ChannelMessageReply reply = inputChannel.callSync(request);
		System.out.println(reply.toString());
		mc.shutdown();
		mc.awaitTermination(30, TimeUnit.SECONDS);
		server.shutdown();
		server.awaitTermination(30, TimeUnit.SECONDS);
		assertTrue(complete);
	}

	private void createOutputChannel() throws IOException {
		server = ServerBuilder.forPort(GRPC_UNIT_TEST_PORT).addService(new GrpcChannelServiceImpl(this)).build();
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
		mc = ManagedChannelBuilder.forAddress("127.0.0.1", GlobalConfiguration.DEFAULT_GRPC_SERVER_PORT).usePlaintext()
				.build();
		return mc;
	}

	private void loadSingleRule() throws IOException, TaskManagerException, JSONException {
		// System.out.println(pTalkEngineRuntime.toString());
		final URL url = Resources.getResource("one-rule/echo-channel.json");
		final String configuration = Resources.toString(url, StandardCharsets.UTF_8);
		// System.out.println("\n\n" + configuration + "\n\n");
		pTalkEngineRuntime.replaceJsonConfiguration(configuration);
		final JSONObject json = pTalkEngineRuntime.getJsonConfiguration();
		System.out.println(json.toString(2));
	}

	private void registerChannelUnit() {
		final ManagedChannel mc = getManagedChannel();
		final RegisterRequest registerRequest = RegisterRequest.newBuilder().setUnitType(UnitType.CHANNEL)
				.setUnitUniqueName(TEST_CHANNEL_UNIQUE_NAME).setHost("127.0.0.1").setPort(GRPC_UNIT_TEST_PORT).build();
		RpcCoreV1Grpc.newBlockingStub(mc).register(registerRequest);

	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

}
