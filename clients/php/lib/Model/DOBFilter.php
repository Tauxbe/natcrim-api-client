<?php
/**
 * DOBFilter
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * NatCrim Service Integration
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.3.7
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 7.1.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * DOBFilter Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class DOBFilter implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'DOBFilter';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'allow_off_by_one' => 'bool',
        'allow_empty_dob' => 'bool',
        'minimum_components_matched' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'allow_off_by_one' => null,
        'allow_empty_dob' => null,
        'minimum_components_matched' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'allow_off_by_one' => false,
		'allow_empty_dob' => false,
		'minimum_components_matched' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'allow_off_by_one' => 'allow_off_by_one',
        'allow_empty_dob' => 'allow_empty_dob',
        'minimum_components_matched' => 'minimum_components_matched'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'allow_off_by_one' => 'setAllowOffByOne',
        'allow_empty_dob' => 'setAllowEmptyDob',
        'minimum_components_matched' => 'setMinimumComponentsMatched'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'allow_off_by_one' => 'getAllowOffByOne',
        'allow_empty_dob' => 'getAllowEmptyDob',
        'minimum_components_matched' => 'getMinimumComponentsMatched'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('allow_off_by_one', $data ?? [], false);
        $this->setIfExists('allow_empty_dob', $data ?? [], false);
        $this->setIfExists('minimum_components_matched', $data ?? [], 3);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['minimum_components_matched']) && ($this->container['minimum_components_matched'] > 3)) {
            $invalidProperties[] = "invalid value for 'minimum_components_matched', must be smaller than or equal to 3.";
        }

        if (!is_null($this->container['minimum_components_matched']) && ($this->container['minimum_components_matched'] < 1)) {
            $invalidProperties[] = "invalid value for 'minimum_components_matched', must be bigger than or equal to 1.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets allow_off_by_one
     *
     * @return bool|null
     */
    public function getAllowOffByOne()
    {
        return $this->container['allow_off_by_one'];
    }

    /**
     * Sets allow_off_by_one
     *
     * @param bool|null $allow_off_by_one Allow any one part of the DOB: month, day, year, to be different by no more than 1.
     *
     * @return self
     */
    public function setAllowOffByOne($allow_off_by_one)
    {
        if (is_null($allow_off_by_one)) {
            throw new \InvalidArgumentException('non-nullable allow_off_by_one cannot be null');
        }
        $this->container['allow_off_by_one'] = $allow_off_by_one;

        return $this;
    }

    /**
     * Gets allow_empty_dob
     *
     * @return bool|null
     */
    public function getAllowEmptyDob()
    {
        return $this->container['allow_empty_dob'];
    }

    /**
     * Sets allow_empty_dob
     *
     * @param bool|null $allow_empty_dob Match records with no DOB
     *
     * @return self
     */
    public function setAllowEmptyDob($allow_empty_dob)
    {
        if (is_null($allow_empty_dob)) {
            throw new \InvalidArgumentException('non-nullable allow_empty_dob cannot be null');
        }
        $this->container['allow_empty_dob'] = $allow_empty_dob;

        return $this;
    }

    /**
     * Gets minimum_components_matched
     *
     * @return int|null
     */
    public function getMinimumComponentsMatched()
    {
        return $this->container['minimum_components_matched'];
    }

    /**
     * Sets minimum_components_matched
     *
     * @param int|null $minimum_components_matched How many of the parts of the DOB must match the searched DOB
     *
     * @return self
     */
    public function setMinimumComponentsMatched($minimum_components_matched)
    {
        if (is_null($minimum_components_matched)) {
            throw new \InvalidArgumentException('non-nullable minimum_components_matched cannot be null');
        }

        if (($minimum_components_matched > 3)) {
            throw new \InvalidArgumentException('invalid value for $minimum_components_matched when calling DOBFilter., must be smaller than or equal to 3.');
        }
        if (($minimum_components_matched < 1)) {
            throw new \InvalidArgumentException('invalid value for $minimum_components_matched when calling DOBFilter., must be bigger than or equal to 1.');
        }

        $this->container['minimum_components_matched'] = $minimum_components_matched;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


