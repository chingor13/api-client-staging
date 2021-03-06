// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

public interface NetworkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Network)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  java.util.List<java.lang.String>
      getForwardedPortsList();
  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  int getForwardedPortsCount();
  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  java.lang.String getForwardedPorts(int index);
  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  com.google.protobuf.ByteString
      getForwardedPortsBytes(int index);

  /**
   * <pre>
   * Tag to apply to the VM instance during creation.
   * </pre>
   *
   * <code>string instance_tag = 2;</code>
   */
  java.lang.String getInstanceTag();
  /**
   * <pre>
   * Tag to apply to the VM instance during creation.
   * </pre>
   *
   * <code>string instance_tag = 2;</code>
   */
  com.google.protobuf.ByteString
      getInstanceTagBytes();

  /**
   * <pre>
   * Google Cloud Platform network where the virtual machines are created.
   * Specify the short name, not the resource path.
   * Defaults to `default`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Google Cloud Platform network where the virtual machines are created.
   * Specify the short name, not the resource path.
   * Defaults to `default`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
