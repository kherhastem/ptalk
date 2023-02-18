// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.grpc;

/**
 * Protobuf type {@code beacon.SubscribeRequest}
 */
public final class SubscribeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:beacon.SubscribeRequest)
    SubscribeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscribeRequest.newBuilder() to construct.
  private SubscribeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeRequest() {
    dataNodes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubscribeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_SubscribeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_SubscribeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.grpc.SubscribeRequest.class, net.rossonet.ptalk.grpc.SubscribeRequest.Builder.class);
  }

  public static final int AGENT_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.grpc.Agent agent_;
  /**
   * <code>.beacon.Agent agent = 1;</code>
   * @return Whether the agent field is set.
   */
  @java.lang.Override
  public boolean hasAgent() {
    return agent_ != null;
  }
  /**
   * <code>.beacon.Agent agent = 1;</code>
   * @return The agent.
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.Agent getAgent() {
    return agent_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agent_;
  }
  /**
   * <code>.beacon.Agent agent = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentOrBuilder() {
    return agent_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agent_;
  }

  public static final int DATANODES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<net.rossonet.ptalk.grpc.DataNode> dataNodes_;
  /**
   * <code>repeated .beacon.DataNode dataNodes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<net.rossonet.ptalk.grpc.DataNode> getDataNodesList() {
    return dataNodes_;
  }
  /**
   * <code>repeated .beacon.DataNode dataNodes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rossonet.ptalk.grpc.DataNodeOrBuilder> 
      getDataNodesOrBuilderList() {
    return dataNodes_;
  }
  /**
   * <code>repeated .beacon.DataNode dataNodes = 2;</code>
   */
  @java.lang.Override
  public int getDataNodesCount() {
    return dataNodes_.size();
  }
  /**
   * <code>repeated .beacon.DataNode dataNodes = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.DataNode getDataNodes(int index) {
    return dataNodes_.get(index);
  }
  /**
   * <code>repeated .beacon.DataNode dataNodes = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.DataNodeOrBuilder getDataNodesOrBuilder(
      int index) {
    return dataNodes_.get(index);
  }

  public static final int SAMPLINGRATE_FIELD_NUMBER = 3;
  private int samplingRate_ = 0;
  /**
   * <code>int32 samplingRate = 3;</code>
   * @return The samplingRate.
   */
  @java.lang.Override
  public int getSamplingRate() {
    return samplingRate_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (agent_ != null) {
      output.writeMessage(1, getAgent());
    }
    for (int i = 0; i < dataNodes_.size(); i++) {
      output.writeMessage(2, dataNodes_.get(i));
    }
    if (samplingRate_ != 0) {
      output.writeInt32(3, samplingRate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgent());
    }
    for (int i = 0; i < dataNodes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, dataNodes_.get(i));
    }
    if (samplingRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, samplingRate_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.rossonet.ptalk.grpc.SubscribeRequest)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.grpc.SubscribeRequest other = (net.rossonet.ptalk.grpc.SubscribeRequest) obj;

    if (hasAgent() != other.hasAgent()) return false;
    if (hasAgent()) {
      if (!getAgent()
          .equals(other.getAgent())) return false;
    }
    if (!getDataNodesList()
        .equals(other.getDataNodesList())) return false;
    if (getSamplingRate()
        != other.getSamplingRate()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAgent()) {
      hash = (37 * hash) + AGENT_FIELD_NUMBER;
      hash = (53 * hash) + getAgent().hashCode();
    }
    if (getDataNodesCount() > 0) {
      hash = (37 * hash) + DATANODES_FIELD_NUMBER;
      hash = (53 * hash) + getDataNodesList().hashCode();
    }
    hash = (37 * hash) + SAMPLINGRATE_FIELD_NUMBER;
    hash = (53 * hash) + getSamplingRate();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.rossonet.ptalk.grpc.SubscribeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code beacon.SubscribeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:beacon.SubscribeRequest)
      net.rossonet.ptalk.grpc.SubscribeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_SubscribeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_SubscribeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.grpc.SubscribeRequest.class, net.rossonet.ptalk.grpc.SubscribeRequest.Builder.class);
    }

    // Construct using net.rossonet.ptalk.grpc.SubscribeRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      agent_ = null;
      if (agentBuilder_ != null) {
        agentBuilder_.dispose();
        agentBuilder_ = null;
      }
      if (dataNodesBuilder_ == null) {
        dataNodes_ = java.util.Collections.emptyList();
      } else {
        dataNodes_ = null;
        dataNodesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      samplingRate_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_SubscribeRequest_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.SubscribeRequest getDefaultInstanceForType() {
      return net.rossonet.ptalk.grpc.SubscribeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.SubscribeRequest build() {
      net.rossonet.ptalk.grpc.SubscribeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.SubscribeRequest buildPartial() {
      net.rossonet.ptalk.grpc.SubscribeRequest result = new net.rossonet.ptalk.grpc.SubscribeRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(net.rossonet.ptalk.grpc.SubscribeRequest result) {
      if (dataNodesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          dataNodes_ = java.util.Collections.unmodifiableList(dataNodes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.dataNodes_ = dataNodes_;
      } else {
        result.dataNodes_ = dataNodesBuilder_.build();
      }
    }

    private void buildPartial0(net.rossonet.ptalk.grpc.SubscribeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agent_ = agentBuilder_ == null
            ? agent_
            : agentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.samplingRate_ = samplingRate_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.rossonet.ptalk.grpc.SubscribeRequest) {
        return mergeFrom((net.rossonet.ptalk.grpc.SubscribeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.grpc.SubscribeRequest other) {
      if (other == net.rossonet.ptalk.grpc.SubscribeRequest.getDefaultInstance()) return this;
      if (other.hasAgent()) {
        mergeAgent(other.getAgent());
      }
      if (dataNodesBuilder_ == null) {
        if (!other.dataNodes_.isEmpty()) {
          if (dataNodes_.isEmpty()) {
            dataNodes_ = other.dataNodes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDataNodesIsMutable();
            dataNodes_.addAll(other.dataNodes_);
          }
          onChanged();
        }
      } else {
        if (!other.dataNodes_.isEmpty()) {
          if (dataNodesBuilder_.isEmpty()) {
            dataNodesBuilder_.dispose();
            dataNodesBuilder_ = null;
            dataNodes_ = other.dataNodes_;
            bitField0_ = (bitField0_ & ~0x00000002);
            dataNodesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataNodesFieldBuilder() : null;
          } else {
            dataNodesBuilder_.addAllMessages(other.dataNodes_);
          }
        }
      }
      if (other.getSamplingRate() != 0) {
        setSamplingRate(other.getSamplingRate());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getAgentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              net.rossonet.ptalk.grpc.DataNode m =
                  input.readMessage(
                      net.rossonet.ptalk.grpc.DataNode.parser(),
                      extensionRegistry);
              if (dataNodesBuilder_ == null) {
                ensureDataNodesIsMutable();
                dataNodes_.add(m);
              } else {
                dataNodesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              samplingRate_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private net.rossonet.ptalk.grpc.Agent agent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> agentBuilder_;
    /**
     * <code>.beacon.Agent agent = 1;</code>
     * @return Whether the agent field is set.
     */
    public boolean hasAgent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     * @return The agent.
     */
    public net.rossonet.ptalk.grpc.Agent getAgent() {
      if (agentBuilder_ == null) {
        return agent_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agent_;
      } else {
        return agentBuilder_.getMessage();
      }
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     */
    public Builder setAgent(net.rossonet.ptalk.grpc.Agent value) {
      if (agentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agent_ = value;
      } else {
        agentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     */
    public Builder setAgent(
        net.rossonet.ptalk.grpc.Agent.Builder builderForValue) {
      if (agentBuilder_ == null) {
        agent_ = builderForValue.build();
      } else {
        agentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     */
    public Builder mergeAgent(net.rossonet.ptalk.grpc.Agent value) {
      if (agentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agent_ != null &&
          agent_ != net.rossonet.ptalk.grpc.Agent.getDefaultInstance()) {
          getAgentBuilder().mergeFrom(value);
        } else {
          agent_ = value;
        }
      } else {
        agentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     */
    public Builder clearAgent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agent_ = null;
      if (agentBuilder_ != null) {
        agentBuilder_.dispose();
        agentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     */
    public net.rossonet.ptalk.grpc.Agent.Builder getAgentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentFieldBuilder().getBuilder();
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     */
    public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentOrBuilder() {
      if (agentBuilder_ != null) {
        return agentBuilder_.getMessageOrBuilder();
      } else {
        return agent_ == null ?
            net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agent_;
      }
    }
    /**
     * <code>.beacon.Agent agent = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> 
        getAgentFieldBuilder() {
      if (agentBuilder_ == null) {
        agentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder>(
                getAgent(),
                getParentForChildren(),
                isClean());
        agent_ = null;
      }
      return agentBuilder_;
    }

    private java.util.List<net.rossonet.ptalk.grpc.DataNode> dataNodes_ =
      java.util.Collections.emptyList();
    private void ensureDataNodesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        dataNodes_ = new java.util.ArrayList<net.rossonet.ptalk.grpc.DataNode>(dataNodes_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.grpc.DataNode, net.rossonet.ptalk.grpc.DataNode.Builder, net.rossonet.ptalk.grpc.DataNodeOrBuilder> dataNodesBuilder_;

    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public java.util.List<net.rossonet.ptalk.grpc.DataNode> getDataNodesList() {
      if (dataNodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataNodes_);
      } else {
        return dataNodesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public int getDataNodesCount() {
      if (dataNodesBuilder_ == null) {
        return dataNodes_.size();
      } else {
        return dataNodesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public net.rossonet.ptalk.grpc.DataNode getDataNodes(int index) {
      if (dataNodesBuilder_ == null) {
        return dataNodes_.get(index);
      } else {
        return dataNodesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder setDataNodes(
        int index, net.rossonet.ptalk.grpc.DataNode value) {
      if (dataNodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataNodesIsMutable();
        dataNodes_.set(index, value);
        onChanged();
      } else {
        dataNodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder setDataNodes(
        int index, net.rossonet.ptalk.grpc.DataNode.Builder builderForValue) {
      if (dataNodesBuilder_ == null) {
        ensureDataNodesIsMutable();
        dataNodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataNodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder addDataNodes(net.rossonet.ptalk.grpc.DataNode value) {
      if (dataNodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataNodesIsMutable();
        dataNodes_.add(value);
        onChanged();
      } else {
        dataNodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder addDataNodes(
        int index, net.rossonet.ptalk.grpc.DataNode value) {
      if (dataNodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataNodesIsMutable();
        dataNodes_.add(index, value);
        onChanged();
      } else {
        dataNodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder addDataNodes(
        net.rossonet.ptalk.grpc.DataNode.Builder builderForValue) {
      if (dataNodesBuilder_ == null) {
        ensureDataNodesIsMutable();
        dataNodes_.add(builderForValue.build());
        onChanged();
      } else {
        dataNodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder addDataNodes(
        int index, net.rossonet.ptalk.grpc.DataNode.Builder builderForValue) {
      if (dataNodesBuilder_ == null) {
        ensureDataNodesIsMutable();
        dataNodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataNodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder addAllDataNodes(
        java.lang.Iterable<? extends net.rossonet.ptalk.grpc.DataNode> values) {
      if (dataNodesBuilder_ == null) {
        ensureDataNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataNodes_);
        onChanged();
      } else {
        dataNodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder clearDataNodes() {
      if (dataNodesBuilder_ == null) {
        dataNodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        dataNodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public Builder removeDataNodes(int index) {
      if (dataNodesBuilder_ == null) {
        ensureDataNodesIsMutable();
        dataNodes_.remove(index);
        onChanged();
      } else {
        dataNodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public net.rossonet.ptalk.grpc.DataNode.Builder getDataNodesBuilder(
        int index) {
      return getDataNodesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public net.rossonet.ptalk.grpc.DataNodeOrBuilder getDataNodesOrBuilder(
        int index) {
      if (dataNodesBuilder_ == null) {
        return dataNodes_.get(index);  } else {
        return dataNodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public java.util.List<? extends net.rossonet.ptalk.grpc.DataNodeOrBuilder> 
         getDataNodesOrBuilderList() {
      if (dataNodesBuilder_ != null) {
        return dataNodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataNodes_);
      }
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public net.rossonet.ptalk.grpc.DataNode.Builder addDataNodesBuilder() {
      return getDataNodesFieldBuilder().addBuilder(
          net.rossonet.ptalk.grpc.DataNode.getDefaultInstance());
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public net.rossonet.ptalk.grpc.DataNode.Builder addDataNodesBuilder(
        int index) {
      return getDataNodesFieldBuilder().addBuilder(
          index, net.rossonet.ptalk.grpc.DataNode.getDefaultInstance());
    }
    /**
     * <code>repeated .beacon.DataNode dataNodes = 2;</code>
     */
    public java.util.List<net.rossonet.ptalk.grpc.DataNode.Builder> 
         getDataNodesBuilderList() {
      return getDataNodesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.grpc.DataNode, net.rossonet.ptalk.grpc.DataNode.Builder, net.rossonet.ptalk.grpc.DataNodeOrBuilder> 
        getDataNodesFieldBuilder() {
      if (dataNodesBuilder_ == null) {
        dataNodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rossonet.ptalk.grpc.DataNode, net.rossonet.ptalk.grpc.DataNode.Builder, net.rossonet.ptalk.grpc.DataNodeOrBuilder>(
                dataNodes_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        dataNodes_ = null;
      }
      return dataNodesBuilder_;
    }

    private int samplingRate_ ;
    /**
     * <code>int32 samplingRate = 3;</code>
     * @return The samplingRate.
     */
    @java.lang.Override
    public int getSamplingRate() {
      return samplingRate_;
    }
    /**
     * <code>int32 samplingRate = 3;</code>
     * @param value The samplingRate to set.
     * @return This builder for chaining.
     */
    public Builder setSamplingRate(int value) {

      samplingRate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 samplingRate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSamplingRate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      samplingRate_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:beacon.SubscribeRequest)
  }

  // @@protoc_insertion_point(class_scope:beacon.SubscribeRequest)
  private static final net.rossonet.ptalk.grpc.SubscribeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.grpc.SubscribeRequest();
  }

  public static net.rossonet.ptalk.grpc.SubscribeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeRequest>() {
    @java.lang.Override
    public SubscribeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SubscribeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.grpc.SubscribeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

