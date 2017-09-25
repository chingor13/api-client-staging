// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/app_yaml.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Methods to restrict access to a URL based on login status.
 * </pre>
 *
 * Protobuf enum {@code google.appengine.v1.LoginRequirement}
 */
public enum LoginRequirement
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not specified. `LOGIN_OPTIONAL` is assumed.
   * </pre>
   *
   * <code>LOGIN_UNSPECIFIED = 0;</code>
   */
  LOGIN_UNSPECIFIED(0),
  /**
   * <pre>
   * Does not require that the user is signed in.
   * </pre>
   *
   * <code>LOGIN_OPTIONAL = 1;</code>
   */
  LOGIN_OPTIONAL(1),
  /**
   * <pre>
   * If the user is not signed in, the `auth_fail_action` is taken.
   * In addition, if the user is not an administrator for the
   * application, they are given an error message regardless of
   * `auth_fail_action`. If the user is an administrator, the handler
   * proceeds.
   * </pre>
   *
   * <code>LOGIN_ADMIN = 2;</code>
   */
  LOGIN_ADMIN(2),
  /**
   * <pre>
   * If the user has signed in, the handler proceeds normally. Otherwise, the
   * auth_fail_action is taken.
   * </pre>
   *
   * <code>LOGIN_REQUIRED = 3;</code>
   */
  LOGIN_REQUIRED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not specified. `LOGIN_OPTIONAL` is assumed.
   * </pre>
   *
   * <code>LOGIN_UNSPECIFIED = 0;</code>
   */
  public static final int LOGIN_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Does not require that the user is signed in.
   * </pre>
   *
   * <code>LOGIN_OPTIONAL = 1;</code>
   */
  public static final int LOGIN_OPTIONAL_VALUE = 1;
  /**
   * <pre>
   * If the user is not signed in, the `auth_fail_action` is taken.
   * In addition, if the user is not an administrator for the
   * application, they are given an error message regardless of
   * `auth_fail_action`. If the user is an administrator, the handler
   * proceeds.
   * </pre>
   *
   * <code>LOGIN_ADMIN = 2;</code>
   */
  public static final int LOGIN_ADMIN_VALUE = 2;
  /**
   * <pre>
   * If the user has signed in, the handler proceeds normally. Otherwise, the
   * auth_fail_action is taken.
   * </pre>
   *
   * <code>LOGIN_REQUIRED = 3;</code>
   */
  public static final int LOGIN_REQUIRED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LoginRequirement valueOf(int value) {
    return forNumber(value);
  }

  public static LoginRequirement forNumber(int value) {
    switch (value) {
      case 0: return LOGIN_UNSPECIFIED;
      case 1: return LOGIN_OPTIONAL;
      case 2: return LOGIN_ADMIN;
      case 3: return LOGIN_REQUIRED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LoginRequirement>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LoginRequirement> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LoginRequirement>() {
          public LoginRequirement findValueByNumber(int number) {
            return LoginRequirement.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.appengine.v1.AppYamlProto.getDescriptor()
        .getEnumTypes().get(1);
  }

  private static final LoginRequirement[] VALUES = values();

  public static LoginRequirement valueOf(
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

  private LoginRequirement(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.appengine.v1.LoginRequirement)
}

