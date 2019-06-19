# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: google/cloud/automl/v1beta1/prediction_service.proto for package 'google.cloud.automl.v1beta1'
# Original file comments:
# Copyright 2019 Google LLC.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
#

require 'grpc'
require 'google/cloud/automl/v1beta1/prediction_service_pb'

module Google
  module Cloud
    module Automl
      module V1beta1
        module PredictionService
          # AutoML Prediction API.
          #
          # On any input that is documented to expect a string parameter in
          # snake_case or kebab-case, either of those cases is accepted.
          class Service

            include GRPC::GenericService

            self.marshal_class_method = :encode
            self.unmarshal_class_method = :decode
            self.service_name = 'google.cloud.automl.v1beta1.PredictionService'

            # Perform an online prediction. The prediction result will be directly
            # returned in the response.
            # Available for following ML problems, and their expected request payloads:
            # * Image Classification - Image in .JPEG, .GIF or .PNG format, image_bytes
            #                          up to 30MB.
            # * Image Object Detection - Image in .JPEG, .GIF or .PNG format, image_bytes
            #                            up to 30MB.
            # * Text Classification - TextSnippet, content up to 60,000 characters,
            #                         UTF-8 encoded.
            # * Text Extraction - TextSnippet, content up to 30,000 characters,
            #                     UTF-8 NFC encoded.
            # * Translation - TextSnippet, content up to 25,000 characters, UTF-8
            #                 encoded.
            # * Tables - Row, with column values matching the columns of the model,
            #            up to 5MB. Not available for FORECASTING
            #
            # [prediction_type][google.cloud.automl.v1beta1.TablesModelMetadata.prediction_type].
            rpc :Predict, PredictRequest, PredictResponse
            # Perform a batch prediction. Unlike the online [Predict][google.cloud.automl.v1beta1.PredictionService.Predict], batch
            # prediction result won't be immediately available in the response. Instead,
            # a long running operation object is returned. User can poll the operation
            # result via [GetOperation][google.longrunning.Operations.GetOperation]
            # method. Once the operation is done, [BatchPredictResult][google.cloud.automl.v1beta1.BatchPredictResult] is returned in
            # the [response][google.longrunning.Operation.response] field.
            # Available for following ML problems:
            # * Video Classification
            # * Video Object Tracking
            # * Text Extraction
            # * Tables
            rpc :BatchPredict, BatchPredictRequest, Google::Longrunning::Operation
          end

          Stub = Service.rpc_stub_class
        end
      end
    end
  end
end
