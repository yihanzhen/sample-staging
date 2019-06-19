// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

public interface DocumentInputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.DocumentInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * Max supported size: 512MB.
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * Max supported size: 512MB.
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsSource getGcsSource();
  /**
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * Max supported size: 512MB.
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();
}
