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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.NatcrimApiClient);
  }
}(this, function(expect, NatcrimApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new NatcrimApiClient.OrderRequestPostProfileDef();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('OrderRequestPostProfileDef', function() {
    it('should create an instance of OrderRequestPostProfileDef', function() {
      // uncomment below and update the code to test OrderRequestPostProfileDef
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be.a(NatcrimApiClient.OrderRequestPostProfileDef);
    });

    it('should have the property tag (base name: "tag")', function() {
      // uncomment below and update the code to test the property tag
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be();
    });

    it('should have the property firstName (base name: "first_name")', function() {
      // uncomment below and update the code to test the property firstName
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be();
    });

    it('should have the property middleName (base name: "middle_name")', function() {
      // uncomment below and update the code to test the property middleName
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be();
    });

    it('should have the property lastName (base name: "last_name")', function() {
      // uncomment below and update the code to test the property lastName
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be();
    });

    it('should have the property dob (base name: "dob")', function() {
      // uncomment below and update the code to test the property dob
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be();
    });

    it('should have the property sourceTypes (base name: "source_types")', function() {
      // uncomment below and update the code to test the property sourceTypes
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be();
    });

    it('should have the property maxAge (base name: "max_age")', function() {
      // uncomment below and update the code to test the property maxAge
      //var instance = new NatcrimApiClient.OrderRequestPostProfileDef();
      //expect(instance).to.be();
    });

  });

}));
