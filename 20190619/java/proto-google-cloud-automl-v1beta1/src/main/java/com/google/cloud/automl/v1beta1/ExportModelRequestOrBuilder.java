// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ExportModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ExportModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the model to export.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the model to export.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ModelExportOutputConfig output_config = 3;</code>
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ModelExportOutputConfig output_config = 3;</code>
   */
  com.google.cloud.automl.v1beta1.ModelExportOutputConfig getOutputConfig();
  /**
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ModelExportOutputConfig output_config = 3;</code>
   */
  com.google.cloud.automl.v1beta1.ModelExportOutputConfigOrBuilder getOutputConfigOrBuilder();
}
