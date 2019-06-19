// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/detection.proto

package com.google.cloud.automl.v1beta1;

public interface BoundingBoxMetricsEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.BoundingBoxMetricsEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The intersection-over-union threshold value used to compute
   * this metrics entry.
   * </pre>
   *
   * <code>float iou_threshold = 1;</code>
   */
  float getIouThreshold();

  /**
   * <pre>
   * Output only. The mean average precision, most often close to au_prc.
   * </pre>
   *
   * <code>float mean_average_precision = 2;</code>
   */
  float getMeanAveragePrecision();

  /**
   * <pre>
   * Output only. Metrics for each label-match confidence_threshold from
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99. Precision-recall curve is
   * derived from them.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntry confidence_metrics_entries = 3;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntry> 
      getConfidenceMetricsEntriesList();
  /**
   * <pre>
   * Output only. Metrics for each label-match confidence_threshold from
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99. Precision-recall curve is
   * derived from them.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntry confidence_metrics_entries = 3;</code>
   */
  com.google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntry getConfidenceMetricsEntries(int index);
  /**
   * <pre>
   * Output only. Metrics for each label-match confidence_threshold from
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99. Precision-recall curve is
   * derived from them.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntry confidence_metrics_entries = 3;</code>
   */
  int getConfidenceMetricsEntriesCount();
  /**
   * <pre>
   * Output only. Metrics for each label-match confidence_threshold from
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99. Precision-recall curve is
   * derived from them.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntry confidence_metrics_entries = 3;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntryOrBuilder> 
      getConfidenceMetricsEntriesOrBuilderList();
  /**
   * <pre>
   * Output only. Metrics for each label-match confidence_threshold from
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99. Precision-recall curve is
   * derived from them.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntry confidence_metrics_entries = 3;</code>
   */
  com.google.cloud.automl.v1beta1.BoundingBoxMetricsEntry.ConfidenceMetricsEntryOrBuilder getConfidenceMetricsEntriesOrBuilder(
      int index);
}
