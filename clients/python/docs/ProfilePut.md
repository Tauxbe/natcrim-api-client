# ProfilePut


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
from natcrim_api_client.models.profile_put import ProfilePut

# TODO update the JSON string below
json = "{}"
# create an instance of ProfilePut from a JSON string
profile_put_instance = ProfilePut.from_json(json)
# print the JSON string representation of the object
print ProfilePut.to_json()

# convert the object into a dict
profile_put_dict = profile_put_instance.to_dict()
# create an instance of ProfilePut from a dict
profile_put_form_dict = profile_put.from_dict(profile_put_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


