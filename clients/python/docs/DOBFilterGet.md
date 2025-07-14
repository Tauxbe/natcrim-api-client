# DOBFilterGet


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_off_by_one** | **bool** |  | [optional] [default to False]
**allow_empty_dob** | **bool** |  | [optional] [default to False]
**minimum_components_matched** | **int** |  | [optional] [default to 3]

## Example

```python
from natcrim_api_client.models.dob_filter_get import DOBFilterGet

# TODO update the JSON string below
json = "{}"
# create an instance of DOBFilterGet from a JSON string
dob_filter_get_instance = DOBFilterGet.from_json(json)
# print the JSON string representation of the object
print DOBFilterGet.to_json()

# convert the object into a dict
dob_filter_get_dict = dob_filter_get_instance.to_dict()
# create an instance of DOBFilterGet from a dict
dob_filter_get_form_dict = dob_filter_get.from_dict(dob_filter_get_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


