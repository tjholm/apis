// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

/**
 * Protobuf enum {@code nitric.resource.v1.ResourceType}
 */
public enum ResourceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Api = 0;</code>
   */
  Api(0),
  /**
   * <code>Function = 1;</code>
   */
  Function(1),
  /**
   * <code>Bucket = 2;</code>
   */
  Bucket(2),
  /**
   * <code>Queue = 3;</code>
   */
  Queue(3),
  /**
   * <code>Topic = 4;</code>
   */
  Topic(4),
  /**
   * <code>Schedule = 5;</code>
   */
  Schedule(5),
  /**
   * <code>Subscription = 6;</code>
   */
  Subscription(6),
  /**
   * <code>Collection = 7;</code>
   */
  Collection(7),
  /**
   * <code>Policy = 8;</code>
   */
  Policy(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Api = 0;</code>
   */
  public static final int Api_VALUE = 0;
  /**
   * <code>Function = 1;</code>
   */
  public static final int Function_VALUE = 1;
  /**
   * <code>Bucket = 2;</code>
   */
  public static final int Bucket_VALUE = 2;
  /**
   * <code>Queue = 3;</code>
   */
  public static final int Queue_VALUE = 3;
  /**
   * <code>Topic = 4;</code>
   */
  public static final int Topic_VALUE = 4;
  /**
   * <code>Schedule = 5;</code>
   */
  public static final int Schedule_VALUE = 5;
  /**
   * <code>Subscription = 6;</code>
   */
  public static final int Subscription_VALUE = 6;
  /**
   * <code>Collection = 7;</code>
   */
  public static final int Collection_VALUE = 7;
  /**
   * <code>Policy = 8;</code>
   */
  public static final int Policy_VALUE = 8;


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
  public static ResourceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResourceType forNumber(int value) {
    switch (value) {
      case 0: return Api;
      case 1: return Function;
      case 2: return Bucket;
      case 3: return Queue;
      case 4: return Topic;
      case 5: return Schedule;
      case 6: return Subscription;
      case 7: return Collection;
      case 8: return Policy;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResourceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
          public ResourceType findValueByNumber(int number) {
            return ResourceType.forNumber(number);
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
    return io.nitric.proto.resource.v1.Resources.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResourceType[] VALUES = values();

  public static ResourceType valueOf(
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

  private ResourceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:nitric.resource.v1.ResourceType)
}

