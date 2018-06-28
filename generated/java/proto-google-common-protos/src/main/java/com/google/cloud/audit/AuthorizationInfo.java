// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

/**
 * <pre>
 * Authorization information for the operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.audit.AuthorizationInfo}
 */
public  final class AuthorizationInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.audit.AuthorizationInfo)
    AuthorizationInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthorizationInfo.newBuilder() to construct.
  private AuthorizationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthorizationInfo() {
    resource_ = "";
    permission_ = "";
    granted_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthorizationInfo(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resource_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            permission_ = s;
            break;
          }
          case 24: {

            granted_ = input.readBool();
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
    return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.audit.AuthorizationInfo.class, com.google.cloud.audit.AuthorizationInfo.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object resource_;
  /**
   * <pre>
   * The resource being accessed, as a REST-style string. For example:
   *     bigquery.googlapis.com/projects/PROJECTID/datasets/DATASETID
   * </pre>
   *
   * <code>string resource = 1;</code>
   */
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource being accessed, as a REST-style string. For example:
   *     bigquery.googlapis.com/projects/PROJECTID/datasets/DATASETID
   * </pre>
   *
   * <code>string resource = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object permission_;
  /**
   * <pre>
   * The required IAM permission.
   * </pre>
   *
   * <code>string permission = 2;</code>
   */
  public java.lang.String getPermission() {
    java.lang.Object ref = permission_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      permission_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The required IAM permission.
   * </pre>
   *
   * <code>string permission = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPermissionBytes() {
    java.lang.Object ref = permission_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      permission_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRANTED_FIELD_NUMBER = 3;
  private boolean granted_;
  /**
   * <pre>
   * Whether or not authorization for `resource` and `permission`
   * was granted.
   * </pre>
   *
   * <code>bool granted = 3;</code>
   */
  public boolean getGranted() {
    return granted_;
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
    if (!getResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resource_);
    }
    if (!getPermissionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, permission_);
    }
    if (granted_ != false) {
      output.writeBool(3, granted_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resource_);
    }
    if (!getPermissionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, permission_);
    }
    if (granted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, granted_);
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
    if (!(obj instanceof com.google.cloud.audit.AuthorizationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.audit.AuthorizationInfo other = (com.google.cloud.audit.AuthorizationInfo) obj;

    boolean result = true;
    result = result && getResource()
        .equals(other.getResource());
    result = result && getPermission()
        .equals(other.getPermission());
    result = result && (getGranted()
        == other.getGranted());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (37 * hash) + PERMISSION_FIELD_NUMBER;
    hash = (53 * hash) + getPermission().hashCode();
    hash = (37 * hash) + GRANTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGranted());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.AuthorizationInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.audit.AuthorizationInfo prototype) {
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
   * Authorization information for the operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.audit.AuthorizationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.audit.AuthorizationInfo)
      com.google.cloud.audit.AuthorizationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.audit.AuthorizationInfo.class, com.google.cloud.audit.AuthorizationInfo.Builder.class);
    }

    // Construct using com.google.cloud.audit.AuthorizationInfo.newBuilder()
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
    public Builder clear() {
      super.clear();
      resource_ = "";

      permission_ = "";

      granted_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_descriptor;
    }

    public com.google.cloud.audit.AuthorizationInfo getDefaultInstanceForType() {
      return com.google.cloud.audit.AuthorizationInfo.getDefaultInstance();
    }

    public com.google.cloud.audit.AuthorizationInfo build() {
      com.google.cloud.audit.AuthorizationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.audit.AuthorizationInfo buildPartial() {
      com.google.cloud.audit.AuthorizationInfo result = new com.google.cloud.audit.AuthorizationInfo(this);
      result.resource_ = resource_;
      result.permission_ = permission_;
      result.granted_ = granted_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.audit.AuthorizationInfo) {
        return mergeFrom((com.google.cloud.audit.AuthorizationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.audit.AuthorizationInfo other) {
      if (other == com.google.cloud.audit.AuthorizationInfo.getDefaultInstance()) return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (!other.getPermission().isEmpty()) {
        permission_ = other.permission_;
        onChanged();
      }
      if (other.getGranted() != false) {
        setGranted(other.getGranted());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.audit.AuthorizationInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.audit.AuthorizationInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     * <pre>
     * The resource being accessed, as a REST-style string. For example:
     *     bigquery.googlapis.com/projects/PROJECTID/datasets/DATASETID
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource being accessed, as a REST-style string. For example:
     *     bigquery.googlapis.com/projects/PROJECTID/datasets/DATASETID
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource being accessed, as a REST-style string. For example:
     *     bigquery.googlapis.com/projects/PROJECTID/datasets/DATASETID
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource being accessed, as a REST-style string. For example:
     *     bigquery.googlapis.com/projects/PROJECTID/datasets/DATASETID
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public Builder clearResource() {
      
      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource being accessed, as a REST-style string. For example:
     *     bigquery.googlapis.com/projects/PROJECTID/datasets/DATASETID
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resource_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object permission_ = "";
    /**
     * <pre>
     * The required IAM permission.
     * </pre>
     *
     * <code>string permission = 2;</code>
     */
    public java.lang.String getPermission() {
      java.lang.Object ref = permission_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        permission_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The required IAM permission.
     * </pre>
     *
     * <code>string permission = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPermissionBytes() {
      java.lang.Object ref = permission_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        permission_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The required IAM permission.
     * </pre>
     *
     * <code>string permission = 2;</code>
     */
    public Builder setPermission(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      permission_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The required IAM permission.
     * </pre>
     *
     * <code>string permission = 2;</code>
     */
    public Builder clearPermission() {
      
      permission_ = getDefaultInstance().getPermission();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The required IAM permission.
     * </pre>
     *
     * <code>string permission = 2;</code>
     */
    public Builder setPermissionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      permission_ = value;
      onChanged();
      return this;
    }

    private boolean granted_ ;
    /**
     * <pre>
     * Whether or not authorization for `resource` and `permission`
     * was granted.
     * </pre>
     *
     * <code>bool granted = 3;</code>
     */
    public boolean getGranted() {
      return granted_;
    }
    /**
     * <pre>
     * Whether or not authorization for `resource` and `permission`
     * was granted.
     * </pre>
     *
     * <code>bool granted = 3;</code>
     */
    public Builder setGranted(boolean value) {
      
      granted_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not authorization for `resource` and `permission`
     * was granted.
     * </pre>
     *
     * <code>bool granted = 3;</code>
     */
    public Builder clearGranted() {
      
      granted_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.audit.AuthorizationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.audit.AuthorizationInfo)
  private static final com.google.cloud.audit.AuthorizationInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.audit.AuthorizationInfo();
  }

  public static com.google.cloud.audit.AuthorizationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthorizationInfo>
      PARSER = new com.google.protobuf.AbstractParser<AuthorizationInfo>() {
    public AuthorizationInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthorizationInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthorizationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthorizationInfo> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.audit.AuthorizationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
