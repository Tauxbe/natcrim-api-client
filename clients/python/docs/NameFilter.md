# NameFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match_required** | **bool** |  | [optional] [default to True]
**match_first_letters** | **int** |  | [optional] [default to 0]
**match_begins_with** | **bool** |  | [optional] [default to False]
**match_full_name** | **bool** |  | [optional] [default to True]

## Example

```python
from natcrim_api_client.models.name_filter import NameFilter

# TODO update the JSON string below
json = "{}"
# create an instance of NameFilter from a JSON string
name_filter_instance = NameFilter.from_json(json)
# print the JSON string representation of the object
print NameFilter.to_json()

# convert the object into a dict
name_filter_dict = name_filter_instance.to_dict()
# create an instance of NameFilter from a dict
name_filter_form_dict = name_filter.from_dict(name_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


