// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * Protobuf type {@code nitric.faas.v1.ApiWorkerOptions}
 */
public final class ApiWorkerOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.ApiWorkerOptions)
    ApiWorkerOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiWorkerOptions.newBuilder() to construct.
  private ApiWorkerOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiWorkerOptions() {
    security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiWorkerOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApiWorkerOptions(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              security_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            security_.add(s);
            break;
          }
          case 16: {

            securityDisabled_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        security_ = security_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorkerOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorkerOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.ApiWorkerOptions.class, io.nitric.proto.faas.v1.ApiWorkerOptions.Builder.class);
  }

  public static final int SECURITY_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList security_;
  /**
   * <pre>
   * Apply security definitions to this operation
   * </pre>
   *
   * <code>repeated string security = 1;</code>
   * @return A list containing the security.
   */
  public com.google.protobuf.ProtocolStringList
      getSecurityList() {
    return security_;
  }
  /**
   * <pre>
   * Apply security definitions to this operation
   * </pre>
   *
   * <code>repeated string security = 1;</code>
   * @return The count of security.
   */
  public int getSecurityCount() {
    return security_.size();
  }
  /**
   * <pre>
   * Apply security definitions to this operation
   * </pre>
   *
   * <code>repeated string security = 1;</code>
   * @param index The index of the element to return.
   * @return The security at the given index.
   */
  public java.lang.String getSecurity(int index) {
    return security_.get(index);
  }
  /**
   * <pre>
   * Apply security definitions to this operation
   * </pre>
   *
   * <code>repeated string security = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the security at the given index.
   */
  public com.google.protobuf.ByteString
      getSecurityBytes(int index) {
    return security_.getByteString(index);
  }

  public static final int SECURITY_DISABLED_FIELD_NUMBER = 2;
  private boolean securityDisabled_;
  /**
   * <pre>
   * explicitly disable security for this endpoint
   * We need to do this as the default value of a repeated field
   * is always empty so there is no way of knowing if security is explicitly disabled
   * </pre>
   *
   * <code>bool security_disabled = 2;</code>
   * @return The securityDisabled.
   */
  @java.lang.Override
  public boolean getSecurityDisabled() {
    return securityDisabled_;
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
    for (int i = 0; i < security_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, security_.getRaw(i));
    }
    if (securityDisabled_ != false) {
      output.writeBool(2, securityDisabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < security_.size(); i++) {
        dataSize += computeStringSizeNoTag(security_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSecurityList().size();
    }
    if (securityDisabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, securityDisabled_);
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
    if (!(obj instanceof io.nitric.proto.faas.v1.ApiWorkerOptions)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.ApiWorkerOptions other = (io.nitric.proto.faas.v1.ApiWorkerOptions) obj;

    if (!getSecurityList()
        .equals(other.getSecurityList())) return false;
    if (getSecurityDisabled()
        != other.getSecurityDisabled()) return false;
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
    if (getSecurityCount() > 0) {
      hash = (37 * hash) + SECURITY_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityList().hashCode();
    }
    hash = (37 * hash) + SECURITY_DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSecurityDisabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ApiWorkerOptions parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.faas.v1.ApiWorkerOptions prototype) {
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
   * Protobuf type {@code nitric.faas.v1.ApiWorkerOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.ApiWorkerOptions)
      io.nitric.proto.faas.v1.ApiWorkerOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorkerOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorkerOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.ApiWorkerOptions.class, io.nitric.proto.faas.v1.ApiWorkerOptions.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.ApiWorkerOptions.newBuilder()
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
      security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      securityDisabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorkerOptions_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ApiWorkerOptions getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.ApiWorkerOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ApiWorkerOptions build() {
      io.nitric.proto.faas.v1.ApiWorkerOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ApiWorkerOptions buildPartial() {
      io.nitric.proto.faas.v1.ApiWorkerOptions result = new io.nitric.proto.faas.v1.ApiWorkerOptions(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        security_ = security_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.security_ = security_;
      result.securityDisabled_ = securityDisabled_;
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
      if (other instanceof io.nitric.proto.faas.v1.ApiWorkerOptions) {
        return mergeFrom((io.nitric.proto.faas.v1.ApiWorkerOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.ApiWorkerOptions other) {
      if (other == io.nitric.proto.faas.v1.ApiWorkerOptions.getDefaultInstance()) return this;
      if (!other.security_.isEmpty()) {
        if (security_.isEmpty()) {
          security_ = other.security_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSecurityIsMutable();
          security_.addAll(other.security_);
        }
        onChanged();
      }
      if (other.getSecurityDisabled() != false) {
        setSecurityDisabled(other.getSecurityDisabled());
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
      io.nitric.proto.faas.v1.ApiWorkerOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.faas.v1.ApiWorkerOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSecurityIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        security_ = new com.google.protobuf.LazyStringArrayList(security_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
     * @return A list containing the security.
     */
    public com.google.protobuf.ProtocolStringList
        getSecurityList() {
      return security_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
     * @return The count of security.
     */
    public int getSecurityCount() {
      return security_.size();
    }
    /**
     * <pre>
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
     * @param index The index of the element to return.
     * @return The security at the given index.
     */
    public java.lang.String getSecurity(int index) {
      return security_.get(index);
    }
    /**
     * <pre>
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the security at the given index.
     */
    public com.google.protobuf.ByteString
        getSecurityBytes(int index) {
      return security_.getByteString(index);
    }
    /**
     * <pre>
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
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
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
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
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
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
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurity() {
      security_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Apply security definitions to this operation
     * </pre>
     *
     * <code>repeated string security = 1;</code>
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

    private boolean securityDisabled_ ;
    /**
     * <pre>
     * explicitly disable security for this endpoint
     * We need to do this as the default value of a repeated field
     * is always empty so there is no way of knowing if security is explicitly disabled
     * </pre>
     *
     * <code>bool security_disabled = 2;</code>
     * @return The securityDisabled.
     */
    @java.lang.Override
    public boolean getSecurityDisabled() {
      return securityDisabled_;
    }
    /**
     * <pre>
     * explicitly disable security for this endpoint
     * We need to do this as the default value of a repeated field
     * is always empty so there is no way of knowing if security is explicitly disabled
     * </pre>
     *
     * <code>bool security_disabled = 2;</code>
     * @param value The securityDisabled to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityDisabled(boolean value) {
      
      securityDisabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * explicitly disable security for this endpoint
     * We need to do this as the default value of a repeated field
     * is always empty so there is no way of knowing if security is explicitly disabled
     * </pre>
     *
     * <code>bool security_disabled = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityDisabled() {
      
      securityDisabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.ApiWorkerOptions)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.ApiWorkerOptions)
  private static final io.nitric.proto.faas.v1.ApiWorkerOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.ApiWorkerOptions();
  }

  public static io.nitric.proto.faas.v1.ApiWorkerOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiWorkerOptions>
      PARSER = new com.google.protobuf.AbstractParser<ApiWorkerOptions>() {
    @java.lang.Override
    public ApiWorkerOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApiWorkerOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApiWorkerOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiWorkerOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.ApiWorkerOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

