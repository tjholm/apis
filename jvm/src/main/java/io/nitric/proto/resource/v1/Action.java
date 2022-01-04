// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

/**
 * Protobuf enum {@code nitric.resource.v1.Action}
 */
public enum Action
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Bucket Permissions: 0XX
   * </pre>
   *
   * <code>BucketFileList = 0;</code>
   */
  BucketFileList(0),
  /**
   * <code>BucketFileGet = 1;</code>
   */
  BucketFileGet(1),
  /**
   * <code>BucketFilePut = 2;</code>
   */
  BucketFilePut(2),
  /**
   * <code>BucketFileDelete = 3;</code>
   */
  BucketFileDelete(3),
  /**
   * <pre>
   * Topic Permissions: 2XX
   * </pre>
   *
   * <code>TopicList = 200;</code>
   */
  TopicList(200),
  /**
   * <code>TopicDetail = 201;</code>
   */
  TopicDetail(201),
  /**
   * <code>TopicEventPublish = 202;</code>
   */
  TopicEventPublish(202),
  /**
   * <pre>
   * Queue Permissions: 3XX
   * </pre>
   *
   * <code>QueueSend = 300;</code>
   */
  QueueSend(300),
  /**
   * <code>QueueReceive = 301;</code>
   */
  QueueReceive(301),
  /**
   * <code>QueueList = 302;</code>
   */
  QueueList(302),
  /**
   * <code>QueueDetail = 303;</code>
   */
  QueueDetail(303),
  /**
   * <pre>
   * Collection Permissions: 4XX
   * </pre>
   *
   * <code>CollectionDocumentRead = 400;</code>
   */
  CollectionDocumentRead(400),
  /**
   * <code>CollectionDocumentWrite = 401;</code>
   */
  CollectionDocumentWrite(401),
  /**
   * <code>CollectionDocumentDelete = 402;</code>
   */
  CollectionDocumentDelete(402),
  /**
   * <code>CollectionQuery = 403;</code>
   */
  CollectionQuery(403),
  /**
   * <code>CollectionList = 404;</code>
   */
  CollectionList(404),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Bucket Permissions: 0XX
   * </pre>
   *
   * <code>BucketFileList = 0;</code>
   */
  public static final int BucketFileList_VALUE = 0;
  /**
   * <code>BucketFileGet = 1;</code>
   */
  public static final int BucketFileGet_VALUE = 1;
  /**
   * <code>BucketFilePut = 2;</code>
   */
  public static final int BucketFilePut_VALUE = 2;
  /**
   * <code>BucketFileDelete = 3;</code>
   */
  public static final int BucketFileDelete_VALUE = 3;
  /**
   * <pre>
   * Topic Permissions: 2XX
   * </pre>
   *
   * <code>TopicList = 200;</code>
   */
  public static final int TopicList_VALUE = 200;
  /**
   * <code>TopicDetail = 201;</code>
   */
  public static final int TopicDetail_VALUE = 201;
  /**
   * <code>TopicEventPublish = 202;</code>
   */
  public static final int TopicEventPublish_VALUE = 202;
  /**
   * <pre>
   * Queue Permissions: 3XX
   * </pre>
   *
   * <code>QueueSend = 300;</code>
   */
  public static final int QueueSend_VALUE = 300;
  /**
   * <code>QueueReceive = 301;</code>
   */
  public static final int QueueReceive_VALUE = 301;
  /**
   * <code>QueueList = 302;</code>
   */
  public static final int QueueList_VALUE = 302;
  /**
   * <code>QueueDetail = 303;</code>
   */
  public static final int QueueDetail_VALUE = 303;
  /**
   * <pre>
   * Collection Permissions: 4XX
   * </pre>
   *
   * <code>CollectionDocumentRead = 400;</code>
   */
  public static final int CollectionDocumentRead_VALUE = 400;
  /**
   * <code>CollectionDocumentWrite = 401;</code>
   */
  public static final int CollectionDocumentWrite_VALUE = 401;
  /**
   * <code>CollectionDocumentDelete = 402;</code>
   */
  public static final int CollectionDocumentDelete_VALUE = 402;
  /**
   * <code>CollectionQuery = 403;</code>
   */
  public static final int CollectionQuery_VALUE = 403;
  /**
   * <code>CollectionList = 404;</code>
   */
  public static final int CollectionList_VALUE = 404;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Action valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Action forNumber(int value) {
    switch (value) {
      case 0: return BucketFileList;
      case 1: return BucketFileGet;
      case 2: return BucketFilePut;
      case 3: return BucketFileDelete;
      case 200: return TopicList;
      case 201: return TopicDetail;
      case 202: return TopicEventPublish;
      case 300: return QueueSend;
      case 301: return QueueReceive;
      case 302: return QueueList;
      case 303: return QueueDetail;
      case 400: return CollectionDocumentRead;
      case 401: return CollectionDocumentWrite;
      case 402: return CollectionDocumentDelete;
      case 403: return CollectionQuery;
      case 404: return CollectionList;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Action>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Action> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Action>() {
          public Action findValueByNumber(int number) {
            return Action.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.nitric.proto.resource.v1.Resources.getDescriptor().getEnumTypes().get(1);
  }

  private static final Action[] VALUES = values();

  public static Action valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Action(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:nitric.resource.v1.Action)
}

