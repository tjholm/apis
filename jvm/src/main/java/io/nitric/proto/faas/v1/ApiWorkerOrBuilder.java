// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface ApiWorkerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.ApiWorker)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string api = 1;</code>
   * @return The api.
   */
  java.lang.String getApi();
  /**
   * <code>string api = 1;</code>
   * @return The bytes for api.
   */
  com.google.protobuf.ByteString
      getApiBytes();

  /**
   * <code>string path = 2;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>repeated string methods = 3;</code>
   * @return A list containing the methods.
   */
  java.util.List<java.lang.String>
      getMethodsList();
  /**
   * <code>repeated string methods = 3;</code>
   * @return The count of methods.
   */
  int getMethodsCount();
  /**
   * <code>repeated string methods = 3;</code>
   * @param index The index of the element to return.
   * @return The methods at the given index.
   */
  java.lang.String getMethods(int index);
  /**
   * <code>repeated string methods = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the methods at the given index.
   */
  com.google.protobuf.ByteString
      getMethodsBytes(int index);

  /**
   * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
   * @return The options.
   */
  io.nitric.proto.faas.v1.ApiWorkerOptions getOptions();
  /**
   * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
   */
  io.nitric.proto.faas.v1.ApiWorkerOptionsOrBuilder getOptionsOrBuilder();
}
