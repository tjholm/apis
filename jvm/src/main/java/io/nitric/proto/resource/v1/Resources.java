// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

public final class Resources {
  private Resources() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_PolicyResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_PolicyResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_ResourceDeclareRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_ResourceDeclareRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_BucketResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_BucketResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_QueueResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_QueueResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_TopicResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_TopicResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_CollectionResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_CollectionResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_SecretResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_SecretResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_ApiSecurityDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_ApiSecurityDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_ApiResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_ApiResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_ApiResource_SecurityDefinitionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_ApiResource_SecurityDefinitionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_resource_v1_ResourceDeclareResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_resource_v1_ResourceDeclareResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n proto/resource/v1/resource.proto\022\022nitr" +
      "ic.resource.v1\032\027validate/validate.proto\"" +
      "\240\001\n\016PolicyResource\0220\n\nprincipals\030\001 \003(\0132\034" +
      ".nitric.resource.v1.Resource\022+\n\007actions\030" +
      "\002 \003(\0162\032.nitric.resource.v1.Action\022/\n\tres" +
      "ources\030\003 \003(\0132\034.nitric.resource.v1.Resour" +
      "ce\"H\n\010Resource\022.\n\004type\030\001 \001(\0162 .nitric.re" +
      "source.v1.ResourceType\022\014\n\004name\030\002 \001(\t\"\312\003\n" +
      "\026ResourceDeclareRequest\022.\n\010resource\030\001 \001(" +
      "\0132\034.nitric.resource.v1.Resource\0224\n\006polic" +
      "y\030\n \001(\0132\".nitric.resource.v1.PolicyResou" +
      "rceH\000\0224\n\006bucket\030\013 \001(\0132\".nitric.resource." +
      "v1.BucketResourceH\000\0222\n\005queue\030\014 \001(\0132!.nit" +
      "ric.resource.v1.QueueResourceH\000\0222\n\005topic" +
      "\030\r \001(\0132!.nitric.resource.v1.TopicResourc" +
      "eH\000\022<\n\ncollection\030\016 \001(\0132&.nitric.resourc" +
      "e.v1.CollectionResourceH\000\0224\n\006secret\030\017 \001(" +
      "\0132\".nitric.resource.v1.SecretResourceH\000\022" +
      ".\n\003api\030\020 \001(\0132\037.nitric.resource.v1.ApiRes" +
      "ourceH\000B\010\n\006config\"\020\n\016BucketResource\"\017\n\rQ" +
      "ueueResource\"\017\n\rTopicResource\"\024\n\022Collect" +
      "ionResource\"\020\n\016SecretResource\"=\n\030ApiSecu" +
      "rityDefinitionJwt\022\016\n\006issuer\030\001 \001(\t\022\021\n\taud" +
      "iences\030\002 \003(\t\"b\n\025ApiSecurityDefinition\022;\n" +
      "\003jwt\030\001 \001(\0132,.nitric.resource.v1.ApiSecur" +
      "ityDefinitionJwtH\000B\014\n\ndefinition\"\336\001\n\013Api" +
      "Resource\022V\n\024security_definitions\030\001 \003(\01328" +
      ".nitric.resource.v1.ApiResource.Security" +
      "DefinitionsEntry\022\020\n\010security\030\002 \003(\t\032e\n\030Se" +
      "curityDefinitionsEntry\022\013\n\003key\030\001 \001(\t\0228\n\005v" +
      "alue\030\002 \001(\0132).nitric.resource.v1.ApiSecur" +
      "ityDefinition:\0028\001\"\031\n\027ResourceDeclareResp" +
      "onse*\217\001\n\014ResourceType\022\007\n\003Api\020\000\022\014\n\010Functi" +
      "on\020\001\022\n\n\006Bucket\020\002\022\t\n\005Queue\020\003\022\t\n\005Topic\020\004\022\014" +
      "\n\010Schedule\020\005\022\020\n\014Subscription\020\006\022\016\n\nCollec" +
      "tion\020\007\022\n\n\006Policy\020\010\022\n\n\006Secret\020\t*\377\002\n\006Actio" +
      "n\022\022\n\016BucketFileList\020\000\022\021\n\rBucketFileGet\020\001" +
      "\022\021\n\rBucketFilePut\020\002\022\024\n\020BucketFileDelete\020" +
      "\003\022\016\n\tTopicList\020\310\001\022\020\n\013TopicDetail\020\311\001\022\026\n\021T" +
      "opicEventPublish\020\312\001\022\016\n\tQueueSend\020\254\002\022\021\n\014Q" +
      "ueueReceive\020\255\002\022\016\n\tQueueList\020\256\002\022\020\n\013QueueD" +
      "etail\020\257\002\022\033\n\026CollectionDocumentRead\020\220\003\022\034\n" +
      "\027CollectionDocumentWrite\020\221\003\022\035\n\030Collectio" +
      "nDocumentDelete\020\222\003\022\024\n\017CollectionQuery\020\223\003" +
      "\022\023\n\016CollectionList\020\224\003\022\016\n\tSecretPut\020\364\003\022\021\n" +
      "\014SecretAccess\020\365\0032u\n\017ResourceService\022b\n\007D" +
      "eclare\022*.nitric.resource.v1.ResourceDecl" +
      "areRequest\032+.nitric.resource.v1.Resource" +
      "DeclareResponseBn\n\033io.nitric.proto.resou" +
      "rce.v1B\tResourcesP\001Z\014nitric/v1;v1\252\002\030Nitr" +
      "ic.Proto.Resource.v1\312\002\030Nitric\\Proto\\Reso" +
      "urce\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_nitric_resource_v1_PolicyResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nitric_resource_v1_PolicyResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_PolicyResource_descriptor,
        new java.lang.String[] { "Principals", "Actions", "Resources", });
    internal_static_nitric_resource_v1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nitric_resource_v1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_Resource_descriptor,
        new java.lang.String[] { "Type", "Name", });
    internal_static_nitric_resource_v1_ResourceDeclareRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nitric_resource_v1_ResourceDeclareRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_ResourceDeclareRequest_descriptor,
        new java.lang.String[] { "Resource", "Policy", "Bucket", "Queue", "Topic", "Collection", "Secret", "Api", "Config", });
    internal_static_nitric_resource_v1_BucketResource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nitric_resource_v1_BucketResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_BucketResource_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_resource_v1_QueueResource_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_nitric_resource_v1_QueueResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_QueueResource_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_resource_v1_TopicResource_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_nitric_resource_v1_TopicResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_TopicResource_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_resource_v1_CollectionResource_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_nitric_resource_v1_CollectionResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_CollectionResource_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_resource_v1_SecretResource_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_nitric_resource_v1_SecretResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_SecretResource_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_descriptor,
        new java.lang.String[] { "Issuer", "Audiences", });
    internal_static_nitric_resource_v1_ApiSecurityDefinition_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_nitric_resource_v1_ApiSecurityDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_ApiSecurityDefinition_descriptor,
        new java.lang.String[] { "Jwt", "Definition", });
    internal_static_nitric_resource_v1_ApiResource_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_nitric_resource_v1_ApiResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_ApiResource_descriptor,
        new java.lang.String[] { "SecurityDefinitions", "Security", });
    internal_static_nitric_resource_v1_ApiResource_SecurityDefinitionsEntry_descriptor =
      internal_static_nitric_resource_v1_ApiResource_descriptor.getNestedTypes().get(0);
    internal_static_nitric_resource_v1_ApiResource_SecurityDefinitionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_ApiResource_SecurityDefinitionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_nitric_resource_v1_ResourceDeclareResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_nitric_resource_v1_ResourceDeclareResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_resource_v1_ResourceDeclareResponse_descriptor,
        new java.lang.String[] { });
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
