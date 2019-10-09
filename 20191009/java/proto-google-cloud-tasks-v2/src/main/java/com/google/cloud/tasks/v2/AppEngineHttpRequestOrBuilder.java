// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/target.proto

package com.google.cloud.tasks.v2;

public interface AppEngineHttpRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.AppEngineHttpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The HTTP method to use for the request. The default is POST.
   * The app's request handler for the task's target URL must be able to handle
   * HTTP requests with this http_method, otherwise the task attempt will fail
   * with error code 405 (Method Not Allowed). See
   * [Writing a push task request
   * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler)
   * and the documentation for the request handlers in the language your app is
   * written in e.g.
   * [Python Request
   * Handler](https://cloud.google.com/appengine/docs/python/tools/webapp/requesthandlerclass).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.HttpMethod http_method = 1;</code>
   */
  int getHttpMethodValue();
  /**
   * <pre>
   * The HTTP method to use for the request. The default is POST.
   * The app's request handler for the task's target URL must be able to handle
   * HTTP requests with this http_method, otherwise the task attempt will fail
   * with error code 405 (Method Not Allowed). See
   * [Writing a push task request
   * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler)
   * and the documentation for the request handlers in the language your app is
   * written in e.g.
   * [Python Request
   * Handler](https://cloud.google.com/appengine/docs/python/tools/webapp/requesthandlerclass).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.HttpMethod http_method = 1;</code>
   */
  com.google.cloud.tasks.v2.HttpMethod getHttpMethod();

  /**
   * <pre>
   * Task-level setting for App Engine routing.
   * * If [app_engine_routing_override is set on the
   *    queue][Queue.app_engine_routing_override], this value is used for all
   *    tasks in the queue, no matter what the setting is for the [task-level
   *    app_engine_routing][AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineRouting app_engine_routing = 2;</code>
   */
  boolean hasAppEngineRouting();
  /**
   * <pre>
   * Task-level setting for App Engine routing.
   * * If [app_engine_routing_override is set on the
   *    queue][Queue.app_engine_routing_override], this value is used for all
   *    tasks in the queue, no matter what the setting is for the [task-level
   *    app_engine_routing][AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineRouting app_engine_routing = 2;</code>
   */
  com.google.cloud.tasks.v2.AppEngineRouting getAppEngineRouting();
  /**
   * <pre>
   * Task-level setting for App Engine routing.
   * * If [app_engine_routing_override is set on the
   *    queue][Queue.app_engine_routing_override], this value is used for all
   *    tasks in the queue, no matter what the setting is for the [task-level
   *    app_engine_routing][AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineRouting app_engine_routing = 2;</code>
   */
  com.google.cloud.tasks.v2.AppEngineRoutingOrBuilder getAppEngineRoutingOrBuilder();

  /**
   * <pre>
   * The relative URI.
   * The relative URI must begin with "/" and must be a valid HTTP relative URI.
   * It can contain a path and query string arguments.
   * If the relative URI is empty, then the root path "/" will be used.
   * No spaces are allowed, and the maximum length allowed is 2083 characters.
   * </pre>
   *
   * <code>string relative_uri = 3;</code>
   */
  java.lang.String getRelativeUri();
  /**
   * <pre>
   * The relative URI.
   * The relative URI must begin with "/" and must be a valid HTTP relative URI.
   * It can contain a path and query string arguments.
   * If the relative URI is empty, then the root path "/" will be used.
   * No spaces are allowed, and the maximum length allowed is 2083 characters.
   * </pre>
   *
   * <code>string relative_uri = 3;</code>
   */
  com.google.protobuf.ByteString
      getRelativeUriBytes();

  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [body][google.cloud.tasks.v2.AppEngineHttpRequest.body], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [body][google.cloud.tasks.v2.AppEngineHttpRequest.body], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [body][google.cloud.tasks.v2.AppEngineHttpRequest.body], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [body][google.cloud.tasks.v2.AppEngineHttpRequest.body], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */

  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [body][google.cloud.tasks.v2.AppEngineHttpRequest.body], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * HTTP request body.
   * A request body is allowed only if the HTTP method is POST or PUT. It is
   * an error to set a body on a task with an incompatible [HttpMethod][google.cloud.tasks.v2.HttpMethod].
   * </pre>
   *
   * <code>bytes body = 5;</code>
   */
  com.google.protobuf.ByteString getBody();
}