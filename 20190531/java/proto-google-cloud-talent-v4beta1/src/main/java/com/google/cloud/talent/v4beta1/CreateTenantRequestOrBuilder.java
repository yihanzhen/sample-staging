// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/tenant_service.proto

package com.google.cloud.talent.v4beta1;

public interface CreateTenantRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CreateTenantRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * Resource name of the project under which the tenant is created.
   * The format is "projects/{project_id}", for example,
   * "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required.
   * Resource name of the project under which the tenant is created.
   * The format is "projects/{project_id}", for example,
   * "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required.
   * The tenant to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 2;</code>
   */
  boolean hasTenant();
  /**
   * <pre>
   * Required.
   * The tenant to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 2;</code>
   */
  com.google.cloud.talent.v4beta1.Tenant getTenant();
  /**
   * <pre>
   * Required.
   * The tenant to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 2;</code>
   */
  com.google.cloud.talent.v4beta1.TenantOrBuilder getTenantOrBuilder();
}
