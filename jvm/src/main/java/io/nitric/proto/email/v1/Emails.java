// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/email/v1/email.proto

package io.nitric.proto.email.v1;

public final class Emails {
  private Emails() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_email_v1_EmailBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_email_v1_EmailBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_email_v1_EmailSendRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_email_v1_EmailSendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_email_v1_EmailSendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_email_v1_EmailSendResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032proto/email/v1/email.proto\022\017nitric.ema" +
      "il.v1\032\027validate/validate.proto\"0\n\tEmailB" +
      "ody\022\025\n\004text\030\001 \001(\tB\007\372B\004r\002 \001\022\014\n\004html\030\002 \001(\t" +
      "\"\234\001\n\020EmailSendRequest\022\025\n\004from\030\001 \001(\tB\007\372B\004" +
      "r\002 \001\022\n\n\002to\030\002 \003(\t\022\n\n\002cc\030\003 \003(\t\022\013\n\003bcc\030\004 \003(" +
      "\t\022\030\n\007subject\030\005 \001(\tB\007\372B\004r\002 \001\0222\n\004body\030\006 \001(" +
      "\0132\032.nitric.email.v1.EmailBodyB\010\372B\005\212\001\002\020\001\"" +
      "\023\n\021EmailSendResponse2]\n\014EmailService\022M\n\004" +
      "Send\022!.nitric.email.v1.EmailSendRequest\032" +
      "\".nitric.email.v1.EmailSendResponseBb\n\030i" +
      "o.nitric.proto.email.v1B\006EmailsP\001Z\014nitri" +
      "c/v1;v1\252\002\025Nitric.Proto.Email.v1\312\002\025Nitric" +
      "\\Proto\\Email\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_nitric_email_v1_EmailBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nitric_email_v1_EmailBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_email_v1_EmailBody_descriptor,
        new java.lang.String[] { "Text", "Html", });
    internal_static_nitric_email_v1_EmailSendRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nitric_email_v1_EmailSendRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_email_v1_EmailSendRequest_descriptor,
        new java.lang.String[] { "From", "To", "Cc", "Bcc", "Subject", "Body", });
    internal_static_nitric_email_v1_EmailSendResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nitric_email_v1_EmailSendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_email_v1_EmailSendResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}