# MaxAge


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **int** |  | [optional] 
**max_age_field** | [**MaxAgeFieldSelector**](MaxAgeFieldSelector.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.max_age import MaxAge

# TODO update the JSON string below
json = "{}"
# create an instance of MaxAge from a JSON string
max_age_instance = MaxAge.from_json(json)
# print the JSON string representation of the object
print MaxAge.to_json()

# convert the object into a dict
max_age_dict = max_age_instance.to_dict()
# create an instance of MaxAge from a dict
max_age_form_dict = max_age.from_dict(max_age_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


