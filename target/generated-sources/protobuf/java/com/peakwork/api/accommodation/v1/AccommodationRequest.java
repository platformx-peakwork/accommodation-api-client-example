// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: accommodation-api.proto

package com.peakwork.api.accommodation.v1;

/**
 * <pre>
 * A message containing information about an accommodation entity. The payload's semantic depends on the
 * type of call, that it belongs to, e.g. see UpsertAccommodation.
 * </pre>
 *
 * Protobuf type {@code peakwork.api.accommodation.v1.AccommodationRequest}
 */
public  final class AccommodationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:peakwork.api.accommodation.v1.AccommodationRequest)
    AccommodationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccommodationRequest.newBuilder() to construct.
  private AccommodationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccommodationRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccommodationRequest(
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
            com.peakwork.api.accommodation.v1.basedata.Accommodation.Builder subBuilder = null;
            if (accommodation_ != null) {
              subBuilder = accommodation_.toBuilder();
            }
            accommodation_ = input.readMessage(com.peakwork.api.accommodation.v1.basedata.Accommodation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accommodation_);
              accommodation_ = subBuilder.buildPartial();
            }

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
    return com.peakwork.api.accommodation.v1.AccommodationApi.internal_static_peakwork_api_accommodation_v1_AccommodationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.peakwork.api.accommodation.v1.AccommodationApi.internal_static_peakwork_api_accommodation_v1_AccommodationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.peakwork.api.accommodation.v1.AccommodationRequest.class, com.peakwork.api.accommodation.v1.AccommodationRequest.Builder.class);
  }

  public static final int ACCOMMODATION_FIELD_NUMBER = 1;
  private com.peakwork.api.accommodation.v1.basedata.Accommodation accommodation_;
  /**
   * <pre>
   * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
   * e.g. for updating purposes.
   * </pre>
   *
   * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
   */
  public boolean hasAccommodation() {
    return accommodation_ != null;
  }
  /**
   * <pre>
   * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
   * e.g. for updating purposes.
   * </pre>
   *
   * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
   */
  public com.peakwork.api.accommodation.v1.basedata.Accommodation getAccommodation() {
    return accommodation_ == null ? com.peakwork.api.accommodation.v1.basedata.Accommodation.getDefaultInstance() : accommodation_;
  }
  /**
   * <pre>
   * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
   * e.g. for updating purposes.
   * </pre>
   *
   * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
   */
  public com.peakwork.api.accommodation.v1.basedata.AccommodationOrBuilder getAccommodationOrBuilder() {
    return getAccommodation();
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
    if (accommodation_ != null) {
      output.writeMessage(1, getAccommodation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accommodation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccommodation());
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
    if (!(obj instanceof com.peakwork.api.accommodation.v1.AccommodationRequest)) {
      return super.equals(obj);
    }
    com.peakwork.api.accommodation.v1.AccommodationRequest other = (com.peakwork.api.accommodation.v1.AccommodationRequest) obj;

    if (hasAccommodation() != other.hasAccommodation()) return false;
    if (hasAccommodation()) {
      if (!getAccommodation()
          .equals(other.getAccommodation())) return false;
    }
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
    if (hasAccommodation()) {
      hash = (37 * hash) + ACCOMMODATION_FIELD_NUMBER;
      hash = (53 * hash) + getAccommodation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.peakwork.api.accommodation.v1.AccommodationRequest parseFrom(
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
  public static Builder newBuilder(com.peakwork.api.accommodation.v1.AccommodationRequest prototype) {
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
   * A message containing information about an accommodation entity. The payload's semantic depends on the
   * type of call, that it belongs to, e.g. see UpsertAccommodation.
   * </pre>
   *
   * Protobuf type {@code peakwork.api.accommodation.v1.AccommodationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:peakwork.api.accommodation.v1.AccommodationRequest)
      com.peakwork.api.accommodation.v1.AccommodationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.peakwork.api.accommodation.v1.AccommodationApi.internal_static_peakwork_api_accommodation_v1_AccommodationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.peakwork.api.accommodation.v1.AccommodationApi.internal_static_peakwork_api_accommodation_v1_AccommodationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.peakwork.api.accommodation.v1.AccommodationRequest.class, com.peakwork.api.accommodation.v1.AccommodationRequest.Builder.class);
    }

    // Construct using com.peakwork.api.accommodation.v1.AccommodationRequest.newBuilder()
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
      if (accommodationBuilder_ == null) {
        accommodation_ = null;
      } else {
        accommodation_ = null;
        accommodationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.peakwork.api.accommodation.v1.AccommodationApi.internal_static_peakwork_api_accommodation_v1_AccommodationRequest_descriptor;
    }

    @java.lang.Override
    public com.peakwork.api.accommodation.v1.AccommodationRequest getDefaultInstanceForType() {
      return com.peakwork.api.accommodation.v1.AccommodationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.peakwork.api.accommodation.v1.AccommodationRequest build() {
      com.peakwork.api.accommodation.v1.AccommodationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.peakwork.api.accommodation.v1.AccommodationRequest buildPartial() {
      com.peakwork.api.accommodation.v1.AccommodationRequest result = new com.peakwork.api.accommodation.v1.AccommodationRequest(this);
      if (accommodationBuilder_ == null) {
        result.accommodation_ = accommodation_;
      } else {
        result.accommodation_ = accommodationBuilder_.build();
      }
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
      if (other instanceof com.peakwork.api.accommodation.v1.AccommodationRequest) {
        return mergeFrom((com.peakwork.api.accommodation.v1.AccommodationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.peakwork.api.accommodation.v1.AccommodationRequest other) {
      if (other == com.peakwork.api.accommodation.v1.AccommodationRequest.getDefaultInstance()) return this;
      if (other.hasAccommodation()) {
        mergeAccommodation(other.getAccommodation());
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
      com.peakwork.api.accommodation.v1.AccommodationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.peakwork.api.accommodation.v1.AccommodationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.peakwork.api.accommodation.v1.basedata.Accommodation accommodation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.peakwork.api.accommodation.v1.basedata.Accommodation, com.peakwork.api.accommodation.v1.basedata.Accommodation.Builder, com.peakwork.api.accommodation.v1.basedata.AccommodationOrBuilder> accommodationBuilder_;
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public boolean hasAccommodation() {
      return accommodationBuilder_ != null || accommodation_ != null;
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public com.peakwork.api.accommodation.v1.basedata.Accommodation getAccommodation() {
      if (accommodationBuilder_ == null) {
        return accommodation_ == null ? com.peakwork.api.accommodation.v1.basedata.Accommodation.getDefaultInstance() : accommodation_;
      } else {
        return accommodationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public Builder setAccommodation(com.peakwork.api.accommodation.v1.basedata.Accommodation value) {
      if (accommodationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accommodation_ = value;
        onChanged();
      } else {
        accommodationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public Builder setAccommodation(
        com.peakwork.api.accommodation.v1.basedata.Accommodation.Builder builderForValue) {
      if (accommodationBuilder_ == null) {
        accommodation_ = builderForValue.build();
        onChanged();
      } else {
        accommodationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public Builder mergeAccommodation(com.peakwork.api.accommodation.v1.basedata.Accommodation value) {
      if (accommodationBuilder_ == null) {
        if (accommodation_ != null) {
          accommodation_ =
            com.peakwork.api.accommodation.v1.basedata.Accommodation.newBuilder(accommodation_).mergeFrom(value).buildPartial();
        } else {
          accommodation_ = value;
        }
        onChanged();
      } else {
        accommodationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public Builder clearAccommodation() {
      if (accommodationBuilder_ == null) {
        accommodation_ = null;
        onChanged();
      } else {
        accommodation_ = null;
        accommodationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public com.peakwork.api.accommodation.v1.basedata.Accommodation.Builder getAccommodationBuilder() {
      
      onChanged();
      return getAccommodationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    public com.peakwork.api.accommodation.v1.basedata.AccommodationOrBuilder getAccommodationOrBuilder() {
      if (accommodationBuilder_ != null) {
        return accommodationBuilder_.getMessageOrBuilder();
      } else {
        return accommodation_ == null ?
            com.peakwork.api.accommodation.v1.basedata.Accommodation.getDefaultInstance() : accommodation_;
      }
    }
    /**
     * <pre>
     * Accommodation entity including base data belonging to the request. This field contains the data to be sent,
     * e.g. for updating purposes.
     * </pre>
     *
     * <code>.peakwork.api.accommodation.v1.basedata.Accommodation accommodation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.peakwork.api.accommodation.v1.basedata.Accommodation, com.peakwork.api.accommodation.v1.basedata.Accommodation.Builder, com.peakwork.api.accommodation.v1.basedata.AccommodationOrBuilder> 
        getAccommodationFieldBuilder() {
      if (accommodationBuilder_ == null) {
        accommodationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.peakwork.api.accommodation.v1.basedata.Accommodation, com.peakwork.api.accommodation.v1.basedata.Accommodation.Builder, com.peakwork.api.accommodation.v1.basedata.AccommodationOrBuilder>(
                getAccommodation(),
                getParentForChildren(),
                isClean());
        accommodation_ = null;
      }
      return accommodationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:peakwork.api.accommodation.v1.AccommodationRequest)
  }

  // @@protoc_insertion_point(class_scope:peakwork.api.accommodation.v1.AccommodationRequest)
  private static final com.peakwork.api.accommodation.v1.AccommodationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.peakwork.api.accommodation.v1.AccommodationRequest();
  }

  public static com.peakwork.api.accommodation.v1.AccommodationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccommodationRequest>
      PARSER = new com.google.protobuf.AbstractParser<AccommodationRequest>() {
    @java.lang.Override
    public AccommodationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccommodationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccommodationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccommodationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.peakwork.api.accommodation.v1.AccommodationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
