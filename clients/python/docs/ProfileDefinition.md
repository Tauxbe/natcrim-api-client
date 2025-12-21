# ProfileDefinition


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag** | **str** |  | [optional] 
**first_name** | [**NameFilter**](NameFilter.md) |  | 
**middle_name** | [**NameFilter**](NameFilter.md) |  | 
**last_name** | [**NameFilter**](NameFilter.md) |  | 
**dob** | [**DOBFilter**](DOBFilter.md) |  | 
**source_types** | [**AnyOf**](AnyOf.md) | Source types filter. Includes all types by default | [optional] 
**max_age** | [**MaxAge**](MaxAge.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.profile_definition import ProfileDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of ProfileDefinition from a JSON string
profile_definition_instance = ProfileDefinition.from_json(json)
# print the JSON string representation of the object
print ProfileDefinition.to_json()

# convert the object into a dict
profile_definition_dict = profile_definition_instance.to_dict()
# create an instance of ProfileDefinition from a dict
profile_definition_form_dict = profile_definition.from_dict(profile_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


