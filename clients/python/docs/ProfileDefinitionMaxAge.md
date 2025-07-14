# ProfileDefinitionMaxAge


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **object** |  | [optional] 
**max_age_field** | [**MaxAgeFieldSelector**](MaxAgeFieldSelector.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.profile_definition_max_age import ProfileDefinitionMaxAge

# TODO update the JSON string below
json = "{}"
# create an instance of ProfileDefinitionMaxAge from a JSON string
profile_definition_max_age_instance = ProfileDefinitionMaxAge.from_json(json)
# print the JSON string representation of the object
print ProfileDefinitionMaxAge.to_json()

# convert the object into a dict
profile_definition_max_age_dict = profile_definition_max_age_instance.to_dict()
# create an instance of ProfileDefinitionMaxAge from a dict
profile_definition_max_age_form_dict = profile_definition_max_age.from_dict(profile_definition_max_age_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


