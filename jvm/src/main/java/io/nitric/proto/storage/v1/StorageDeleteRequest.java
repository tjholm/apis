// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/storage/v1/storage.proto

package io.nitric.proto.storage.v1;

/**
 * <pre>
 * Request to delete a storage item
 * </pre>
 *
 * Protobuf type {@code nitric.storage.v1.StorageDeleteRequest}
 */
public final class StorageDeleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.storage.v1.StorageDeleteRequest)
    StorageDeleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StorageDeleteRequest.newBuilder() to construct.
  private StorageDeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StorageDeleteRequest() {
    bucketName_ = "";
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StorageDeleteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StorageDeleteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            bucketName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.storage.v1.Storages.internal_static_nitric_storage_v1_StorageDeleteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.storage.v1.Storages.internal_static_nitric_storage_v1_StorageDeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.storage.v1.StorageDeleteRequest.class, io.nitric.proto.storage.v1.StorageDeleteRequest.Builder.class);
  }

  public static final int BUCKET_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object bucketName_;
  /**
   * <pre>
   * Name of the bucket to delete from
   * </pre>
   *
   * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
   * @return The bucketName.
   */
  @java.lang.Override
  public java.lang.String getBucketName() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucketName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the bucket to delete from
   * </pre>
   *
   * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for bucketName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketNameBytes() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucketName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object key_;
  /**
   * <pre>
   * Key of item to delete
   * </pre>
   *
   * <code>string key = 2 [(.validate.rules) = { ... }</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Key of item to delete
   * </pre>
   *
   * <code>string key = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getBucketNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bucketName_);
    }
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBucketNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bucketName_);
    }
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.nitric.proto.storage.v1.StorageDeleteRequest)) {
      return super.equals(obj);
    }
    io.nitric.proto.storage.v1.StorageDeleteRequest other = (io.nitric.proto.storage.v1.StorageDeleteRequest) obj;

    if (!getBucketName()
        .equals(other.getBucketName())) return false;
    if (!getKey()
        .equals(other.getKey())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BUCKET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBucketName().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.storage.v1.StorageDeleteRequest parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.storage.v1.StorageDeleteRequest prototype) {
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
   * <pre>
   * Request to delete a storage item
   * </pre>
   *
   * Protobuf type {@code nitric.storage.v1.StorageDeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.storage.v1.StorageDeleteRequest)
      io.nitric.proto.storage.v1.StorageDeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.storage.v1.Storages.internal_static_nitric_storage_v1_StorageDeleteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.storage.v1.Storages.internal_static_nitric_storage_v1_StorageDeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.storage.v1.StorageDeleteRequest.class, io.nitric.proto.storage.v1.StorageDeleteRequest.Builder.class);
    }

    // Construct using io.nitric.proto.storage.v1.StorageDeleteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bucketName_ = "";

      key_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.storage.v1.Storages.internal_static_nitric_storage_v1_StorageDeleteRequest_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.storage.v1.StorageDeleteRequest getDefaultInstanceForType() {
      return io.nitric.proto.storage.v1.StorageDeleteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.storage.v1.StorageDeleteRequest build() {
      io.nitric.proto.storage.v1.StorageDeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.storage.v1.StorageDeleteRequest buildPartial() {
      io.nitric.proto.storage.v1.StorageDeleteRequest result = new io.nitric.proto.storage.v1.StorageDeleteRequest(this);
      result.bucketName_ = bucketName_;
      result.key_ = key_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.nitric.proto.storage.v1.StorageDeleteRequest) {
        return mergeFrom((io.nitric.proto.storage.v1.StorageDeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.storage.v1.StorageDeleteRequest other) {
      if (other == io.nitric.proto.storage.v1.StorageDeleteRequest.getDefaultInstance()) return this;
      if (!other.getBucketName().isEmpty()) {
        bucketName_ = other.bucketName_;
        onChanged();
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.nitric.proto.storage.v1.StorageDeleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.storage.v1.StorageDeleteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bucketName_ = "";
    /**
     * <pre>
     * Name of the bucket to delete from
     * </pre>
     *
     * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
     * @return The bucketName.
     */
    public java.lang.String getBucketName() {
      java.lang.Object ref = bucketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the bucket to delete from
     * </pre>
     *
     * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for bucketName.
     */
    public com.google.protobuf.ByteString
        getBucketNameBytes() {
      java.lang.Object ref = bucketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the bucket to delete from
     * </pre>
     *
     * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bucketName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the bucket to delete from
     * </pre>
     *
     * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBucketName() {
      
      bucketName_ = getDefaultInstance().getBucketName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the bucket to delete from
     * </pre>
     *
     * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bucketName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * Key of item to delete
     * </pre>
     *
     * <code>string key = 2 [(.validate.rules) = { ... }</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Key of item to delete
     * </pre>
     *
     * <code>string key = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Key of item to delete
     * </pre>
     *
     * <code>string key = 2 [(.validate.rules) = { ... }</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key of item to delete
     * </pre>
     *
     * <code>string key = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key of item to delete
     * </pre>
     *
     * <code>string key = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
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


    // @@protoc_insertion_point(builder_scope:nitric.storage.v1.StorageDeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:nitric.storage.v1.StorageDeleteRequest)
  private static final io.nitric.proto.storage.v1.StorageDeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.storage.v1.StorageDeleteRequest();
  }

  public static io.nitric.proto.storage.v1.StorageDeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StorageDeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<StorageDeleteRequest>() {
    @java.lang.Override
    public StorageDeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StorageDeleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StorageDeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StorageDeleteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.storage.v1.StorageDeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

