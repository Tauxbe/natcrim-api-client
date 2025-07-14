# Profile


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag** | [**Tag**](Tag.md) |  | [optional] 
**first_name** | [**NameFilterGet**](NameFilterGet.md) |  | 
**middle_name** | [**NameFilterGet**](NameFilterGet.md) |  | 
**last_name** | [**NameFilterGet**](NameFilterGet.md) |  | 
**dob** | [**DOBFilterGet**](DOBFilterGet.md) |  | 
**source_types** | [**SourceTypes**](SourceTypes.md) |  | [optional] 
**max_age** | [**ProfileMaxAge**](ProfileMaxAge.md) |  | [optional] 
**id** | **object** |  | 
**is_deleted** | **object** |  | 

## Example

```python
from natcrim_api_client.models.profile import Profile

# TODO update the JSON string below
json = "{}"
# create an instance of Profile from a JSON string
profile_instance = Profile.from_json(json)
# print the JSON string representation of the object
print Profile.to_json()

# convert the object into a dict
profile_dict = profile_instance.to_dict()
# create an instance of Profile from a dict
profile_form_dict = profile.from_dict(profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


