// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.grpc;

public interface RequestToAgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:beacon.RequestToAgent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.beacon.CommandType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.beacon.CommandType type = 1;</code>
   * @return The type.
   */
  net.rossonet.ptalk.grpc.CommandType getType();

  /**
   * <code>.beacon.Agent caller = 2;</code>
   * @return Whether the caller field is set.
   */
  boolean hasCaller();
  /**
   * <code>.beacon.Agent caller = 2;</code>
   * @return The caller.
   */
  net.rossonet.ptalk.grpc.Agent getCaller();
  /**
   * <code>.beacon.Agent caller = 2;</code>
   */
  net.rossonet.ptalk.grpc.AgentOrBuilder getCallerOrBuilder();

  /**
   * <code>string uniqueIdRequest = 3;</code>
   * @return The uniqueIdRequest.
   */
  java.lang.String getUniqueIdRequest();
  /**
   * <code>string uniqueIdRequest = 3;</code>
   * @return The bytes for uniqueIdRequest.
   */
  com.google.protobuf.ByteString
      getUniqueIdRequestBytes();

  /**
   * <code>string requestCommand = 4;</code>
   * @return The requestCommand.
   */
  java.lang.String getRequestCommand();
  /**
   * <code>string requestCommand = 4;</code>
   * @return The bytes for requestCommand.
   */
  com.google.protobuf.ByteString
      getRequestCommandBytes();

  /**
   * <code>repeated string words = 5;</code>
   * @return A list containing the words.
   */
  java.util.List<java.lang.String>
      getWordsList();
  /**
   * <code>repeated string words = 5;</code>
   * @return The count of words.
   */
  int getWordsCount();
  /**
   * <code>repeated string words = 5;</code>
   * @param index The index of the element to return.
   * @return The words at the given index.
   */
  java.lang.String getWords(int index);
  /**
   * <code>repeated string words = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the words at the given index.
   */
  com.google.protobuf.ByteString
      getWordsBytes(int index);

  /**
   * <code>int32 wordIndex = 6;</code>
   * @return The wordIndex.
   */
  int getWordIndex();

  /**
   * <code>int32 position = 7;</code>
   * @return The position.
   */
  int getPosition();

  /**
   * <code>.beacon.RequestTunnelMessage tunnelRequest = 8;</code>
   * @return Whether the tunnelRequest field is set.
   */
  boolean hasTunnelRequest();
  /**
   * <code>.beacon.RequestTunnelMessage tunnelRequest = 8;</code>
   * @return The tunnelRequest.
   */
  net.rossonet.ptalk.grpc.RequestTunnelMessage getTunnelRequest();
  /**
   * <code>.beacon.RequestTunnelMessage tunnelRequest = 8;</code>
   */
  net.rossonet.ptalk.grpc.RequestTunnelMessageOrBuilder getTunnelRequestOrBuilder();

  /**
   * <code>string otpToken = 9;</code>
   * @return The otpToken.
   */
  java.lang.String getOtpToken();
  /**
   * <code>string otpToken = 9;</code>
   * @return The bytes for otpToken.
   */
  com.google.protobuf.ByteString
      getOtpTokenBytes();
}
