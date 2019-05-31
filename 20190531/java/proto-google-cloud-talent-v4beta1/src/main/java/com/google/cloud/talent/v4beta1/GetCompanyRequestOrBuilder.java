// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

package com.google.cloud.talent.v4beta1;

public interface GetCompanyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.GetCompanyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The resource name of the company to be retrieved.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required.
   * The resource name of the company to be retrieved.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/api-test-project/tenants/foo/companies/bar".
   * Tenant id is optional and the default tenant is used if unspecified, for
   * example, "projects/api-test-project/companies/bar".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
