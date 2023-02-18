// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.grpc;

/**
 * Protobuf type {@code beacon.ListCommandsRequest}
 */
public final class ListCommandsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:beacon.ListCommandsRequest)
    ListCommandsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCommandsRequest.newBuilder() to construct.
  private ListCommandsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCommandsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCommandsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_ListCommandsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_ListCommandsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.grpc.ListCommandsRequest.class, net.rossonet.ptalk.grpc.ListCommandsRequest.Builder.class);
  }

  public static final int AGENTTARGET_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.grpc.Agent agentTarget_;
  /**
   * <code>.beacon.Agent agentTarget = 1;</code>
   * @return Whether the agentTarget field is set.
   */
  @java.lang.Override
  public boolean hasAgentTarget() {
    return agentTarget_ != null;
  }
  /**
   * <code>.beacon.Agent agentTarget = 1;</code>
   * @return The agentTarget.
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.Agent getAgentTarget() {
    return agentTarget_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentTarget_;
  }
  /**
   * <code>.beacon.Agent agentTarget = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentTargetOrBuilder() {
    return agentTarget_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentTarget_;
  }

  public static final int AGENTSENDER_FIELD_NUMBER = 2;
  private net.rossonet.ptalk.grpc.Agent agentSender_;
  /**
   * <code>.beacon.Agent agentSender = 2;</code>
   * @return Whether the agentSender field is set.
   */
  @java.lang.Override
  public boolean hasAgentSender() {
    return agentSender_ != null;
  }
  /**
   * <code>.beacon.Agent agentSender = 2;</code>
   * @return The agentSender.
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.Agent getAgentSender() {
    return agentSender_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
  }
  /**
   * <code>.beacon.Agent agentSender = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
    return agentSender_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
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
    if (agentTarget_ != null) {
      output.writeMessage(1, getAgentTarget());
    }
    if (agentSender_ != null) {
      output.writeMessage(2, getAgentSender());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentTarget_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgentTarget());
    }
    if (agentSender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAgentSender());
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
    if (!(obj instanceof net.rossonet.ptalk.grpc.ListCommandsRequest)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.grpc.ListCommandsRequest other = (net.rossonet.ptalk.grpc.ListCommandsRequest) obj;

    if (hasAgentTarget() != other.hasAgentTarget()) return false;
    if (hasAgentTarget()) {
      if (!getAgentTarget()
          .equals(other.getAgentTarget())) return false;
    }
    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
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
    if (hasAgentTarget()) {
      hash = (37 * hash) + AGENTTARGET_FIELD_NUMBER;
      hash = (53 * hash) + getAgentTarget().hashCode();
    }
    if (hasAgentSender()) {
      hash = (37 * hash) + AGENTSENDER_FIELD_NUMBER;
      hash = (53 * hash) + getAgentSender().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.grpc.ListCommandsRequest parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.grpc.ListCommandsRequest prototype) {
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
   * Protobuf type {@code beacon.ListCommandsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:beacon.ListCommandsRequest)
      net.rossonet.ptalk.grpc.ListCommandsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_ListCommandsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_ListCommandsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.grpc.ListCommandsRequest.class, net.rossonet.ptalk.grpc.ListCommandsRequest.Builder.class);
    }

    // Construct using net.rossonet.ptalk.grpc.ListCommandsRequest.newBuilder()
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
      agentTarget_ = null;
      if (agentTargetBuilder_ != null) {
        agentTargetBuilder_.dispose();
        agentTargetBuilder_ = null;
      }
      agentSender_ = null;
      if (agentSenderBuilder_ != null) {
        agentSenderBuilder_.dispose();
        agentSenderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.grpc.PtaskNluApi.internal_static_beacon_ListCommandsRequest_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.ListCommandsRequest getDefaultInstanceForType() {
      return net.rossonet.ptalk.grpc.ListCommandsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.ListCommandsRequest build() {
      net.rossonet.ptalk.grpc.ListCommandsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.grpc.ListCommandsRequest buildPartial() {
      net.rossonet.ptalk.grpc.ListCommandsRequest result = new net.rossonet.ptalk.grpc.ListCommandsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(net.rossonet.ptalk.grpc.ListCommandsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentTarget_ = agentTargetBuilder_ == null
            ? agentTarget_
            : agentTargetBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentSender_ = agentSenderBuilder_ == null
            ? agentSender_
            : agentSenderBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.rossonet.ptalk.grpc.ListCommandsRequest) {
        return mergeFrom((net.rossonet.ptalk.grpc.ListCommandsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.grpc.ListCommandsRequest other) {
      if (other == net.rossonet.ptalk.grpc.ListCommandsRequest.getDefaultInstance()) return this;
      if (other.hasAgentTarget()) {
        mergeAgentTarget(other.getAgentTarget());
      }
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
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
                  getAgentTargetFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAgentSenderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private net.rossonet.ptalk.grpc.Agent agentTarget_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> agentTargetBuilder_;
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     * @return Whether the agentTarget field is set.
     */
    public boolean hasAgentTarget() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     * @return The agentTarget.
     */
    public net.rossonet.ptalk.grpc.Agent getAgentTarget() {
      if (agentTargetBuilder_ == null) {
        return agentTarget_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentTarget_;
      } else {
        return agentTargetBuilder_.getMessage();
      }
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     */
    public Builder setAgentTarget(net.rossonet.ptalk.grpc.Agent value) {
      if (agentTargetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentTarget_ = value;
      } else {
        agentTargetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     */
    public Builder setAgentTarget(
        net.rossonet.ptalk.grpc.Agent.Builder builderForValue) {
      if (agentTargetBuilder_ == null) {
        agentTarget_ = builderForValue.build();
      } else {
        agentTargetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     */
    public Builder mergeAgentTarget(net.rossonet.ptalk.grpc.Agent value) {
      if (agentTargetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agentTarget_ != null &&
          agentTarget_ != net.rossonet.ptalk.grpc.Agent.getDefaultInstance()) {
          getAgentTargetBuilder().mergeFrom(value);
        } else {
          agentTarget_ = value;
        }
      } else {
        agentTargetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     */
    public Builder clearAgentTarget() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentTarget_ = null;
      if (agentTargetBuilder_ != null) {
        agentTargetBuilder_.dispose();
        agentTargetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     */
    public net.rossonet.ptalk.grpc.Agent.Builder getAgentTargetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentTargetFieldBuilder().getBuilder();
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     */
    public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentTargetOrBuilder() {
      if (agentTargetBuilder_ != null) {
        return agentTargetBuilder_.getMessageOrBuilder();
      } else {
        return agentTarget_ == null ?
            net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentTarget_;
      }
    }
    /**
     * <code>.beacon.Agent agentTarget = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> 
        getAgentTargetFieldBuilder() {
      if (agentTargetBuilder_ == null) {
        agentTargetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder>(
                getAgentTarget(),
                getParentForChildren(),
                isClean());
        agentTarget_ = null;
      }
      return agentTargetBuilder_;
    }

    private net.rossonet.ptalk.grpc.Agent agentSender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> agentSenderBuilder_;
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     * @return Whether the agentSender field is set.
     */
    public boolean hasAgentSender() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     * @return The agentSender.
     */
    public net.rossonet.ptalk.grpc.Agent getAgentSender() {
      if (agentSenderBuilder_ == null) {
        return agentSender_ == null ? net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
      } else {
        return agentSenderBuilder_.getMessage();
      }
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     */
    public Builder setAgentSender(net.rossonet.ptalk.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentSender_ = value;
      } else {
        agentSenderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     */
    public Builder setAgentSender(
        net.rossonet.ptalk.grpc.Agent.Builder builderForValue) {
      if (agentSenderBuilder_ == null) {
        agentSender_ = builderForValue.build();
      } else {
        agentSenderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     */
    public Builder mergeAgentSender(net.rossonet.ptalk.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          agentSender_ != null &&
          agentSender_ != net.rossonet.ptalk.grpc.Agent.getDefaultInstance()) {
          getAgentSenderBuilder().mergeFrom(value);
        } else {
          agentSender_ = value;
        }
      } else {
        agentSenderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     */
    public Builder clearAgentSender() {
      bitField0_ = (bitField0_ & ~0x00000002);
      agentSender_ = null;
      if (agentSenderBuilder_ != null) {
        agentSenderBuilder_.dispose();
        agentSenderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     */
    public net.rossonet.ptalk.grpc.Agent.Builder getAgentSenderBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAgentSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     */
    public net.rossonet.ptalk.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
      if (agentSenderBuilder_ != null) {
        return agentSenderBuilder_.getMessageOrBuilder();
      } else {
        return agentSender_ == null ?
            net.rossonet.ptalk.grpc.Agent.getDefaultInstance() : agentSender_;
      }
    }
    /**
     * <code>.beacon.Agent agentSender = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder> 
        getAgentSenderFieldBuilder() {
      if (agentSenderBuilder_ == null) {
        agentSenderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.grpc.Agent, net.rossonet.ptalk.grpc.Agent.Builder, net.rossonet.ptalk.grpc.AgentOrBuilder>(
                getAgentSender(),
                getParentForChildren(),
                isClean());
        agentSender_ = null;
      }
      return agentSenderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:beacon.ListCommandsRequest)
  }

  // @@protoc_insertion_point(class_scope:beacon.ListCommandsRequest)
  private static final net.rossonet.ptalk.grpc.ListCommandsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.grpc.ListCommandsRequest();
  }

  public static net.rossonet.ptalk.grpc.ListCommandsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCommandsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListCommandsRequest>() {
    @java.lang.Override
    public ListCommandsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCommandsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCommandsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.grpc.ListCommandsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

