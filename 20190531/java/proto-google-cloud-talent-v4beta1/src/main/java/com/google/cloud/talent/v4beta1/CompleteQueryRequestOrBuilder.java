// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/completion_service.proto

package com.google.cloud.talent.v4beta1;

public interface CompleteQueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CompleteQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * Resource name of tenant the completion is performed within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenant/foo".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required.
   * Resource name of tenant the completion is performed within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenant/foo".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required.
   * The query used to generate suggestions.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Required.
   * The query used to generate suggestions.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Optional.
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * For [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME] type,
   * only companies having open jobs with the same [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are
   * returned.
   * For [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  java.util.List<java.lang.String>
      getLanguageCodesList();
  /**
   * <pre>
   * Optional.
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * For [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME] type,
   * only companies having open jobs with the same [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are
   * returned.
   * For [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  int getLanguageCodesCount();
  /**
   * <pre>
   * Optional.
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * For [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME] type,
   * only companies having open jobs with the same [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are
   * returned.
   * For [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  java.lang.String getLanguageCodes(int index);
  /**
   * <pre>
   * Optional.
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * For [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME] type,
   * only companies having open jobs with the same [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are
   * returned.
   * For [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED] type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes] are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodesBytes(int index);

  /**
   * <pre>
   * Required.
   * Completion result count.
   * The maximum allowed page size is 10.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Optional.
   * If provided, restricts completion to specified company.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * </pre>
   *
   * <code>string company = 5;</code>
   */
  java.lang.String getCompany();
  /**
   * <pre>
   * Optional.
   * If provided, restricts completion to specified company.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * </pre>
   *
   * <code>string company = 5;</code>
   */
  com.google.protobuf.ByteString
      getCompanyBytes();

  /**
   * <pre>
   * Optional.
   * The scope of the completion. The defaults is [CompletionScope.PUBLIC][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope.PUBLIC].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope scope = 6;</code>
   */
  int getScopeValue();
  /**
   * <pre>
   * Optional.
   * The scope of the completion. The defaults is [CompletionScope.PUBLIC][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope.PUBLIC].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope scope = 6;</code>
   */
  com.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope getScope();

  /**
   * <pre>
   * Optional.
   * The completion topic. The default is [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType type = 7;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Optional.
   * The completion topic. The default is [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType type = 7;</code>
   */
  com.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType getType();
}
