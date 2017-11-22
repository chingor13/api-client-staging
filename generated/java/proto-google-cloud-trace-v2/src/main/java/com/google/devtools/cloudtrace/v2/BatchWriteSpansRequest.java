// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/tracing.proto

package com.google.devtools.cloudtrace.v2;

/**
 * <pre>
 * The request message for the `BatchWriteSpans` method.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v2.BatchWriteSpansRequest}
 */
public  final class BatchWriteSpansRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
    BatchWriteSpansRequestOrBuilder {
  // Use BatchWriteSpansRequest.newBuilder() to construct.
  private BatchWriteSpansRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchWriteSpansRequest() {
    name_ = "";
    spans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BatchWriteSpansRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              spans_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v2.Span>();
              mutable_bitField0_ |= 0x00000002;
            }
            spans_.add(
                input.readMessage(com.google.devtools.cloudtrace.v2.Span.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        spans_ = java.util.Collections.unmodifiableList(spans_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.class, com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Name of the project where the spans belong. The format is
   * `projects/PROJECT_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Name of the project where the spans belong. The format is
   * `projects/PROJECT_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPANS_FIELD_NUMBER = 2;
  private java.util.List<com.google.devtools.cloudtrace.v2.Span> spans_;
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  public java.util.List<com.google.devtools.cloudtrace.v2.Span> getSpansList() {
    return spans_;
  }
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  public java.util.List<? extends com.google.devtools.cloudtrace.v2.SpanOrBuilder> 
      getSpansOrBuilderList() {
    return spans_;
  }
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  public int getSpansCount() {
    return spans_.size();
  }
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  public com.google.devtools.cloudtrace.v2.Span getSpans(int index) {
    return spans_.get(index);
  }
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  public com.google.devtools.cloudtrace.v2.SpanOrBuilder getSpansOrBuilder(
      int index) {
    return spans_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < spans_.size(); i++) {
      output.writeMessage(2, spans_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < spans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, spans_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest other = (com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getSpansList()
        .equals(other.getSpansList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getSpansCount() > 0) {
      hash = (37 * hash) + SPANS_FIELD_NUMBER;
      hash = (53 * hash) + getSpansList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * The request message for the `BatchWriteSpans` method.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v2.BatchWriteSpansRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
      com.google.devtools.cloudtrace.v2.BatchWriteSpansRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.class, com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.newBuilder()
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
        getSpansFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        spansBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor;
    }

    public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.getDefaultInstance();
    }

    public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest build() {
      com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest buildPartial() {
      com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest result = new com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (spansBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          spans_ = java.util.Collections.unmodifiableList(spans_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.spans_ = spans_;
      } else {
        result.spans_ = spansBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest) {
        return mergeFrom((com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest other) {
      if (other == com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (spansBuilder_ == null) {
        if (!other.spans_.isEmpty()) {
          if (spans_.isEmpty()) {
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSpansIsMutable();
            spans_.addAll(other.spans_);
          }
          onChanged();
        }
      } else {
        if (!other.spans_.isEmpty()) {
          if (spansBuilder_.isEmpty()) {
            spansBuilder_.dispose();
            spansBuilder_ = null;
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000002);
            spansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSpansFieldBuilder() : null;
          } else {
            spansBuilder_.addAllMessages(other.spans_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Name of the project where the spans belong. The format is
     * `projects/PROJECT_ID`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the project where the spans belong. The format is
     * `projects/PROJECT_ID`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the project where the spans belong. The format is
     * `projects/PROJECT_ID`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the project where the spans belong. The format is
     * `projects/PROJECT_ID`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the project where the spans belong. The format is
     * `projects/PROJECT_ID`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.devtools.cloudtrace.v2.Span> spans_ =
      java.util.Collections.emptyList();
    private void ensureSpansIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        spans_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v2.Span>(spans_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.Span, com.google.devtools.cloudtrace.v2.Span.Builder, com.google.devtools.cloudtrace.v2.SpanOrBuilder> spansBuilder_;

    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v2.Span> getSpansList() {
      if (spansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(spans_);
      } else {
        return spansBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public int getSpansCount() {
      if (spansBuilder_ == null) {
        return spans_.size();
      } else {
        return spansBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.Span getSpans(int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);
      } else {
        return spansBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder setSpans(
        int index, com.google.devtools.cloudtrace.v2.Span value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.set(index, value);
        onChanged();
      } else {
        spansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder setSpans(
        int index, com.google.devtools.cloudtrace.v2.Span.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.set(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder addSpans(com.google.devtools.cloudtrace.v2.Span value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(value);
        onChanged();
      } else {
        spansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder addSpans(
        int index, com.google.devtools.cloudtrace.v2.Span value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(index, value);
        onChanged();
      } else {
        spansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder addSpans(
        com.google.devtools.cloudtrace.v2.Span.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder addSpans(
        int index, com.google.devtools.cloudtrace.v2.Span.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder addAllSpans(
        java.lang.Iterable<? extends com.google.devtools.cloudtrace.v2.Span> values) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, spans_);
        onChanged();
      } else {
        spansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder clearSpans() {
      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        spansBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public Builder removeSpans(int index) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.remove(index);
        onChanged();
      } else {
        spansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.Span.Builder getSpansBuilder(
        int index) {
      return getSpansFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.SpanOrBuilder getSpansOrBuilder(
        int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);  } else {
        return spansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public java.util.List<? extends com.google.devtools.cloudtrace.v2.SpanOrBuilder> 
         getSpansOrBuilderList() {
      if (spansBuilder_ != null) {
        return spansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(spans_);
      }
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.Span.Builder addSpansBuilder() {
      return getSpansFieldBuilder().addBuilder(
          com.google.devtools.cloudtrace.v2.Span.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.Span.Builder addSpansBuilder(
        int index) {
      return getSpansFieldBuilder().addBuilder(
          index, com.google.devtools.cloudtrace.v2.Span.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of spans.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v2.Span.Builder> 
         getSpansBuilderList() {
      return getSpansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.Span, com.google.devtools.cloudtrace.v2.Span.Builder, com.google.devtools.cloudtrace.v2.SpanOrBuilder> 
        getSpansFieldBuilder() {
      if (spansBuilder_ == null) {
        spansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.Span, com.google.devtools.cloudtrace.v2.Span.Builder, com.google.devtools.cloudtrace.v2.SpanOrBuilder>(
                spans_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        spans_ = null;
      }
      return spansBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    public final Builder setNameWithProjectName(com.google.devtools.cloudtrace.v2.ProjectName value) {
      if (value == null) {
        return setName("");
      }
      return setName(value.toString());
    }
    
    public final com.google.devtools.cloudtrace.v2.ProjectName getNameAsProjectName() {
      java.lang.String str = getName();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.devtools.cloudtrace.v2.ProjectName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
  }

  public final com.google.devtools.cloudtrace.v2.ProjectName getNameAsProjectName() {
    java.lang.String str = getName();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.devtools.cloudtrace.v2.ProjectName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
  private static final com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest();
  }

  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchWriteSpansRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchWriteSpansRequest>() {
    public BatchWriteSpansRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BatchWriteSpansRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BatchWriteSpansRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchWriteSpansRequest> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
