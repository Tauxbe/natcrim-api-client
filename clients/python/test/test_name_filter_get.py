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

from natcrim_api_client.models.name_filter_get import NameFilterGet

class TestNameFilterGet(unittest.TestCase):
    """NameFilterGet unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> NameFilterGet:
        """Test NameFilterGet
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `NameFilterGet`
        """
        model = NameFilterGet()
        if include_optional:
            return NameFilterGet(
                match_required = True,
                match_first_letters = 56,
                match_begins_with = True,
                match_full_name = True
            )
        else:
            return NameFilterGet(
                match_required = True,
                match_first_letters = 56,
                match_begins_with = True,
                match_full_name = True,
        )
        """

    def testNameFilterGet(self):
        """Test NameFilterGet"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
