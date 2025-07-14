# NameFilterGet


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match_required** | **bool** |  | 
**match_first_letters** | **int** |  | 
**match_begins_with** | **bool** |  | 
**match_full_name** | **bool** |  | 

## Example

```python
from natcrim_api_client.models.name_filter_get import NameFilterGet

# TODO update the JSON string below
json = "{}"
# create an instance of NameFilterGet from a JSON string
name_filter_get_instance = NameFilterGet.from_json(json)
# print the JSON string representation of the object
print NameFilterGet.to_json()

# convert the object into a dict
name_filter_get_dict = name_filter_get_instance.to_dict()
# create an instance of NameFilterGet from a dict
name_filter_get_form_dict = name_filter_get.from_dict(name_filter_get_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


