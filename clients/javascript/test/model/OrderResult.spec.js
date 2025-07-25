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
    instance = new NatcrimApiClient.OrderResult();
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

  describe('OrderResult', function() {
    it('should create an instance of OrderResult', function() {
      // uncomment below and update the code to test OrderResult
      //var instance = new NatcrimApiClient.OrderResult();
      //expect(instance).to.be.a(NatcrimApiClient.OrderResult);
    });

    it('should have the property completedAt (base name: "completed_at")', function() {
      // uncomment below and update the code to test the property completedAt
      //var instance = new NatcrimApiClient.OrderResult();
      //expect(instance).to.be();
    });

    it('should have the property failure (base name: "failure")', function() {
      // uncomment below and update the code to test the property failure
      //var instance = new NatcrimApiClient.OrderResult();
      //expect(instance).to.be();
    });

    it('should have the property success (base name: "success")', function() {
      // uncomment below and update the code to test the property success
      //var instance = new NatcrimApiClient.OrderResult();
      //expect(instance).to.be();
    });

    it('should have the property maxResults (base name: "max_results")', function() {
      // uncomment below and update the code to test the property maxResults
      //var instance = new NatcrimApiClient.OrderResult();
      //expect(instance).to.be();
    });

  });

}));
