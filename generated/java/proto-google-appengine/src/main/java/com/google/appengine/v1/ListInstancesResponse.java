// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Response message for `Instances.ListInstances`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ListInstancesResponse}
 */
public  final class ListInstancesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ListInstancesResponse)
    ListInstancesResponseOrBuilder {
  // Use ListInstancesResponse.newBuilder() to construct.
  private ListInstancesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInstancesResponse() {
    instances_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListInstancesResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              instances_ = new java.util.ArrayList<com.google.appengine.v1.Instance>();
              mutable_bitField0_ |= 0x00000001;
            }
            instances_.add(
                input.readMessage(com.google.appengine.v1.Instance.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        instances_ = java.util.Collections.unmodifiableList(instances_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListInstancesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListInstancesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ListInstancesResponse.class, com.google.appengine.v1.ListInstancesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCES_FIELD_NUMBER = 1;
  private java.util.List<com.google.appengine.v1.Instance> instances_;
  /**
   * <pre>
   * The instances belonging to the requested version.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
   */
  public java.util.List<com.google.appengine.v1.Instance> getInstancesList() {
    return instances_;
  }
  /**
   * <pre>
   * The instances belonging to the requested version.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
   */
  public java.util.List<? extends com.google.appengine.v1.InstanceOrBuilder> 
      getInstancesOrBuilderList() {
    return instances_;
  }
  /**
   * <pre>
   * The instances belonging to the requested version.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
   */
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   * <pre>
   * The instances belonging to the requested version.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
   */
  public com.google.appengine.v1.Instance getInstances(int index) {
    return instances_.get(index);
  }
  /**
   * <pre>
   * The instances belonging to the requested version.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
   */
  public com.google.appengine.v1.InstanceOrBuilder getInstancesOrBuilder(
      int index) {
    return instances_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < instances_.size(); i++) {
      output.writeMessage(1, instances_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, instances_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.appengine.v1.ListInstancesResponse)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ListInstancesResponse other = (com.google.appengine.v1.ListInstancesResponse) obj;

    boolean result = true;
    result = result && getInstancesList()
        .equals(other.getInstancesList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ListInstancesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ListInstancesResponse parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.ListInstancesResponse prototype) {
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
   * Response message for `Instances.ListInstances`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ListInstancesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ListInstancesResponse)
      com.google.appengine.v1.ListInstancesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListInstancesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListInstancesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ListInstancesResponse.class, com.google.appengine.v1.ListInstancesResponse.Builder.class);
    }

    // Construct using com.google.appengine.v1.ListInstancesResponse.newBuilder()
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
        getInstancesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        instancesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListInstancesResponse_descriptor;
    }

    public com.google.appengine.v1.ListInstancesResponse getDefaultInstanceForType() {
      return com.google.appengine.v1.ListInstancesResponse.getDefaultInstance();
    }

    public com.google.appengine.v1.ListInstancesResponse build() {
      com.google.appengine.v1.ListInstancesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.ListInstancesResponse buildPartial() {
      com.google.appengine.v1.ListInstancesResponse result = new com.google.appengine.v1.ListInstancesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (instancesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          instances_ = java.util.Collections.unmodifiableList(instances_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instances_ = instances_;
      } else {
        result.instances_ = instancesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.appengine.v1.ListInstancesResponse) {
        return mergeFrom((com.google.appengine.v1.ListInstancesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ListInstancesResponse other) {
      if (other == com.google.appengine.v1.ListInstancesResponse.getDefaultInstance()) return this;
      if (instancesBuilder_ == null) {
        if (!other.instances_.isEmpty()) {
          if (instances_.isEmpty()) {
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstancesIsMutable();
            instances_.addAll(other.instances_);
          }
          onChanged();
        }
      } else {
        if (!other.instances_.isEmpty()) {
          if (instancesBuilder_.isEmpty()) {
            instancesBuilder_.dispose();
            instancesBuilder_ = null;
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInstancesFieldBuilder() : null;
          } else {
            instancesBuilder_.addAllMessages(other.instances_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.appengine.v1.ListInstancesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.ListInstancesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.appengine.v1.Instance> instances_ =
      java.util.Collections.emptyList();
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        instances_ = new java.util.ArrayList<com.google.appengine.v1.Instance>(instances_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.appengine.v1.Instance, com.google.appengine.v1.Instance.Builder, com.google.appengine.v1.InstanceOrBuilder> instancesBuilder_;

    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.Instance> getInstancesList() {
      if (instancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instances_);
      } else {
        return instancesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public int getInstancesCount() {
      if (instancesBuilder_ == null) {
        return instances_.size();
      } else {
        return instancesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public com.google.appengine.v1.Instance getInstances(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder setInstances(
        int index, com.google.appengine.v1.Instance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.set(index, value);
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder setInstances(
        int index, com.google.appengine.v1.Instance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.set(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder addInstances(com.google.appengine.v1.Instance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder addInstances(
        int index, com.google.appengine.v1.Instance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(index, value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder addInstances(
        com.google.appengine.v1.Instance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder addInstances(
        int index, com.google.appengine.v1.Instance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder addAllInstances(
        java.lang.Iterable<? extends com.google.appengine.v1.Instance> values) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instances_);
        onChanged();
      } else {
        instancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder clearInstances() {
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public Builder removeInstances(int index) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.remove(index);
        onChanged();
      } else {
        instancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public com.google.appengine.v1.Instance.Builder getInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public com.google.appengine.v1.InstanceOrBuilder getInstancesOrBuilder(
        int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);  } else {
        return instancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public java.util.List<? extends com.google.appengine.v1.InstanceOrBuilder> 
         getInstancesOrBuilderList() {
      if (instancesBuilder_ != null) {
        return instancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instances_);
      }
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public com.google.appengine.v1.Instance.Builder addInstancesBuilder() {
      return getInstancesFieldBuilder().addBuilder(
          com.google.appengine.v1.Instance.getDefaultInstance());
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public com.google.appengine.v1.Instance.Builder addInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().addBuilder(
          index, com.google.appengine.v1.Instance.getDefaultInstance());
    }
    /**
     * <pre>
     * The instances belonging to the requested version.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Instance instances = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.Instance.Builder> 
         getInstancesBuilderList() {
      return getInstancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.appengine.v1.Instance, com.google.appengine.v1.Instance.Builder, com.google.appengine.v1.InstanceOrBuilder> 
        getInstancesFieldBuilder() {
      if (instancesBuilder_ == null) {
        instancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.appengine.v1.Instance, com.google.appengine.v1.Instance.Builder, com.google.appengine.v1.InstanceOrBuilder>(
                instances_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        instances_ = null;
      }
      return instancesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ListInstancesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ListInstancesResponse)
  private static final com.google.appengine.v1.ListInstancesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ListInstancesResponse();
  }

  public static com.google.appengine.v1.ListInstancesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInstancesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInstancesResponse>() {
    public ListInstancesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListInstancesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListInstancesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInstancesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.ListInstancesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

