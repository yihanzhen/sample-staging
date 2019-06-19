// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ListModelEvaluationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ListModelEvaluationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ModelEvaluation model_evaluation = 1;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.ModelEvaluation> 
      getModelEvaluationList();
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ModelEvaluation model_evaluation = 1;</code>
   */
  com.google.cloud.automl.v1beta1.ModelEvaluation getModelEvaluation(int index);
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ModelEvaluation model_evaluation = 1;</code>
   */
  int getModelEvaluationCount();
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ModelEvaluation model_evaluation = 1;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.ModelEvaluationOrBuilder> 
      getModelEvaluationOrBuilderList();
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ModelEvaluation model_evaluation = 1;</code>
   */
  com.google.cloud.automl.v1beta1.ModelEvaluationOrBuilder getModelEvaluationOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1beta1.ListModelEvaluationsRequest.page_token] field of a new
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations] request to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1beta1.ListModelEvaluationsRequest.page_token] field of a new
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations] request to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
