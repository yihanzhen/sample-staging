<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/common.proto

namespace Google\Cloud\Talent\V4beta1;

use UnexpectedValueException;

/**
 * An enum that represents the size of the company.
 *
 * Protobuf type <code>google.cloud.talent.v4beta1.CompanySize</code>
 */
class CompanySize
{
    /**
     * Default value if the size isn't specified.
     *
     * Generated from protobuf enum <code>COMPANY_SIZE_UNSPECIFIED = 0;</code>
     */
    const COMPANY_SIZE_UNSPECIFIED = 0;
    /**
     * The company has less than 50 employees.
     *
     * Generated from protobuf enum <code>MINI = 1;</code>
     */
    const MINI = 1;
    /**
     * The company has between 50 and 99 employees.
     *
     * Generated from protobuf enum <code>SMALL = 2;</code>
     */
    const SMALL = 2;
    /**
     * The company has between 100 and 499 employees.
     *
     * Generated from protobuf enum <code>SMEDIUM = 3;</code>
     */
    const SMEDIUM = 3;
    /**
     * The company has between 500 and 999 employees.
     *
     * Generated from protobuf enum <code>MEDIUM = 4;</code>
     */
    const MEDIUM = 4;
    /**
     * The company has between 1,000 and 4,999 employees.
     *
     * Generated from protobuf enum <code>BIG = 5;</code>
     */
    const BIG = 5;
    /**
     * The company has between 5,000 and 9,999 employees.
     *
     * Generated from protobuf enum <code>BIGGER = 6;</code>
     */
    const BIGGER = 6;
    /**
     * The company has 10,000 or more employees.
     *
     * Generated from protobuf enum <code>GIANT = 7;</code>
     */
    const GIANT = 7;

    private static $valueToName = [
        self::COMPANY_SIZE_UNSPECIFIED => 'COMPANY_SIZE_UNSPECIFIED',
        self::MINI => 'MINI',
        self::SMALL => 'SMALL',
        self::SMEDIUM => 'SMEDIUM',
        self::MEDIUM => 'MEDIUM',
        self::BIG => 'BIG',
        self::BIGGER => 'BIGGER',
        self::GIANT => 'GIANT',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}

