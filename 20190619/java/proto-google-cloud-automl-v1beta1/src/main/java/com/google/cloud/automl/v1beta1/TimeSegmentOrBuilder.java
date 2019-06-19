// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/temporal.proto

package com.google.cloud.automl.v1beta1;

public interface TimeSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TimeSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Start of the time segment (inclusive), represented as the duration since
   * the example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  boolean hasStartTimeOffset();
  /**
   * <pre>
   * Start of the time segment (inclusive), represented as the duration since
   * the example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  com.google.protobuf.Duration getStartTimeOffset();
  /**
   * <pre>
   * Start of the time segment (inclusive), represented as the duration since
   * the example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder();

  /**
   * <pre>
   * End of the time segment (exclusive), represented as the duration since the
   * example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  boolean hasEndTimeOffset();
  /**
   * <pre>
   * End of the time segment (exclusive), represented as the duration since the
   * example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  com.google.protobuf.Duration getEndTimeOffset();
  /**
   * <pre>
   * End of the time segment (exclusive), represented as the duration since the
   * example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOffsetOrBuilder();
}