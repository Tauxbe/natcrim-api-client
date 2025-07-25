# coding: utf-8

"""
    NatCrim Service Integration

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1.3.7
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from natcrim_api_client.models.validation_error import ValidationError

class TestValidationError(unittest.TestCase):
    """ValidationError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ValidationError:
        """Test ValidationError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ValidationError`
        """
        model = ValidationError()
        if include_optional:
            return ValidationError(
                loc = None,
                msg = None,
                type = None
            )
        else:
            return ValidationError(
                loc = None,
                msg = None,
                type = None,
        )
        """

    def testValidationError(self):
        """Test ValidationError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
