// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

/**
 * Protobuf type {@code nitric.resource.v1.ApiResource}
 */
public final class ApiResource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.resource.v1.ApiResource)
    ApiResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiResource.newBuilder() to construct.
  private ApiResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiResource() {
    security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiResource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApiResource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              securityDefinitions_ = com.google.protobuf.MapField.newMapField(
                  SecurityDefinitionsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
            securityDefinitions__ = input.readMessage(
                SecurityDefinitionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            securityDefinitions_.getMutableMap().put(
                securityDefinitions__.getKey(), securityDefinitions__.getValue());
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              security_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            security_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        security_ = security_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetSecurityDefinitions();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.resource.v1.ApiResource.class, io.nitric.proto.resource.v1.ApiResource.Builder.class);
  }

  public static final int SECURITY_DEFINITIONS_FIELD_NUMBER = 1;
  private static final class SecurityDefinitionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>newDefaultInstance(
                io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_SecurityDefinitionsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.nitric.proto.resource.v1.ApiSecurityDefinition.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> securityDefinitions_;
  private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
  internalGetSecurityDefinitions() {
    if (securityDefinitions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SecurityDefinitionsDefaultEntryHolder.defaultEntry);
    }
    return securityDefinitions_;
  }

  public int getSecurityDefinitionsCount() {
    return internalGetSecurityDefinitions().getMap().size();
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */

  @java.lang.Override
  public boolean containsSecurityDefinitions(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetSecurityDefinitions().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSecurityDefinitionsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitions() {
    return getSecurityDefinitionsMap();
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitionsMap() {
    return internalGetSecurityDefinitions().getMap();
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  @java.lang.Override

  public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrDefault(
      java.lang.String key,
      io.nitric.proto.resource.v1.ApiSecurityDefinition defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
        internalGetSecurityDefinitions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  @java.lang.Override

  public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
        internalGetSecurityDefinitions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SECURITY_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList security_;
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>repeated string security = 2;</code>
   * @return A list containing the security.
   */
  public com.google.protobuf.ProtocolStringList
      getSecurityList() {
    return security_;
  }
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>repeated string security = 2;</code>
   * @return The count of security.
   */
  public int getSecurityCount() {
    return security_.size();
  }
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>repeated string security = 2;</code>
   * @param index The index of the element to return.
   * @return The security at the given index.
   */
  public java.lang.String getSecurity(int index) {
    return security_.get(index);
  }
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>repeated string security = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the security at the given index.
   */
  public com.google.protobuf.ByteString
      getSecurityBytes(int index) {
    return security_.getByteString(index);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSecurityDefinitions(),
        SecurityDefinitionsDefaultEntryHolder.defaultEntry,
        1);
    for (int i = 0; i < security_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, security_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> entry
         : internalGetSecurityDefinitions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
      securityDefinitions__ = SecurityDefinitionsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, securityDefinitions__);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < security_.size(); i++) {
        dataSize += computeStringSizeNoTag(security_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSecurityList().size();
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
    if (!(obj instanceof io.nitric.proto.resource.v1.ApiResource)) {
      return super.equals(obj);
    }
    io.nitric.proto.resource.v1.ApiResource other = (io.nitric.proto.resource.v1.ApiResource) obj;

    if (!internalGetSecurityDefinitions().equals(
        other.internalGetSecurityDefinitions())) return false;
    if (!getSecurityList()
        .equals(other.getSecurityList())) return false;
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
    if (!internalGetSecurityDefinitions().getMap().isEmpty()) {
      hash = (37 * hash) + SECURITY_DEFINITIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSecurityDefinitions().hashCode();
    }
    if (getSecurityCount() > 0) {
      hash = (37 * hash) + SECURITY_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.resource.v1.ApiResource prototype) {
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
   * Protobuf type {@code nitric.resource.v1.ApiResource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.resource.v1.ApiResource)
      io.nitric.proto.resource.v1.ApiResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetSecurityDefinitions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableSecurityDefinitions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.resource.v1.ApiResource.class, io.nitric.proto.resource.v1.ApiResource.Builder.class);
    }

    // Construct using io.nitric.proto.resource.v1.ApiResource.newBuilder()
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
      internalGetMutableSecurityDefinitions().clear();
      security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiResource getDefaultInstanceForType() {
      return io.nitric.proto.resource.v1.ApiResource.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiResource build() {
      io.nitric.proto.resource.v1.ApiResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiResource buildPartial() {
      io.nitric.proto.resource.v1.ApiResource result = new io.nitric.proto.resource.v1.ApiResource(this);
      int from_bitField0_ = bitField0_;
      result.securityDefinitions_ = internalGetSecurityDefinitions();
      result.securityDefinitions_.makeImmutable();
      if (((bitField0_ & 0x00000002) != 0)) {
        security_ = security_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.security_ = security_;
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
      if (other instanceof io.nitric.proto.resource.v1.ApiResource) {
        return mergeFrom((io.nitric.proto.resource.v1.ApiResource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.resource.v1.ApiResource other) {
      if (other == io.nitric.proto.resource.v1.ApiResource.getDefaultInstance()) return this;
      internalGetMutableSecurityDefinitions().mergeFrom(
          other.internalGetSecurityDefinitions());
      if (!other.security_.isEmpty()) {
        if (security_.isEmpty()) {
          security_ = other.security_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureSecurityIsMutable();
          security_.addAll(other.security_);
        }
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
      io.nitric.proto.resource.v1.ApiResource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.resource.v1.ApiResource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> securityDefinitions_;
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
    internalGetSecurityDefinitions() {
      if (securityDefinitions_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SecurityDefinitionsDefaultEntryHolder.defaultEntry);
      }
      return securityDefinitions_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
    internalGetMutableSecurityDefinitions() {
      onChanged();;
      if (securityDefinitions_ == null) {
        securityDefinitions_ = com.google.protobuf.MapField.newMapField(
            SecurityDefinitionsDefaultEntryHolder.defaultEntry);
      }
      if (!securityDefinitions_.isMutable()) {
        securityDefinitions_ = securityDefinitions_.copy();
      }
      return securityDefinitions_;
    }

    public int getSecurityDefinitionsCount() {
      return internalGetSecurityDefinitions().getMap().size();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */

    @java.lang.Override
    public boolean containsSecurityDefinitions(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetSecurityDefinitions().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSecurityDefinitionsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitions() {
      return getSecurityDefinitionsMap();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitionsMap() {
      return internalGetSecurityDefinitions().getMap();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    @java.lang.Override

    public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrDefault(
        java.lang.String key,
        io.nitric.proto.resource.v1.ApiSecurityDefinition defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
          internalGetSecurityDefinitions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    @java.lang.Override

    public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
          internalGetSecurityDefinitions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearSecurityDefinitions() {
      internalGetMutableSecurityDefinitions().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */

    public Builder removeSecurityDefinitions(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableSecurityDefinitions().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
    getMutableSecurityDefinitions() {
      return internalGetMutableSecurityDefinitions().getMutableMap();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    public Builder putSecurityDefinitions(
        java.lang.String key,
        io.nitric.proto.resource.v1.ApiSecurityDefinition value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableSecurityDefinitions().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */

    public Builder putAllSecurityDefinitions(
        java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> values) {
      internalGetMutableSecurityDefinitions().getMutableMap()
          .putAll(values);
      return this;
    }

    private com.google.protobuf.LazyStringList security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSecurityIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        security_ = new com.google.protobuf.LazyStringArrayList(security_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @return A list containing the security.
     */
    public com.google.protobuf.ProtocolStringList
        getSecurityList() {
      return security_.getUnmodifiableView();
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @return The count of security.
     */
    public int getSecurityCount() {
      return security_.size();
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @param index The index of the element to return.
     * @return The security at the given index.
     */
    public java.lang.String getSecurity(int index) {
      return security_.get(index);
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the security at the given index.
     */
    public com.google.protobuf.ByteString
        getSecurityBytes(int index) {
      return security_.getByteString(index);
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @param index The index to set the value at.
     * @param value The security to set.
     * @return This builder for chaining.
     */
    public Builder setSecurity(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSecurityIsMutable();
      security_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @param value The security to add.
     * @return This builder for chaining.
     */
    public Builder addSecurity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSecurityIsMutable();
      security_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @param values The security to add.
     * @return This builder for chaining.
     */
    public Builder addAllSecurity(
        java.lang.Iterable<java.lang.String> values) {
      ensureSecurityIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, security_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurity() {
      security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>repeated string security = 2;</code>
     * @param value The bytes of the security to add.
     * @return This builder for chaining.
     */
    public Builder addSecurityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSecurityIsMutable();
      security_.add(value);
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


    // @@protoc_insertion_point(builder_scope:nitric.resource.v1.ApiResource)
  }

  // @@protoc_insertion_point(class_scope:nitric.resource.v1.ApiResource)
  private static final io.nitric.proto.resource.v1.ApiResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.resource.v1.ApiResource();
  }

  public static io.nitric.proto.resource.v1.ApiResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiResource>
      PARSER = new com.google.protobuf.AbstractParser<ApiResource>() {
    @java.lang.Override
    public ApiResource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApiResource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApiResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.resource.v1.ApiResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

