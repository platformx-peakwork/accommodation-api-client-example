// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: offerdata.proto

package com.peakwork.api.accommodation.v1.offerdata;

public interface PaxCountRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:peakwork.api.accommodation.v1.offerdata.PaxCountRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * optional - default: 1 - The lower bound (closed) of the given pax count range.
   * </pre>
   *
   * <code>int32 min_count = 1;</code>
   */
  int getMinCount();

  /**
   * <pre>
   * optional - default: 15 - The upper bound (closed) of the given pax count range.
   * </pre>
   *
   * <code>int32 max_count = 2;</code>
   */
  int getMaxCount();
}