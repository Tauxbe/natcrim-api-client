# OrderRequestPostProfileDef

Search profile of this order. Does not have to match the definition referenced by the profile ID.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag** | [**Tag**](Tag.md) |  | [optional] 
**first_name** | [**NameFilter**](NameFilter.md) |  | 
**middle_name** | [**NameFilter**](NameFilter.md) |  | 
**last_name** | [**NameFilter**](NameFilter.md) |  | 
**dob** | [**DOBFilter**](DOBFilter.md) |  | 
**source_types** | [**SourceTypes**](SourceTypes.md) |  | [optional] 
**max_age** | [**ProfileDefinitionMaxAge**](ProfileDefinitionMaxAge.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.order_request_post_profile_def import OrderRequestPostProfileDef

# TODO update the JSON string below
json = "{}"
# create an instance of OrderRequestPostProfileDef from a JSON string
order_request_post_profile_def_instance = OrderRequestPostProfileDef.from_json(json)
# print the JSON string representation of the object
print OrderRequestPostProfileDef.to_json()

# convert the object into a dict
order_request_post_profile_def_dict = order_request_post_profile_def_instance.to_dict()
# create an instance of OrderRequestPostProfileDef from a dict
order_request_post_profile_def_form_dict = order_request_post_profile_def.from_dict(order_request_post_profile_def_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


