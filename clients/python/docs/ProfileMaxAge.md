# ProfileMaxAge


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **object** |  | [optional] 
**max_age_field** | [**MaxAgeFieldSelector**](MaxAgeFieldSelector.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.profile_max_age import ProfileMaxAge

# TODO update the JSON string below
json = "{}"
# create an instance of ProfileMaxAge from a JSON string
profile_max_age_instance = ProfileMaxAge.from_json(json)
# print the JSON string representation of the object
print ProfileMaxAge.to_json()

# convert the object into a dict
profile_max_age_dict = profile_max_age_instance.to_dict()
# create an instance of ProfileMaxAge from a dict
profile_max_age_form_dict = profile_max_age.from_dict(profile_max_age_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


