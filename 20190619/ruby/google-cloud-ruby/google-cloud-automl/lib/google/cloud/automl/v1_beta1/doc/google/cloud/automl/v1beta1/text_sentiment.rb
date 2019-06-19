# Copyright 2019 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

module Google
  module Cloud
    module Automl
      module V1beta1
        # Contains annotation details specific to text sentiment.
        # @!attribute [rw] sentiment
        #   @return [Integer]
        #     Output only. The sentiment with the semantic, as given to the
        #     {Google::Cloud::Automl::V1beta1::AutoMl::ImportData AutoMl::ImportData} when populating the dataset from which the model used
        #     for the prediction had been trained.
        #     The sentiment values are between 0 and
        #     Dataset.text_sentiment_dataset_metadata.sentiment_max (inclusive),
        #     with higher value meaning more positive sentiment. They are completely
        #     relative, i.e. 0 means least positive sentiment and sentiment_max means
        #     the most positive from the sentiments present in the train data. Therefore
        #      e.g. if train data had only negative sentiment, then sentiment_max, would
        #     be still negative (although least negative).
        #     The sentiment shouldn't be confused with "score" or "magnitude"
        #     from the previous Natural Language Sentiment Analysis API.
        class TextSentimentAnnotation; end

        # Model evaluation metrics for text sentiment problems.
        # @!attribute [rw] precision
        #   @return [Float]
        #     Output only. Precision.
        # @!attribute [rw] recall
        #   @return [Float]
        #     Output only. Recall.
        # @!attribute [rw] f1_score
        #   @return [Float]
        #     Output only. The harmonic mean of recall and precision.
        # @!attribute [rw] mean_absolute_error
        #   @return [Float]
        #     Output only. Mean absolute error. Only set for the overall model
        #     evaluation, not for evaluation of a single annotation spec.
        # @!attribute [rw] mean_squared_error
        #   @return [Float]
        #     Output only. Mean squared error. Only set for the overall model
        #     evaluation, not for evaluation of a single annotation spec.
        # @!attribute [rw] linear_kappa
        #   @return [Float]
        #     Output only. Linear weighted kappa. Only set for the overall model
        #     evaluation, not for evaluation of a single annotation spec.
        # @!attribute [rw] quadratic_kappa
        #   @return [Float]
        #     Output only. Quadratic weighted kappa. Only set for the overall model
        #     evaluation, not for evaluation of a single annotation spec.
        # @!attribute [rw] confusion_matrix
        #   @return [Google::Cloud::Automl::V1beta1::ClassificationEvaluationMetrics::ConfusionMatrix]
        #     Output only. Confusion matrix of the evaluation.
        #     Only set for the overall model evaluation, not for evaluation of a single
        #     annotation spec.
        # @!attribute [rw] annotation_spec_id
        #   @return [Array<String>]
        #     Output only. The annotation spec ids used for this evaluation.
        #     Deprecated .
        class TextSentimentEvaluationMetrics; end
      end
    end
  end
end