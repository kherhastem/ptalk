// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.grpc;

public interface FlowMessageDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:beacon.FlowMessageData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .beacon.DataNode values = 1;</code>
   */
  java.util.List<net.rossonet.ptalk.grpc.DataNode> 
      getValuesList();
  /**
   * <code>repeated .beacon.DataNode values = 1;</code>
   */
  net.rossonet.ptalk.grpc.DataNode getValues(int index);
  /**
   * <code>repeated .beacon.DataNode values = 1;</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .beacon.DataNode values = 1;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.grpc.DataNodeOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .beacon.DataNode values = 1;</code>
   */
  net.rossonet.ptalk.grpc.DataNodeOrBuilder getValuesOrBuilder(
      int index);

  /**
   * <code>int32 hiSpeedRoutingTag = 2;</code>
   * @return The hiSpeedRoutingTag.
   */
  int getHiSpeedRoutingTag();
}
