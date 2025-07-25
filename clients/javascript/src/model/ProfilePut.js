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
import DOBFilter from './DOBFilter';
import NameFilter from './NameFilter';
import ProfileDefinitionMaxAge from './ProfileDefinitionMaxAge';
import SourceTypes from './SourceTypes';
import Tag1 from './Tag1';

/**
 * The ProfilePut model module.
 * @module model/ProfilePut
 * @version 1.0.0
 */
class ProfilePut {
    /**
     * Constructs a new <code>ProfilePut</code>.
     * @alias module:model/ProfilePut
     * @param firstName {module:model/NameFilter} 
     * @param middleName {module:model/NameFilter} 
     * @param lastName {module:model/NameFilter} 
     * @param dob {module:model/DOBFilter} 
     */
    constructor(firstName, middleName, lastName, dob) { 
        
        ProfilePut.initialize(this, firstName, middleName, lastName, dob);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, firstName, middleName, lastName, dob) { 
        obj['first_name'] = firstName;
        obj['middle_name'] = middleName;
        obj['last_name'] = lastName;
        obj['dob'] = dob;
    }

    /**
     * Constructs a <code>ProfilePut</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfilePut} obj Optional instance to populate.
     * @return {module:model/ProfilePut} The populated <code>ProfilePut</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfilePut();

            if (data.hasOwnProperty('tag')) {
                obj['tag'] = Tag1.constructFromObject(data['tag']);
            }
            if (data.hasOwnProperty('first_name')) {
                obj['first_name'] = NameFilter.constructFromObject(data['first_name']);
            }
            if (data.hasOwnProperty('middle_name')) {
                obj['middle_name'] = NameFilter.constructFromObject(data['middle_name']);
            }
            if (data.hasOwnProperty('last_name')) {
                obj['last_name'] = NameFilter.constructFromObject(data['last_name']);
            }
            if (data.hasOwnProperty('dob')) {
                obj['dob'] = DOBFilter.constructFromObject(data['dob']);
            }
            if (data.hasOwnProperty('source_types')) {
                obj['source_types'] = SourceTypes.constructFromObject(data['source_types']);
            }
            if (data.hasOwnProperty('max_age')) {
                obj['max_age'] = ProfileDefinitionMaxAge.constructFromObject(data['max_age']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ProfilePut</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ProfilePut</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ProfilePut.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `tag`
        if (data['tag']) { // data not null
          Tag1.validateJSON(data['tag']);
        }
        // validate the optional field `first_name`
        if (data['first_name']) { // data not null
          NameFilter.validateJSON(data['first_name']);
        }
        // validate the optional field `middle_name`
        if (data['middle_name']) { // data not null
          NameFilter.validateJSON(data['middle_name']);
        }
        // validate the optional field `last_name`
        if (data['last_name']) { // data not null
          NameFilter.validateJSON(data['last_name']);
        }
        // validate the optional field `dob`
        if (data['dob']) { // data not null
          DOBFilter.validateJSON(data['dob']);
        }
        // validate the optional field `source_types`
        if (data['source_types']) { // data not null
          SourceTypes.validateJSON(data['source_types']);
        }
        // validate the optional field `max_age`
        if (data['max_age']) { // data not null
          ProfileDefinitionMaxAge.validateJSON(data['max_age']);
        }

        return true;
    }


}

ProfilePut.RequiredProperties = ["first_name", "middle_name", "last_name", "dob"];

/**
 * @member {module:model/Tag1} tag
 */
ProfilePut.prototype['tag'] = undefined;

/**
 * @member {module:model/NameFilter} first_name
 */
ProfilePut.prototype['first_name'] = undefined;

/**
 * @member {module:model/NameFilter} middle_name
 */
ProfilePut.prototype['middle_name'] = undefined;

/**
 * @member {module:model/NameFilter} last_name
 */
ProfilePut.prototype['last_name'] = undefined;

/**
 * @member {module:model/DOBFilter} dob
 */
ProfilePut.prototype['dob'] = undefined;

/**
 * @member {module:model/SourceTypes} source_types
 */
ProfilePut.prototype['source_types'] = undefined;

/**
 * @member {module:model/ProfileDefinitionMaxAge} max_age
 */
ProfilePut.prototype['max_age'] = undefined;






export default ProfilePut;

