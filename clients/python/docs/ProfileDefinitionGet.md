# ProfileDefinitionGet


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag** | **str** |  | [optional] 
**first_name** | [**NameFilterGet**](NameFilterGet.md) |  | 
**middle_name** | [**NameFilterGet**](NameFilterGet.md) |  | 
**last_name** | [**NameFilterGet**](NameFilterGet.md) |  | 
**dob** | [**DOBFilterGet**](DOBFilterGet.md) |  | 
**source_types** | [**AnyOf**](AnyOf.md) | Source types filter. Includes all types by default | [optional] 
**max_age** | [**MaxAgeGet**](MaxAgeGet.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.profile_definition_get import ProfileDefinitionGet

# TODO update the JSON string below
json = "{}"
# create an instance of ProfileDefinitionGet from a JSON string
profile_definition_get_instance = ProfileDefinitionGet.from_json(json)
# print the JSON string representation of the object
print ProfileDefinitionGet.to_json()

# convert the object into a dict
profile_definition_get_dict = profile_definition_get_instance.to_dict()
# create an instance of ProfileDefinitionGet from a dict
profile_definition_get_form_dict = profile_definition_get.from_dict(profile_definition_get_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


