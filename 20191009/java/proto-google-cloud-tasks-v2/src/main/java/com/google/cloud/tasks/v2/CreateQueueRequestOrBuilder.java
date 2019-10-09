// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/cloudtasks.proto

package com.google.cloud.tasks.v2;

public interface CreateQueueRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.CreateQueueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The location name in which the queue will be created.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   * The list of allowed locations can be obtained by calling Cloud
   * Tasks' implementation of
   * [ListLocations][google.cloud.location.Locations.ListLocations].
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The location name in which the queue will be created.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   * The list of allowed locations can be obtained by calling Cloud
   * Tasks' implementation of
   * [ListLocations][google.cloud.location.Locations.ListLocations].
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The queue to create.
   * [Queue's name][google.cloud.tasks.v2.Queue.name] cannot be the same as an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue queue = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasQueue();
  /**
   * <pre>
   * Required. The queue to create.
   * [Queue's name][google.cloud.tasks.v2.Queue.name] cannot be the same as an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue queue = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.tasks.v2.Queue getQueue();
  /**
   * <pre>
   * Required. The queue to create.
   * [Queue's name][google.cloud.tasks.v2.Queue.name] cannot be the same as an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Queue queue = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.tasks.v2.QueueOrBuilder getQueueOrBuilder();
}
