// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

public interface ApiResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.resource.v1.ApiResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  int getSecurityDefinitionsCount();
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  boolean containsSecurityDefinitions(
      java.lang.String key);
  /**
   * Use {@link #getSecurityDefinitionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
  getSecurityDefinitions();
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
  getSecurityDefinitionsMap();
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */

  io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrDefault(
      java.lang.String key,
      io.nitric.proto.resource.v1.ApiSecurityDefinition defaultValue);
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */

  io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrThrow(
      java.lang.String key);
}
