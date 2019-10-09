// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/task.proto

package com.google.cloud.tasks.v2;

public interface AttemptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.Attempt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The time that this attempt was scheduled.
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 1;</code>
   */
  boolean hasScheduleTime();
  /**
   * <pre>
   * Output only. The time that this attempt was scheduled.
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 1;</code>
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   * <pre>
   * Output only. The time that this attempt was scheduled.
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time that this attempt was dispatched.
   * `dispatch_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dispatch_time = 2;</code>
   */
  boolean hasDispatchTime();
  /**
   * <pre>
   * Output only. The time that this attempt was dispatched.
   * `dispatch_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dispatch_time = 2;</code>
   */
  com.google.protobuf.Timestamp getDispatchTime();
  /**
   * <pre>
   * Output only. The time that this attempt was dispatched.
   * `dispatch_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dispatch_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDispatchTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time that this attempt response was received.
   * `response_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp response_time = 3;</code>
   */
  boolean hasResponseTime();
  /**
   * <pre>
   * Output only. The time that this attempt response was received.
   * `response_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp response_time = 3;</code>
   */
  com.google.protobuf.Timestamp getResponseTime();
  /**
   * <pre>
   * Output only. The time that this attempt response was received.
   * `response_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp response_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getResponseTimeOrBuilder();

  /**
   * <pre>
   * Output only. The response from the worker for this attempt.
   * If `response_time` is unset, then the task has not been attempted or is
   * currently running and the `response_status` field is meaningless.
   * </pre>
   *
   * <code>.google.rpc.Status response_status = 4;</code>
   */
  boolean hasResponseStatus();
  /**
   * <pre>
   * Output only. The response from the worker for this attempt.
   * If `response_time` is unset, then the task has not been attempted or is
   * currently running and the `response_status` field is meaningless.
   * </pre>
   *
   * <code>.google.rpc.Status response_status = 4;</code>
   */
  com.google.rpc.Status getResponseStatus();
  /**
   * <pre>
   * Output only. The response from the worker for this attempt.
   * If `response_time` is unset, then the task has not been attempted or is
   * currently running and the `response_status` field is meaningless.
   * </pre>
   *
   * <code>.google.rpc.Status response_status = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getResponseStatusOrBuilder();
}
