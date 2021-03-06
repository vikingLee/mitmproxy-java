// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mitm_hub_client.proto

package com.deep007.mitmproxyjava;

public interface MitmResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mitm.MitmResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mitm.MitmRequest request = 1;</code>
   */
  boolean hasRequest();
  /**
   * <code>.mitm.MitmRequest request = 1;</code>
   */
  com.deep007.mitmproxyjava.MitmRequest getRequest();
  /**
   * <code>.mitm.MitmRequest request = 1;</code>
   */
  com.deep007.mitmproxyjava.MitmRequestOrBuilder getRequestOrBuilder();

  /**
   * <code>repeated .mitm.MitmHeader headers = 2;</code>
   */
  java.util.List<com.deep007.mitmproxyjava.MitmHeader> 
      getHeadersList();
  /**
   * <code>repeated .mitm.MitmHeader headers = 2;</code>
   */
  com.deep007.mitmproxyjava.MitmHeader getHeaders(int index);
  /**
   * <code>repeated .mitm.MitmHeader headers = 2;</code>
   */
  int getHeadersCount();
  /**
   * <code>repeated .mitm.MitmHeader headers = 2;</code>
   */
  java.util.List<? extends com.deep007.mitmproxyjava.MitmHeaderOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <code>repeated .mitm.MitmHeader headers = 2;</code>
   */
  com.deep007.mitmproxyjava.MitmHeaderOrBuilder getHeadersOrBuilder(
      int index);

  /**
   * <code>bytes content = 3;</code>
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <code>int32 statusCode = 4;</code>
   */
  int getStatusCode();

  /**
   * <code>string mitmproxyId = 5;</code>
   */
  java.lang.String getMitmproxyId();
  /**
   * <code>string mitmproxyId = 5;</code>
   */
  com.google.protobuf.ByteString
      getMitmproxyIdBytes();
}
