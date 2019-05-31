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
    module Talent
      module V4beta1
        # Message representing a period of time between two timestamps.
        # @!attribute [rw] start_time
        #   @return [Google::Protobuf::Timestamp]
        #     Begin of the period (inclusive).
        # @!attribute [rw] end_time
        #   @return [Google::Protobuf::Timestamp]
        #     End of the period (exclusive).
        class TimestampRange; end

        # Output only. A resource that represents a location with full geographic
        # information.
        # @!attribute [rw] location_type
        #   @return [Google::Cloud::Talent::V4beta1::Location::LocationType]
        #     The type of a location, which corresponds to the address lines field of
        #     {PostalAddress}. For example, "Downtown, Atlanta, GA, USA" has a type of
        #     {LocationType#NEIGHBORHOOD}, and "Kansas City, KS, USA" has a type of
        #     {LocationType#LOCALITY}.
        # @!attribute [rw] postal_address
        #   @return [Google::Type::PostalAddress]
        #     Postal address of the location that includes human readable information,
        #     such as postal delivery and payments addresses. Given a postal address,
        #     a postal service can deliver items to a premises, P.O. Box, or other
        #     delivery location.
        # @!attribute [rw] lat_lng
        #   @return [Google::Type::LatLng]
        #     An object representing a latitude/longitude pair.
        # @!attribute [rw] radius_miles
        #   @return [Float]
        #     Radius in miles of the job location. This value is derived from the
        #     location bounding box in which a circle with the specified radius
        #     centered from {LatLng} covers the area associated with the job location.
        #     For example, currently, "Mountain View, CA, USA" has a radius of
        #     6.17 miles.
        class Location
          # An enum which represents the type of a location.
          module LocationType
            # Default value if the type isn't specified.
            LOCATION_TYPE_UNSPECIFIED = 0

            # A country level location.
            COUNTRY = 1

            # A state or equivalent level location.
            ADMINISTRATIVE_AREA = 2

            # A county or equivalent level location.
            SUB_ADMINISTRATIVE_AREA = 3

            # A city or equivalent level location.
            LOCALITY = 4

            # A postal code level location.
            POSTAL_CODE = 5

            # A sublocality is a subdivision of a locality, for example a city borough,
            # ward, or arrondissement. Sublocalities are usually recognized by a local
            # political authority. For example, Manhattan and Brooklyn are recognized
            # as boroughs by the City of New York, and are therefore modeled as
            # sublocalities.
            SUB_LOCALITY = 6

            # A district or equivalent level location.
            SUB_LOCALITY_1 = 7

            # A smaller district or equivalent level display.
            SUB_LOCALITY_2 = 8

            # A neighborhood level location.
            NEIGHBORHOOD = 9

            # A street address level location.
            STREET_ADDRESS = 10
          end
        end

        # Input only.
        #
        # Meta information related to the job searcher or entity
        # conducting the job search. This information is used to improve the
        # performance of the service.
        # @!attribute [rw] domain
        #   @return [String]
        #     Required if {Google::Cloud::Talent::V4beta1::RequestMetadata#allow_missing_ids allow_missing_ids} is unset or `false`.
        #
        #     The client-defined scope or source of the service call, which typically
        #     is the domain on
        #     which the service has been implemented and is currently being run.
        #
        #     For example, if the service is being run by client <em>Foo, Inc.</em>, on
        #     job board www.foo.com and career site www.bar.com, then this field is
        #     set to "foo.com" for use on the job board, and "bar.com" for use on the
        #     career site.
        #
        #     Note that any improvements to the model for a particular tenant site rely
        #     on this field being set correctly to a unique domain.
        #
        #     The maximum number of allowed characters is 255.
        # @!attribute [rw] session_id
        #   @return [String]
        #     Required if {Google::Cloud::Talent::V4beta1::RequestMetadata#allow_missing_ids allow_missing_ids} is unset or `false`.
        #
        #     A unique session identification string. A session is defined as the
        #     duration of an end user's interaction with the service over a certain
        #     period.
        #     Obfuscate this field for privacy concerns before
        #     providing it to the service.
        #
        #     Note that any improvements to the model for a particular tenant site rely
        #     on this field being set correctly to a unique session ID.
        #
        #     The maximum number of allowed characters is 255.
        # @!attribute [rw] user_id
        #   @return [String]
        #     Required if {Google::Cloud::Talent::V4beta1::RequestMetadata#allow_missing_ids allow_missing_ids} is unset or `false`.
        #
        #     A unique user identification string, as determined by the client.
        #     To have the strongest positive impact on search quality
        #     make sure the client-level is unique.
        #     Obfuscate this field for privacy concerns before
        #     providing it to the service.
        #
        #     Note that any improvements to the model for a particular tenant site rely
        #     on this field being set correctly to a unique user ID.
        #
        #     The maximum number of allowed characters is 255.
        # @!attribute [rw] allow_missing_ids
        #   @return [true, false]
        #     Optional.
        #
        #     If set to `true`, {Google::Cloud::Talent::V4beta1::RequestMetadata#domain domain}, {Google::Cloud::Talent::V4beta1::RequestMetadata#session_id session_id} and {Google::Cloud::Talent::V4beta1::RequestMetadata#user_id user_id} are optional.
        #     Only set when any of these fields isn't available for some reason. It
        #     is highly recommended not to set this field and provide accurate
        #     {Google::Cloud::Talent::V4beta1::RequestMetadata#domain domain}, {Google::Cloud::Talent::V4beta1::RequestMetadata#session_id session_id} and {Google::Cloud::Talent::V4beta1::RequestMetadata#user_id user_id} for the best service experience.
        # @!attribute [rw] device_info
        #   @return [Google::Cloud::Talent::V4beta1::DeviceInfo]
        #     Optional.
        #
        #     The type of device used by the job seeker at the time of the call to the
        #     service.
        class RequestMetadata; end

        # Output only. Additional information returned to client, such as debugging
        # information.
        # @!attribute [rw] request_id
        #   @return [String]
        #     A unique id associated with this call.
        #     This id is logged for tracking purposes.
        class ResponseMetadata; end

        # Device information collected from the job seeker, candidate, or
        # other entity conducting the job search. Providing this information improves
        # the quality of the search results across devices.
        # @!attribute [rw] device_type
        #   @return [Google::Cloud::Talent::V4beta1::DeviceInfo::DeviceType]
        #     Optional.
        #
        #     Type of the device.
        # @!attribute [rw] id
        #   @return [String]
        #     Optional.
        #
        #     A device-specific ID. The ID must be a unique identifier that
        #     distinguishes the device from other devices.
        class DeviceInfo
          # An enumeration describing an API access portal and exposure mechanism.
          module DeviceType
            # The device type isn't specified.
            DEVICE_TYPE_UNSPECIFIED = 0

            # A desktop web browser, such as, Chrome, Firefox, Safari, or Internet
            # Explorer)
            WEB = 1

            # A mobile device web browser, such as a phone or tablet with a Chrome
            # browser.
            MOBILE_WEB = 2

            # An Android device native application.
            ANDROID = 3

            # An iOS device native application.
            IOS = 4

            # A bot, as opposed to a device operated by human beings, such as a web
            # crawler.
            BOT = 5

            # Other devices types.
            OTHER = 6
          end
        end

        # Custom attribute values that are either filterable or non-filterable.
        # @!attribute [rw] string_values
        #   @return [Array<String>]
        #     Optional but exactly one of {Google::Cloud::Talent::V4beta1::CustomAttribute#string_values string_values} or {Google::Cloud::Talent::V4beta1::CustomAttribute#long_values long_values} must
        #     be specified.
        #
        #     This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
        #     `CASE_INSENSITIVE_MATCH`) search.
        #     For filterable `string_value`s, a maximum total number of 200 values
        #     is allowed, with each `string_value` has a byte size of no more than
        #     255B. For unfilterable `string_values`, the maximum total byte size of
        #     unfilterable `string_values` is 50KB.
        #
        #     Empty string isn't allowed.
        # @!attribute [rw] long_values
        #   @return [Array<Integer>]
        #     Optional but exactly one of {Google::Cloud::Talent::V4beta1::CustomAttribute#string_values string_values} or {Google::Cloud::Talent::V4beta1::CustomAttribute#long_values long_values} must
        #     be specified.
        #
        #     This field is used to perform number range search.
        #     (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
        #
        #     Currently at most 1 {Google::Cloud::Talent::V4beta1::CustomAttribute#long_values long_values} is supported.
        # @!attribute [rw] filterable
        #   @return [true, false]
        #     Optional.
        #
        #     If the `filterable` flag is true, custom field values are searchable.
        #     If false, values are not searchable.
        #
        #     Default is false.
        class CustomAttribute; end

        # Output only. Spell check result.
        # @!attribute [rw] corrected
        #   @return [true, false]
        #     Indicates if the query was corrected by the spell checker.
        # @!attribute [rw] corrected_text
        #   @return [String]
        #     Correction output consisting of the corrected keyword string.
        # @!attribute [rw] corrected_html
        #   @return [String]
        #     Corrected output with html tags to highlight the corrected words.
        #     Corrected words are called out with the "<b><i>...</i></b>" html tags.
        #
        #     For example, the user input query is "software enginear", where the second
        #     word, "enginear," is incorrect. It should be "engineer". When spelling
        #     correction is enabled, this value is
        #     "software <b><i>engineer</i></b>".
        class SpellingCorrection; end

        # Job compensation details.
        # @!attribute [rw] entries
        #   @return [Array<Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry>]
        #     Optional.
        #
        #     Job compensation information.
        #
        #     At most one entry can be of type
        #     {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationType::BASE CompensationInfo::CompensationType::BASE}, which is
        #     referred as ** base compensation entry ** for the job.
        # @!attribute [rw] annualized_base_compensation_range
        #   @return [Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationRange]
        #     Output only. Annualized base compensation range. Computed as
        #     base compensation entry's {CompensationEntry#compensation} times
        #     {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#expected_units_per_year CompensationEntry#expected_units_per_year}.
        #
        #     See {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry CompensationEntry} for explanation on compensation annualization.
        # @!attribute [rw] annualized_total_compensation_range
        #   @return [Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationRange]
        #     Output only. Annualized total compensation range. Computed as
        #     all compensation entries' {CompensationEntry#compensation} times
        #     {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#expected_units_per_year CompensationEntry#expected_units_per_year}.
        #
        #     See {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry CompensationEntry} for explanation on compensation annualization.
        class CompensationInfo
          # A compensation entry that represents one component of compensation, such
          # as base pay, bonus, or other compensation type.
          #
          # Annualization: One compensation entry can be annualized if
          # * it contains valid {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#amount amount} or {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#range range}.
          # * and its {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#expected_units_per_year expected_units_per_year} is set or can be derived.
          #   Its annualized range is determined as ({Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#amount amount} or {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#range range}) times
          #   {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#expected_units_per_year expected_units_per_year}.
          # @!attribute [rw] type
          #   @return [Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationType]
          #     Optional.
          #
          #     Compensation type.
          #
          #     Default is {CompensationUnit::OTHER_COMPENSATION_TYPE}.
          # @!attribute [rw] unit
          #   @return [Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationUnit]
          #     Optional.
          #
          #     Frequency of the specified amount.
          #
          #     Default is {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationUnit::OTHER_COMPENSATION_UNIT CompensationUnit::OTHER_COMPENSATION_UNIT}.
          # @!attribute [rw] amount
          #   @return [Google::Type::Money]
          #     Optional.
          #
          #     Compensation amount.
          # @!attribute [rw] range
          #   @return [Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationRange]
          #     Optional.
          #
          #     Compensation range.
          # @!attribute [rw] description
          #   @return [String]
          #     Optional.
          #
          #     Compensation description.  For example, could
          #     indicate equity terms or provide additional context to an estimated
          #     bonus.
          # @!attribute [rw] expected_units_per_year
          #   @return [Google::Protobuf::DoubleValue]
          #     Optional.
          #
          #     Expected number of units paid each year. If not specified, when
          #     {Google::Cloud::Talent::V4beta1::Job#employment_types Job#employment_types} is FULLTIME, a default value is inferred
          #     based on {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#unit unit}. Default values:
          #     * HOURLY: 2080
          #     * DAILY: 260
          #     * WEEKLY: 52
          #     * MONTHLY: 12
          #     * ANNUAL: 1
          class CompensationEntry; end

          # Compensation range.
          # @!attribute [rw] max_compensation
          #   @return [Google::Type::Money]
          #     Optional.
          #
          #     The maximum amount of compensation. If left empty, the value is set
          #     to a maximal compensation value and the currency code is set to
          #     match the {Google::Type::Money#currency_code currency code} of
          #     min_compensation.
          # @!attribute [rw] min_compensation
          #   @return [Google::Type::Money]
          #     Optional.
          #
          #     The minimum amount of compensation. If left empty, the value is set
          #     to zero and the currency code is set to match the
          #     {Google::Type::Money#currency_code currency code} of max_compensation.
          class CompensationRange; end

          # The type of compensation.
          #
          # For compensation amounts specified in non-monetary amounts,
          # describe the compensation scheme in the {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#description CompensationEntry#description}.
          #
          # For example, tipping format is described in
          # {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#description CompensationEntry#description} (for example, "expect 15-20% tips based
          # on customer bill.") and an estimate of the tips provided in
          # {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#amount CompensationEntry#amount} or {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#range CompensationEntry#range} ($10 per hour).
          #
          # For example, equity is described in {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#description CompensationEntry#description}
          # (for example, "1% - 2% equity vesting over 4 years, 1 year cliff") and
          # value estimated in {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#amount CompensationEntry#amount} or
          # {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#range CompensationEntry#range}. If no value estimate is possible, units are
          # {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationUnit::COMPENSATION_UNIT_UNSPECIFIED CompensationUnit::COMPENSATION_UNIT_UNSPECIFIED} and then further
          # clarified in {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry#description CompensationEntry#description} field.
          module CompensationType
            # Default value.
            COMPENSATION_TYPE_UNSPECIFIED = 0

            # Base compensation: Refers to the fixed amount of money paid to an
            # employee by an employer in return for work performed. Base compensation
            # does not include benefits, bonuses or any other potential compensation
            # from an employer.
            BASE = 1

            # Bonus.
            BONUS = 2

            # Signing bonus.
            SIGNING_BONUS = 3

            # Equity.
            EQUITY = 4

            # Profit sharing.
            PROFIT_SHARING = 5

            # Commission.
            COMMISSIONS = 6

            # Tips.
            TIPS = 7

            # Other compensation type.
            OTHER_COMPENSATION_TYPE = 8
          end

          # Pay frequency.
          module CompensationUnit
            # Default value.
            COMPENSATION_UNIT_UNSPECIFIED = 0

            # Hourly.
            HOURLY = 1

            # Daily.
            DAILY = 2

            # Weekly
            WEEKLY = 3

            # Monthly.
            MONTHLY = 4

            # Yearly.
            YEARLY = 5

            # One time.
            ONE_TIME = 6

            # Other compensation units.
            OTHER_COMPENSATION_UNIT = 7
          end
        end

        # Resource that represents a license or certification.
        # @!attribute [rw] display_name
        #   @return [String]
        #     Optional.
        #
        #     Name of license or certification.
        #
        #     Number of characters allowed is 100.
        # @!attribute [rw] acquire_date
        #   @return [Google::Type::Date]
        #     Optional.
        #
        #     Acquisition date or effective date of license or certification.
        # @!attribute [rw] expire_date
        #   @return [Google::Type::Date]
        #     Optional.
        #
        #     Expiration date of license of certification.
        # @!attribute [rw] authority
        #   @return [String]
        #     Optional.
        #
        #     Authority of license, such as government.
        #
        #     Number of characters allowed is 100.
        # @!attribute [rw] description
        #   @return [String]
        #     Optional.
        #
        #     Description of license or certification.
        #
        #     Number of characters allowed is 100,000.
        class Certification; end

        # Resource that represents a skill of a candidate.
        # @!attribute [rw] display_name
        #   @return [String]
        #     Optional.
        #
        #     Skill display name.
        #
        #     For example, "Java", "Python".
        #
        #     Number of characters allowed is 100.
        # @!attribute [rw] last_used_date
        #   @return [Google::Type::Date]
        #     Optional.
        #
        #     The last time this skill was used.
        # @!attribute [rw] level
        #   @return [Google::Cloud::Talent::V4beta1::SkillProficiencyLevel]
        #     Optional.
        #
        #     Skill proficiency level which indicates how proficient the candidate is at
        #     this skill.
        # @!attribute [rw] context
        #   @return [String]
        #     Optional.
        #
        #     A paragraph describes context of this skill.
        #
        #     Number of characters allowed is 100,000.
        # @!attribute [rw] skill_name_snippet
        #   @return [String]
        #     Output only. Skill name snippet shows how the {Google::Cloud::Talent::V4beta1::Skill#display_name display_name} is related
        #     to a search query. It's empty if the {Google::Cloud::Talent::V4beta1::Skill#display_name display_name} isn't related to the
        #     search query.
        class Skill; end

        # Details of an interview.
        # @!attribute [rw] rating
        #   @return [Google::Cloud::Talent::V4beta1::Rating]
        #     Optional.
        #
        #     The rating on this interview.
        # @!attribute [rw] outcome
        #   @return [Google::Cloud::Talent::V4beta1::Outcome]
        #     Required.
        #
        #     The overall decision resulting from this interview (positive, negative,
        #     nuetral).
        class Interview; end

        # The details of the score received for an assessment or interview.
        # @!attribute [rw] overall
        #   @return [Float]
        #     Overall score.
        # @!attribute [rw] min
        #   @return [Float]
        #     The minimum value for the score.
        # @!attribute [rw] max
        #   @return [Float]
        #     The maximum value for the score.
        # @!attribute [rw] interval
        #   @return [Float]
        #     The steps within the score (for example, interval = 1 max = 5
        #     min = 1 indicates that the score can be 1, 2, 3, 4, or 5)
        class Rating; end

        # Method for commute.
        module CommuteMethod
          # Commute method isn't specified.
          COMMUTE_METHOD_UNSPECIFIED = 0

          # Commute time is calculated based on driving time.
          DRIVING = 1

          # Commute time is calculated based on public transit including bus, metro,
          # subway, and so on.
          TRANSIT = 2

          # Commute time is calculated based on walking time.
          WALKING = 3

          # Commute time is calculated based on biking time.
          CYCLING = 4
        end

        # An enum that represents the size of the company.
        module CompanySize
          # Default value if the size isn't specified.
          COMPANY_SIZE_UNSPECIFIED = 0

          # The company has less than 50 employees.
          MINI = 1

          # The company has between 50 and 99 employees.
          SMALL = 2

          # The company has between 100 and 499 employees.
          SMEDIUM = 3

          # The company has between 500 and 999 employees.
          MEDIUM = 4

          # The company has between 1,000 and 4,999 employees.
          BIG = 5

          # The company has between 5,000 and 9,999 employees.
          BIGGER = 6

          # The company has 10,000 or more employees.
          GIANT = 7
        end

        # Enum that represents the usage of the contact information.
        module ContactInfoUsage
          # Default value.
          CONTACT_INFO_USAGE_UNSPECIFIED = 0

          # Personal use.
          PERSONAL = 1

          # Work use.
          WORK = 2

          # School use.
          SCHOOL = 3
        end

        # Educational degree level defined in International Standard Classification
        # of Education (ISCED).
        module DegreeType
          # Default value. Represents no degree, or early childhood education.
          # Maps to ISCED code 0.
          # Ex) Kindergarten
          DEGREE_TYPE_UNSPECIFIED = 0

          # Primary education which is typically the first stage of compulsory
          # education. ISCED code 1.
          # Ex) Elementary school
          PRIMARY_EDUCATION = 1

          # Lower secondary education; First stage of secondary education building on
          # primary education, typically with a more subject-oriented curriculum.
          # ISCED code 2.
          # Ex) Middle school
          LOWER_SECONDARY_EDUCATION = 2

          # Middle education; Second/final stage of secondary education preparing for
          # tertiary education and/or providing skills relevant to employment.
          # Usually with an increased range of subject options and streams. ISCED
          # code 3.
          # Ex) High school
          UPPER_SECONDARY_EDUCATION = 3

          # Adult Remedial Education; Programmes providing learning experiences that
          # build on secondary education and prepare for labour market entry and/or
          # tertiary education. The content is broader than secondary but not as
          # complex as tertiary education. ISCED code 4.
          ADULT_REMEDIAL_EDUCATION = 4

          # Associate's or equivalent; Short first tertiary programmes that are
          # typically practically-based, occupationally-specific and prepare for
          # labour market entry. These programmes may also provide a pathway to other
          # tertiary programmes. ISCED code 5.
          ASSOCIATES_OR_EQUIVALENT = 5

          # Bachelor's or equivalent; Programmes designed to provide intermediate
          # academic and/or professional knowledge, skills and competencies leading
          # to a first tertiary degree or equivalent qualification. ISCED code 6.
          BACHELORS_OR_EQUIVALENT = 6

          # Master's or equivalent; Programmes designed to provide advanced academic
          # and/or professional knowledge, skills and competencies leading to a
          # second tertiary degree or equivalent qualification. ISCED code 7.
          MASTERS_OR_EQUIVALENT = 7

          # Doctoral or equivalent; Programmes designed primarily to lead to an
          # advanced research qualification, usually concluding with the submission
          # and defense of a substantive dissertation of publishable quality based on
          # original research. ISCED code 8.
          DOCTORAL_OR_EQUIVALENT = 8
        end

        # An enum that represents the employment type of a job.
        module EmploymentType
          # The default value if the employment type isn't specified.
          EMPLOYMENT_TYPE_UNSPECIFIED = 0

          # The job requires working a number of hours that constitute full
          # time employment, typically 40 or more hours per week.
          FULL_TIME = 1

          # The job entails working fewer hours than a full time job,
          # typically less than 40 hours a week.
          PART_TIME = 2

          # The job is offered as a contracted, as opposed to a salaried employee,
          # position.
          CONTRACTOR = 3

          # The job is offered as a contracted position with the understanding
          # that it's converted into a full-time position at the end of the
          # contract. Jobs of this type are also returned by a search for
          # {Google::Cloud::Talent::V4beta1::EmploymentType::CONTRACTOR EmploymentType::CONTRACTOR} jobs.
          CONTRACT_TO_HIRE = 4

          # The job is offered as a temporary employment opportunity, usually
          # a short-term engagement.
          TEMPORARY = 5

          # The job is a fixed-term opportunity for students or entry-level job
          # seekers to obtain on-the-job training, typically offered as a summer
          # position.
          INTERN = 6

          # The is an opportunity for an individual to volunteer, where there's no
          # expectation of compensation for the provided services.
          VOLUNTEER = 7

          # The job requires an employee to work on an as-needed basis with a
          # flexible schedule.
          PER_DIEM = 8

          # The job involves employing people in remote areas and flying them
          # temporarily to the work site instead of relocating employees and their
          # families permanently.
          FLY_IN_FLY_OUT = 9

          # The job does not fit any of the other listed types.
          OTHER_EMPLOYMENT_TYPE = 10
        end

        # Input only.
        #
        # Option for HTML content sanitization on user input fields, for example, job
        # description. By setting this option, user can determine whether and how
        # sanitization is performed on these fields.
        module HtmlSanitization
          # Default value.
          HTML_SANITIZATION_UNSPECIFIED = 0

          # Disables sanitization on HTML input.
          HTML_SANITIZATION_DISABLED = 1

          # Sanitizes HTML input, only accepts bold, italic, ordered list, and
          # unordered list markup tags.
          SIMPLE_FORMATTING_ONLY = 2
        end

        # An enum that represents employee benefits included with the job.
        module JobBenefit
          # Default value if the type isn't specified.
          JOB_BENEFIT_UNSPECIFIED = 0

          # The job includes access to programs that support child care, such
          # as daycare.
          CHILD_CARE = 1

          # The job includes dental services covered by a dental
          # insurance plan.
          DENTAL = 2

          # The job offers specific benefits to domestic partners.
          DOMESTIC_PARTNER = 3

          # The job allows for a flexible work schedule.
          FLEXIBLE_HOURS = 4

          # The job includes health services covered by a medical insurance plan.
          MEDICAL = 5

          # The job includes a life insurance plan provided by the employer or
          # available for purchase by the employee.
          LIFE_INSURANCE = 6

          # The job allows for a leave of absence to a parent to care for a newborn
          # child.
          PARENTAL_LEAVE = 7

          # The job includes a workplace retirement plan provided by the
          # employer or available for purchase by the employee.
          RETIREMENT_PLAN = 8

          # The job allows for paid time off due to illness.
          SICK_DAYS = 9

          # The job includes paid time off for vacation.
          VACATION = 10

          # The job includes vision services covered by a vision
          # insurance plan.
          VISION = 11
        end

        # An enum that represents the categorization or primary focus of specific
        # role. This value is different than the "industry" associated with a role,
        # which is related to the categorization of the company listing the job.
        module JobCategory
          # The default value if the category isn't specified.
          JOB_CATEGORY_UNSPECIFIED = 0

          # An accounting and finance job, such as an Accountant.
          ACCOUNTING_AND_FINANCE = 1

          # An administrative and office job, such as an Administrative Assistant.
          ADMINISTRATIVE_AND_OFFICE = 2

          # An advertising and marketing job, such as Marketing Manager.
          ADVERTISING_AND_MARKETING = 3

          # An animal care job, such as Veterinarian.
          ANIMAL_CARE = 4

          # An art, fashion, or design job, such as Designer.
          ART_FASHION_AND_DESIGN = 5

          # A business operations job, such as Business Operations Manager.
          BUSINESS_OPERATIONS = 6

          # A cleaning and facilities job, such as Custodial Staff.
          CLEANING_AND_FACILITIES = 7

          # A computer and IT job, such as Systems Administrator.
          COMPUTER_AND_IT = 8

          # A construction job, such as General Laborer.
          CONSTRUCTION = 9

          # A customer service job, such s Cashier.
          CUSTOMER_SERVICE = 10

          # An education job, such as School Teacher.
          EDUCATION = 11

          # An entertainment and travel job, such as Flight Attendant.
          ENTERTAINMENT_AND_TRAVEL = 12

          # A farming or outdoor job, such as Park Ranger.
          FARMING_AND_OUTDOORS = 13

          # A healthcare job, such as Registered Nurse.
          HEALTHCARE = 14

          # A human resources job, such as Human Resources Director.
          HUMAN_RESOURCES = 15

          # An installation, maintenance, or repair job, such as Electrician.
          INSTALLATION_MAINTENANCE_AND_REPAIR = 16

          # A legal job, such as Law Clerk.
          LEGAL = 17

          # A management job, often used in conjunction with another category,
          # such as Store Manager.
          MANAGEMENT = 18

          # A manufacturing or warehouse job, such as Assembly Technician.
          MANUFACTURING_AND_WAREHOUSE = 19

          # A media, communications, or writing job, such as Media Relations.
          MEDIA_COMMUNICATIONS_AND_WRITING = 20

          # An oil, gas or mining job, such as Offshore Driller.
          OIL_GAS_AND_MINING = 21

          # A personal care and services job, such as Hair Stylist.
          PERSONAL_CARE_AND_SERVICES = 22

          # A protective services job, such as Security Guard.
          PROTECTIVE_SERVICES = 23

          # A real estate job, such as Buyer's Agent.
          REAL_ESTATE = 24

          # A restaurant and hospitality job, such as Restaurant Server.
          RESTAURANT_AND_HOSPITALITY = 25

          # A sales and/or retail job, such Sales Associate.
          SALES_AND_RETAIL = 26

          # A science and engineering job, such as Lab Technician.
          SCIENCE_AND_ENGINEERING = 27

          # A social services or non-profit job, such as Case Worker.
          SOCIAL_SERVICES_AND_NON_PROFIT = 28

          # A sports, fitness, or recreation job, such as Personal Trainer.
          SPORTS_FITNESS_AND_RECREATION = 29

          # A transportation or logistics job, such as Truck Driver.
          TRANSPORTATION_AND_LOGISTICS = 30
        end

        # An enum that represents the required experience level required for the job.
        module JobLevel
          # The default value if the level isn't specified.
          JOB_LEVEL_UNSPECIFIED = 0

          # Entry-level individual contributors, typically with less than 2 years of
          # experience in a similar role. Includes interns.
          ENTRY_LEVEL = 1

          # Experienced individual contributors, typically with 2+ years of
          # experience in a similar role.
          EXPERIENCED = 2

          # Entry- to mid-level managers responsible for managing a team of people.
          MANAGER = 3

          # Senior-level managers responsible for managing teams of managers.
          DIRECTOR = 4

          # Executive-level managers and above, including C-level positions.
          EXECUTIVE = 5
        end

        # The overall outcome /decision / result indicator.
        module Outcome
          # Default value.
          OUTCOME_UNSPECIFIED = 0

          # A positive outcome / passing indicator (for example, candidate was
          # recommended for hiring or to be moved forward in the hiring process,
          # candidate passed a test).
          POSITIVE = 1

          # A neutral outcome / no clear indicator (for example, no strong
          # reccommendation either to move forward / not move forward, neutral score).
          NEUTRAL = 2

          # A negative outcome / failing indicator (for example, candidate was
          # recommended to NOT move forward in the hiring process, failed a test).
          NEGATIVE = 3

          # The assessment outcome is not available or otherwise unknown (for example,
          # candidate did not complete assessment).
          OUTCOME_NOT_AVAILABLE = 4
        end

        # An enum that represents the job posting region. In most cases, job postings
        # don't need to specify a region. If a region is given, jobs are
        # eligible for searches in the specified region.
        module PostingRegion
          # If the region is unspecified, the job is only returned if it
          # matches the {Google::Cloud::Talent::V4beta1::LocationFilter LocationFilter}.
          POSTING_REGION_UNSPECIFIED = 0

          # In addition to exact location matching, job posting is returned when the
          # {Google::Cloud::Talent::V4beta1::LocationFilter LocationFilter} in the search query is in the same administrative area
          # as the returned job posting. For example, if a `ADMINISTRATIVE_AREA` job
          # is posted in "CA, USA", it's returned if {Google::Cloud::Talent::V4beta1::LocationFilter LocationFilter} has
          # "Mountain View".
          #
          # Administrative area refers to top-level administrative subdivision of this
          # country. For example, US state, IT region, UK constituent nation and
          # JP prefecture.
          ADMINISTRATIVE_AREA = 1

          # In addition to exact location matching, job is returned when
          # {Google::Cloud::Talent::V4beta1::LocationFilter LocationFilter} in search query is in the same country as this job.
          # For example, if a `NATION_WIDE` job is posted in "USA", it's
          # returned if {Google::Cloud::Talent::V4beta1::LocationFilter LocationFilter} has 'Mountain View'.
          NATION = 2

          # Job allows employees to work remotely (telecommute).
          # If {Locations} are provided with this value, the job is
          # considered as having a location, but telecommuting is allowed.
          TELECOMMUTE = 3
        end

        # Enum that represents the skill proficiency level.
        module SkillProficiencyLevel
          # Default value.
          SKILL_PROFICIENCY_LEVEL_UNSPECIFIED = 0

          # Have a common knowledge or an understanding of basic techniques and
          # concepts.
          FUNDAMENTAL_AWARENESS = 1

          # Have the level of experience gained in a classroom and/or experimental
          # scenarios or as a trainee on-the-job.
          NOVICE = 2

          # Be able to successfully complete tasks in this skill as requested. Help
          # from an expert may be required from time to time, but can usually perform
          # skill independently.
          INTERMEDIATE = 3

          # Can perform the actions associated with this skill without assistance.
          ADVANCED = 4

          # Known as an expert in this area.
          EXPERT = 5
        end

        # An enum that represents who has view access to the resource.
        module Visibility
          # Default value.
          VISIBILITY_UNSPECIFIED = 0

          # The resource is only visible to the GCP account who owns it.
          ACCOUNT_ONLY = 1

          # The resource is visible to the owner and may be visible to other
          # applications and processes at Google.
          SHARED_WITH_GOOGLE = 2

          # The resource is visible to the owner and may be visible to all other API
          # clients.
          SHARED_WITH_PUBLIC = 3
        end
      end
    end
  end
end