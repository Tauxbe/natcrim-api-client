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
import MaxResults2 from './MaxResults2';
import OrderResultFailure from './OrderResultFailure';
import OrderResultSuccess from './OrderResultSuccess';

/**
 * The OrderResult model module.
 * @module model/OrderResult
 * @version 1.0.0
 */
class OrderResult {
    /**
     * Constructs a new <code>OrderResult</code>.
     * @alias module:model/OrderResult
     * @param completedAt {Object} 
     * @param failure {module:model/OrderResultFailure} 
     * @param success {module:model/OrderResultSuccess} 
     */
    constructor(completedAt, failure, success) { 
        
        OrderResult.initialize(this, completedAt, failure, success);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, completedAt, failure, success) { 
        obj['completed_at'] = completedAt;
        obj['failure'] = failure;
        obj['success'] = success;
    }

    /**
     * Constructs a <code>OrderResult</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderResult} obj Optional instance to populate.
     * @return {module:model/OrderResult} The populated <code>OrderResult</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderResult();

            if (data.hasOwnProperty('completed_at')) {
                obj['completed_at'] = ApiClient.convertToType(data['completed_at'], Object);
            }
            if (data.hasOwnProperty('failure')) {
                obj['failure'] = OrderResultFailure.constructFromObject(data['failure']);
            }
            if (data.hasOwnProperty('success')) {
                obj['success'] = OrderResultSuccess.constructFromObject(data['success']);
            }
            if (data.hasOwnProperty('max_results')) {
                obj['max_results'] = MaxResults2.constructFromObject(data['max_results']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OrderResult</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrderResult</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OrderResult.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `failure`
        if (data['failure']) { // data not null
          OrderResultFailure.validateJSON(data['failure']);
        }
        // validate the optional field `success`
        if (data['success']) { // data not null
          OrderResultSuccess.validateJSON(data['success']);
        }
        // validate the optional field `max_results`
        if (data['max_results']) { // data not null
          MaxResults2.validateJSON(data['max_results']);
        }

        return true;
    }


}

OrderResult.RequiredProperties = ["completed_at", "failure", "success"];

/**
 * @member {Object} completed_at
 */
OrderResult.prototype['completed_at'] = undefined;

/**
 * @member {module:model/OrderResultFailure} failure
 */
OrderResult.prototype['failure'] = undefined;

/**
 * @member {module:model/OrderResultSuccess} success
 */
OrderResult.prototype['success'] = undefined;

/**
 * @member {module:model/MaxResults2} max_results
 */
OrderResult.prototype['max_results'] = undefined;






export default OrderResult;

