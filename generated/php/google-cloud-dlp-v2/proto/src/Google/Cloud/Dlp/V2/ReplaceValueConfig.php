<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Replace each input value with a given `Value`.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.ReplaceValueConfig</code>
 */
class ReplaceValueConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Value to replace it with.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    private $new_value = null;

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct();
    }

    /**
     * Value to replace it with.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     * @return \Google\Cloud\Dlp\V2\Value
     */
    public function getNewValue()
    {
        return $this->new_value;
    }

    /**
     * Value to replace it with.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     * @param \Google\Cloud\Dlp\V2\Value $var
     * @return $this
     */
    public function setNewValue($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\Value::class);
        $this->new_value = $var;

        return $this;
    }

}
