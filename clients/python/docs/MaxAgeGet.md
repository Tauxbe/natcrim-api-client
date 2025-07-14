# MaxAgeGet


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **int** |  | [optional] 
**max_age_field** | [**MaxAgeFieldSelector**](MaxAgeFieldSelector.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.max_age_get import MaxAgeGet

# TODO update the JSON string below
json = "{}"
# create an instance of MaxAgeGet from a JSON string
max_age_get_instance = MaxAgeGet.from_json(json)
# print the JSON string representation of the object
print MaxAgeGet.to_json()

# convert the object into a dict
max_age_get_dict = max_age_get_instance.to_dict()
# create an instance of MaxAgeGet from a dict
max_age_get_form_dict = max_age_get.from_dict(max_age_get_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


