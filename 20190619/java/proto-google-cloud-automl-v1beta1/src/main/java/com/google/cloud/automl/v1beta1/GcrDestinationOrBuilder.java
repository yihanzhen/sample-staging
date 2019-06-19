// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

public interface GcrDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.GcrDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Contained Registry URI of the new image, up to 2000
   * characters long. See
   * https:
   * //cloud.google.com/container-registry/do
   * // cs/pushing-and-pulling#pushing_an_image_to_a_registry
   * Accepted forms:
   * * [HOSTNAME]/[PROJECT-ID]/[IMAGE]
   * * [HOSTNAME]/[PROJECT-ID]/[IMAGE]:[TAG]
   * The requesting user must have permission to push images the project.
   * </pre>
   *
   * <code>string output_uri = 1;</code>
   */
  java.lang.String getOutputUri();
  /**
   * <pre>
   * Required. Google Contained Registry URI of the new image, up to 2000
   * characters long. See
   * https:
   * //cloud.google.com/container-registry/do
   * // cs/pushing-and-pulling#pushing_an_image_to_a_registry
   * Accepted forms:
   * * [HOSTNAME]/[PROJECT-ID]/[IMAGE]
   * * [HOSTNAME]/[PROJECT-ID]/[IMAGE]:[TAG]
   * The requesting user must have permission to push images the project.
   * </pre>
   *
   * <code>string output_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getOutputUriBytes();
}
