// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

public interface SearchProfilesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.SearchProfilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The resource name of the tenant to search within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenants/foo".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required.
   * The resource name of the tenant to search within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/api-test-project/tenants/foo".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required.
   * The meta information collected about the profile search user. This is used
   * to improve the search quality of the service. These values are provided by
   * users, and must be precise and consistent.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.RequestMetadata request_metadata = 2;</code>
   */
  boolean hasRequestMetadata();
  /**
   * <pre>
   * Required.
   * The meta information collected about the profile search user. This is used
   * to improve the search quality of the service. These values are provided by
   * users, and must be precise and consistent.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.RequestMetadata request_metadata = 2;</code>
   */
  com.google.cloud.talent.v4beta1.RequestMetadata getRequestMetadata();
  /**
   * <pre>
   * Required.
   * The meta information collected about the profile search user. This is used
   * to improve the search quality of the service. These values are provided by
   * users, and must be precise and consistent.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.RequestMetadata request_metadata = 2;</code>
   */
  com.google.cloud.talent.v4beta1.RequestMetadataOrBuilder getRequestMetadataOrBuilder();

  /**
   * <pre>
   * Optional.
   * Search query to execute. See [ProfileQuery][google.cloud.talent.v4beta1.ProfileQuery] for more details.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileQuery profile_query = 3;</code>
   */
  boolean hasProfileQuery();
  /**
   * <pre>
   * Optional.
   * Search query to execute. See [ProfileQuery][google.cloud.talent.v4beta1.ProfileQuery] for more details.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileQuery profile_query = 3;</code>
   */
  com.google.cloud.talent.v4beta1.ProfileQuery getProfileQuery();
  /**
   * <pre>
   * Optional.
   * Search query to execute. See [ProfileQuery][google.cloud.talent.v4beta1.ProfileQuery] for more details.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileQuery profile_query = 3;</code>
   */
  com.google.cloud.talent.v4beta1.ProfileQueryOrBuilder getProfileQueryOrBuilder();

  /**
   * <pre>
   * Optional.
   * A limit on the number of profiles returned in the search results.
   * A value above the default value 10 can increase search response time.
   * The maximum value allowed is 100. Otherwise an error is thrown.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Optional.
   * The pageToken, similar to offset enables users of the API to paginate
   * through the search results. To retrieve the first page of results, set the
   * pageToken to empty. The search response includes a
   * [nextPageToken][google.cloud.talent.v4beta1.SearchProfilesResponse.next_page_token] field that can be
   * used to populate the pageToken field for the next page of results. Using
   * pageToken instead of offset increases the performance of the API,
   * especially compared to larger offset values.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional.
   * The pageToken, similar to offset enables users of the API to paginate
   * through the search results. To retrieve the first page of results, set the
   * pageToken to empty. The search response includes a
   * [nextPageToken][google.cloud.talent.v4beta1.SearchProfilesResponse.next_page_token] field that can be
   * used to populate the pageToken field for the next page of results. Using
   * pageToken instead of offset increases the performance of the API,
   * especially compared to larger offset values.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional.
   * An integer that specifies the current offset (that is, starting result) in
   * search results. This field is only considered if [page_token][google.cloud.talent.v4beta1.SearchProfilesRequest.page_token] is unset.
   * The maximum allowed value is 5000. Otherwise an error is thrown.
   * For example, 0 means to search from the first profile, and 10 means to
   * search from the 11th profile. This can be used for pagination, for example
   * pageSize = 10 and offset = 10 means to search from the second page.
   * </pre>
   *
   * <code>int32 offset = 6;</code>
   */
  int getOffset();

  /**
   * <pre>
   * Optional.
   * This flag controls the spell-check feature. If `false`, the
   * service attempts to correct a misspelled query.
   * For example, "enginee" is corrected to "engineer".
   * </pre>
   *
   * <code>bool disable_spell_check = 7;</code>
   */
  boolean getDisableSpellCheck();

  /**
   * <pre>
   * Optional.
   * The criteria that determines how search results are sorted.
   * Defaults is "relevance desc" if no value is specified.
   * Supported options are:
   * * "relevance desc": By descending relevance, as determined by the API
   *    algorithms.
   * * "update_date desc": Sort by [Profile.update_date][] in descending order
   *   (recently updated profiles first).
   * * "create_date desc": Sort by [Profile.create_date][] in descending order
   *   (recently created profiles first).
   * * "first_name": Sort by [PersonStrcuturedName.given_name][] in ascending
   *   order.
   * * "first_name desc": Sort by [PersonStrcuturedName.given_name][] in
   *   descending order.
   * * "last_name": Sort by [PersonStrcuturedName.family_name][] in ascending
   *   order.
   * * "last_name desc": Sort by [PersonStrcuturedName.family_name][] in
   *   ascending order.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional.
   * The criteria that determines how search results are sorted.
   * Defaults is "relevance desc" if no value is specified.
   * Supported options are:
   * * "relevance desc": By descending relevance, as determined by the API
   *    algorithms.
   * * "update_date desc": Sort by [Profile.update_date][] in descending order
   *   (recently updated profiles first).
   * * "create_date desc": Sort by [Profile.create_date][] in descending order
   *   (recently created profiles first).
   * * "first_name": Sort by [PersonStrcuturedName.given_name][] in ascending
   *   order.
   * * "first_name desc": Sort by [PersonStrcuturedName.given_name][] in
   *   descending order.
   * * "last_name": Sort by [PersonStrcuturedName.family_name][] in ascending
   *   order.
   * * "last_name desc": Sort by [PersonStrcuturedName.family_name][] in
   *   ascending order.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Optional.
   * When sort by field is based on alphabetical order, sort values case
   * sensitively (based on ASCII) when the value is set to true. Default value
   * is case in-sensitive sort (false).
   * </pre>
   *
   * <code>bool case_sensitive_sort = 9;</code>
   */
  boolean getCaseSensitiveSort();

  /**
   * <pre>
   * Optional.
   * A list of expressions specifies histogram requests against matching
   * profiles for [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest].
   * The expression syntax looks like a function definition with optional
   * parameters.
   * Function syntax: function_name(histogram_facet[, list of buckets])
   * Data types:
   * * Histogram facet: facet names with format [a-zA-Z][a-zA-Z0-9_]+.
   * * String: string like "any string with backslash escape for quote(&#92;")."
   * * Number: whole number and floating point number like 10, -1 and -0.01.
   * * List: list of elements with comma(,) separator surrounded by square
   * brackets. For example, [1, 2, 3] and ["one", "two", "three"].
   * Built-in constants:
   * * MIN (minimum number similar to java Double.MIN_VALUE)
   * * MAX (maximum number similar to java Double.MAX_VALUE)
   * Built-in functions:
   * * bucket(start, end[, label])
   * Bucket build-in function creates a bucket with range of [start, end). Note
   * that the end is exclusive.
   * For example, bucket(1, MAX, "positive number") or bucket(1, 10).
   * Histogram Facets:
   * * admin1: Admin1 is a global placeholder for referring to state, province,
   * or the particular term a country uses to define the geographic structure
   * below the country level. Examples include states codes such as "CA", "IL",
   * "NY", and provinces, such as "BC".
   * * locality: Locality is a global placeholder for referring to city, town,
   * or the particular term a country uses to define the geographic structure
   * below the admin1 level. Examples include city names such as
   * "Mountain View" and "New York".
   * * extended_locality: Extended locality is concatenated version of admin1
   * and locality with comma separator. For example, "Mountain View, CA" and
   * "New York, NY".
   * * postal_code: Postal code of profile which follows locale code.
   * * country: Country code (ISO-3166-1 alpha-2 code) of profile, such as US,
   *  JP, GB.
   * * job_title: Normalized job titles specified in EmploymentHistory.
   * * company_name: Normalized company name of profiles to match on.
   * * institution: The school name. For example, "MIT",
   * "University of California, Berkeley"
   * * degree: Highest education degree in ISCED code. Each value in degree
   * covers a specific level of education, without any expansion to upper nor
   * lower levels of education degree.
   * * experience_in_months: experience in months. 0 means 0 month to 1 month
   * (exclusive).
   * * application_date: The application date specifies application start dates.
   * See [ApplicationDateFilter][google.cloud.talent.v4beta1.ApplicationDateFilter] for more details.
   * * application_outcome_notes: The application outcome reason specifies the
   * reasons behind the outcome of the job application.
   * See [ApplicationOutcomeNotesFilter][google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter] for more details.
   * * application_job_title: The application job title specifies the job
   * applied for in the application.
   * See [ApplicationJobFilter][google.cloud.talent.v4beta1.ApplicationJobFilter] for more details.
   * * hirable_status: Hirable status specifies the profile's hirable status.
   * * string_custom_attribute: String custom attributes. Values can be accessed
   * via square bracket notation like string_custom_attribute["key1"].
   * * numeric_custom_attribute: Numeric custom attributes. Values can be
   * accessed via square bracket notation like numeric_custom_attribute["key1"].
   * Example expressions:
   * * count(admin1)
   * * count(experience_in_months, [bucket(0, 12, "1 year"),
   * bucket(12, 36, "1-3 years"), bucket(36, MAX, "3+ years")])
   * * count(string_custom_attribute["assigned_recruiter"])
   * * count(numeric_custom_attribute["favorite_number"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQuery histogram_queries = 10;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.HistogramQuery> 
      getHistogramQueriesList();
  /**
   * <pre>
   * Optional.
   * A list of expressions specifies histogram requests against matching
   * profiles for [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest].
   * The expression syntax looks like a function definition with optional
   * parameters.
   * Function syntax: function_name(histogram_facet[, list of buckets])
   * Data types:
   * * Histogram facet: facet names with format [a-zA-Z][a-zA-Z0-9_]+.
   * * String: string like "any string with backslash escape for quote(&#92;")."
   * * Number: whole number and floating point number like 10, -1 and -0.01.
   * * List: list of elements with comma(,) separator surrounded by square
   * brackets. For example, [1, 2, 3] and ["one", "two", "three"].
   * Built-in constants:
   * * MIN (minimum number similar to java Double.MIN_VALUE)
   * * MAX (maximum number similar to java Double.MAX_VALUE)
   * Built-in functions:
   * * bucket(start, end[, label])
   * Bucket build-in function creates a bucket with range of [start, end). Note
   * that the end is exclusive.
   * For example, bucket(1, MAX, "positive number") or bucket(1, 10).
   * Histogram Facets:
   * * admin1: Admin1 is a global placeholder for referring to state, province,
   * or the particular term a country uses to define the geographic structure
   * below the country level. Examples include states codes such as "CA", "IL",
   * "NY", and provinces, such as "BC".
   * * locality: Locality is a global placeholder for referring to city, town,
   * or the particular term a country uses to define the geographic structure
   * below the admin1 level. Examples include city names such as
   * "Mountain View" and "New York".
   * * extended_locality: Extended locality is concatenated version of admin1
   * and locality with comma separator. For example, "Mountain View, CA" and
   * "New York, NY".
   * * postal_code: Postal code of profile which follows locale code.
   * * country: Country code (ISO-3166-1 alpha-2 code) of profile, such as US,
   *  JP, GB.
   * * job_title: Normalized job titles specified in EmploymentHistory.
   * * company_name: Normalized company name of profiles to match on.
   * * institution: The school name. For example, "MIT",
   * "University of California, Berkeley"
   * * degree: Highest education degree in ISCED code. Each value in degree
   * covers a specific level of education, without any expansion to upper nor
   * lower levels of education degree.
   * * experience_in_months: experience in months. 0 means 0 month to 1 month
   * (exclusive).
   * * application_date: The application date specifies application start dates.
   * See [ApplicationDateFilter][google.cloud.talent.v4beta1.ApplicationDateFilter] for more details.
   * * application_outcome_notes: The application outcome reason specifies the
   * reasons behind the outcome of the job application.
   * See [ApplicationOutcomeNotesFilter][google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter] for more details.
   * * application_job_title: The application job title specifies the job
   * applied for in the application.
   * See [ApplicationJobFilter][google.cloud.talent.v4beta1.ApplicationJobFilter] for more details.
   * * hirable_status: Hirable status specifies the profile's hirable status.
   * * string_custom_attribute: String custom attributes. Values can be accessed
   * via square bracket notation like string_custom_attribute["key1"].
   * * numeric_custom_attribute: Numeric custom attributes. Values can be
   * accessed via square bracket notation like numeric_custom_attribute["key1"].
   * Example expressions:
   * * count(admin1)
   * * count(experience_in_months, [bucket(0, 12, "1 year"),
   * bucket(12, 36, "1-3 years"), bucket(36, MAX, "3+ years")])
   * * count(string_custom_attribute["assigned_recruiter"])
   * * count(numeric_custom_attribute["favorite_number"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQuery histogram_queries = 10;</code>
   */
  com.google.cloud.talent.v4beta1.HistogramQuery getHistogramQueries(int index);
  /**
   * <pre>
   * Optional.
   * A list of expressions specifies histogram requests against matching
   * profiles for [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest].
   * The expression syntax looks like a function definition with optional
   * parameters.
   * Function syntax: function_name(histogram_facet[, list of buckets])
   * Data types:
   * * Histogram facet: facet names with format [a-zA-Z][a-zA-Z0-9_]+.
   * * String: string like "any string with backslash escape for quote(&#92;")."
   * * Number: whole number and floating point number like 10, -1 and -0.01.
   * * List: list of elements with comma(,) separator surrounded by square
   * brackets. For example, [1, 2, 3] and ["one", "two", "three"].
   * Built-in constants:
   * * MIN (minimum number similar to java Double.MIN_VALUE)
   * * MAX (maximum number similar to java Double.MAX_VALUE)
   * Built-in functions:
   * * bucket(start, end[, label])
   * Bucket build-in function creates a bucket with range of [start, end). Note
   * that the end is exclusive.
   * For example, bucket(1, MAX, "positive number") or bucket(1, 10).
   * Histogram Facets:
   * * admin1: Admin1 is a global placeholder for referring to state, province,
   * or the particular term a country uses to define the geographic structure
   * below the country level. Examples include states codes such as "CA", "IL",
   * "NY", and provinces, such as "BC".
   * * locality: Locality is a global placeholder for referring to city, town,
   * or the particular term a country uses to define the geographic structure
   * below the admin1 level. Examples include city names such as
   * "Mountain View" and "New York".
   * * extended_locality: Extended locality is concatenated version of admin1
   * and locality with comma separator. For example, "Mountain View, CA" and
   * "New York, NY".
   * * postal_code: Postal code of profile which follows locale code.
   * * country: Country code (ISO-3166-1 alpha-2 code) of profile, such as US,
   *  JP, GB.
   * * job_title: Normalized job titles specified in EmploymentHistory.
   * * company_name: Normalized company name of profiles to match on.
   * * institution: The school name. For example, "MIT",
   * "University of California, Berkeley"
   * * degree: Highest education degree in ISCED code. Each value in degree
   * covers a specific level of education, without any expansion to upper nor
   * lower levels of education degree.
   * * experience_in_months: experience in months. 0 means 0 month to 1 month
   * (exclusive).
   * * application_date: The application date specifies application start dates.
   * See [ApplicationDateFilter][google.cloud.talent.v4beta1.ApplicationDateFilter] for more details.
   * * application_outcome_notes: The application outcome reason specifies the
   * reasons behind the outcome of the job application.
   * See [ApplicationOutcomeNotesFilter][google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter] for more details.
   * * application_job_title: The application job title specifies the job
   * applied for in the application.
   * See [ApplicationJobFilter][google.cloud.talent.v4beta1.ApplicationJobFilter] for more details.
   * * hirable_status: Hirable status specifies the profile's hirable status.
   * * string_custom_attribute: String custom attributes. Values can be accessed
   * via square bracket notation like string_custom_attribute["key1"].
   * * numeric_custom_attribute: Numeric custom attributes. Values can be
   * accessed via square bracket notation like numeric_custom_attribute["key1"].
   * Example expressions:
   * * count(admin1)
   * * count(experience_in_months, [bucket(0, 12, "1 year"),
   * bucket(12, 36, "1-3 years"), bucket(36, MAX, "3+ years")])
   * * count(string_custom_attribute["assigned_recruiter"])
   * * count(numeric_custom_attribute["favorite_number"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQuery histogram_queries = 10;</code>
   */
  int getHistogramQueriesCount();
  /**
   * <pre>
   * Optional.
   * A list of expressions specifies histogram requests against matching
   * profiles for [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest].
   * The expression syntax looks like a function definition with optional
   * parameters.
   * Function syntax: function_name(histogram_facet[, list of buckets])
   * Data types:
   * * Histogram facet: facet names with format [a-zA-Z][a-zA-Z0-9_]+.
   * * String: string like "any string with backslash escape for quote(&#92;")."
   * * Number: whole number and floating point number like 10, -1 and -0.01.
   * * List: list of elements with comma(,) separator surrounded by square
   * brackets. For example, [1, 2, 3] and ["one", "two", "three"].
   * Built-in constants:
   * * MIN (minimum number similar to java Double.MIN_VALUE)
   * * MAX (maximum number similar to java Double.MAX_VALUE)
   * Built-in functions:
   * * bucket(start, end[, label])
   * Bucket build-in function creates a bucket with range of [start, end). Note
   * that the end is exclusive.
   * For example, bucket(1, MAX, "positive number") or bucket(1, 10).
   * Histogram Facets:
   * * admin1: Admin1 is a global placeholder for referring to state, province,
   * or the particular term a country uses to define the geographic structure
   * below the country level. Examples include states codes such as "CA", "IL",
   * "NY", and provinces, such as "BC".
   * * locality: Locality is a global placeholder for referring to city, town,
   * or the particular term a country uses to define the geographic structure
   * below the admin1 level. Examples include city names such as
   * "Mountain View" and "New York".
   * * extended_locality: Extended locality is concatenated version of admin1
   * and locality with comma separator. For example, "Mountain View, CA" and
   * "New York, NY".
   * * postal_code: Postal code of profile which follows locale code.
   * * country: Country code (ISO-3166-1 alpha-2 code) of profile, such as US,
   *  JP, GB.
   * * job_title: Normalized job titles specified in EmploymentHistory.
   * * company_name: Normalized company name of profiles to match on.
   * * institution: The school name. For example, "MIT",
   * "University of California, Berkeley"
   * * degree: Highest education degree in ISCED code. Each value in degree
   * covers a specific level of education, without any expansion to upper nor
   * lower levels of education degree.
   * * experience_in_months: experience in months. 0 means 0 month to 1 month
   * (exclusive).
   * * application_date: The application date specifies application start dates.
   * See [ApplicationDateFilter][google.cloud.talent.v4beta1.ApplicationDateFilter] for more details.
   * * application_outcome_notes: The application outcome reason specifies the
   * reasons behind the outcome of the job application.
   * See [ApplicationOutcomeNotesFilter][google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter] for more details.
   * * application_job_title: The application job title specifies the job
   * applied for in the application.
   * See [ApplicationJobFilter][google.cloud.talent.v4beta1.ApplicationJobFilter] for more details.
   * * hirable_status: Hirable status specifies the profile's hirable status.
   * * string_custom_attribute: String custom attributes. Values can be accessed
   * via square bracket notation like string_custom_attribute["key1"].
   * * numeric_custom_attribute: Numeric custom attributes. Values can be
   * accessed via square bracket notation like numeric_custom_attribute["key1"].
   * Example expressions:
   * * count(admin1)
   * * count(experience_in_months, [bucket(0, 12, "1 year"),
   * bucket(12, 36, "1-3 years"), bucket(36, MAX, "3+ years")])
   * * count(string_custom_attribute["assigned_recruiter"])
   * * count(numeric_custom_attribute["favorite_number"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQuery histogram_queries = 10;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.HistogramQueryOrBuilder> 
      getHistogramQueriesOrBuilderList();
  /**
   * <pre>
   * Optional.
   * A list of expressions specifies histogram requests against matching
   * profiles for [SearchProfilesRequest][google.cloud.talent.v4beta1.SearchProfilesRequest].
   * The expression syntax looks like a function definition with optional
   * parameters.
   * Function syntax: function_name(histogram_facet[, list of buckets])
   * Data types:
   * * Histogram facet: facet names with format [a-zA-Z][a-zA-Z0-9_]+.
   * * String: string like "any string with backslash escape for quote(&#92;")."
   * * Number: whole number and floating point number like 10, -1 and -0.01.
   * * List: list of elements with comma(,) separator surrounded by square
   * brackets. For example, [1, 2, 3] and ["one", "two", "three"].
   * Built-in constants:
   * * MIN (minimum number similar to java Double.MIN_VALUE)
   * * MAX (maximum number similar to java Double.MAX_VALUE)
   * Built-in functions:
   * * bucket(start, end[, label])
   * Bucket build-in function creates a bucket with range of [start, end). Note
   * that the end is exclusive.
   * For example, bucket(1, MAX, "positive number") or bucket(1, 10).
   * Histogram Facets:
   * * admin1: Admin1 is a global placeholder for referring to state, province,
   * or the particular term a country uses to define the geographic structure
   * below the country level. Examples include states codes such as "CA", "IL",
   * "NY", and provinces, such as "BC".
   * * locality: Locality is a global placeholder for referring to city, town,
   * or the particular term a country uses to define the geographic structure
   * below the admin1 level. Examples include city names such as
   * "Mountain View" and "New York".
   * * extended_locality: Extended locality is concatenated version of admin1
   * and locality with comma separator. For example, "Mountain View, CA" and
   * "New York, NY".
   * * postal_code: Postal code of profile which follows locale code.
   * * country: Country code (ISO-3166-1 alpha-2 code) of profile, such as US,
   *  JP, GB.
   * * job_title: Normalized job titles specified in EmploymentHistory.
   * * company_name: Normalized company name of profiles to match on.
   * * institution: The school name. For example, "MIT",
   * "University of California, Berkeley"
   * * degree: Highest education degree in ISCED code. Each value in degree
   * covers a specific level of education, without any expansion to upper nor
   * lower levels of education degree.
   * * experience_in_months: experience in months. 0 means 0 month to 1 month
   * (exclusive).
   * * application_date: The application date specifies application start dates.
   * See [ApplicationDateFilter][google.cloud.talent.v4beta1.ApplicationDateFilter] for more details.
   * * application_outcome_notes: The application outcome reason specifies the
   * reasons behind the outcome of the job application.
   * See [ApplicationOutcomeNotesFilter][google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter] for more details.
   * * application_job_title: The application job title specifies the job
   * applied for in the application.
   * See [ApplicationJobFilter][google.cloud.talent.v4beta1.ApplicationJobFilter] for more details.
   * * hirable_status: Hirable status specifies the profile's hirable status.
   * * string_custom_attribute: String custom attributes. Values can be accessed
   * via square bracket notation like string_custom_attribute["key1"].
   * * numeric_custom_attribute: Numeric custom attributes. Values can be
   * accessed via square bracket notation like numeric_custom_attribute["key1"].
   * Example expressions:
   * * count(admin1)
   * * count(experience_in_months, [bucket(0, 12, "1 year"),
   * bucket(12, 36, "1-3 years"), bucket(36, MAX, "3+ years")])
   * * count(string_custom_attribute["assigned_recruiter"])
   * * count(numeric_custom_attribute["favorite_number"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQuery histogram_queries = 10;</code>
   */
  com.google.cloud.talent.v4beta1.HistogramQueryOrBuilder getHistogramQueriesOrBuilder(
      int index);
}
