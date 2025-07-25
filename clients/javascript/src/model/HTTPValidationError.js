/**
 * NatCrim Service Integration
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.3.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ValidationError from './ValidationError';

/**
 * The HTTPValidationError model module.
 * @module model/HTTPValidationError
 * @version 1.0.0
 */
class HTTPValidationError {
    /**
     * Constructs a new <code>HTTPValidationError</code>.
     * @alias module:model/HTTPValidationError
     */
    constructor() { 
        
        HTTPValidationError.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HTTPValidationError</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HTTPValidationError} obj Optional instance to populate.
     * @return {module:model/HTTPValidationError} The populated <code>HTTPValidationError</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HTTPValidationError();

            if (data.hasOwnProperty('detail')) {
                obj['detail'] = ApiClient.convertToType(data['detail'], [ValidationError]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HTTPValidationError</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HTTPValidationError</code>.
     */
    static validateJSON(data) {
        if (data['detail']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['detail'])) {
                throw new Error("Expected the field `detail` to be an array in the JSON data but got " + data['detail']);
            }
            // validate the optional field `detail` (array)
            for (const item of data['detail']) {
                ValidationError.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * @member {Array.<module:model/ValidationError>} detail
 */
HTTPValidationError.prototype['detail'] = undefined;






export default HTTPValidationError;

