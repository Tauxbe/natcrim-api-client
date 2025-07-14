# SubAccount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **object** |  | 
**name** | **object** | Descriptive name of sub-account | 
**email** | **object** | Email address. Also functions as a username if a password is set | 
**default_profile** | [**DefaultProfile**](DefaultProfile.md) |  | 
**is_deleted** | **object** |  | 

## Example

```python
from natcrim_api_client.models.sub_account import SubAccount

# TODO update the JSON string below
json = "{}"
# create an instance of SubAccount from a JSON string
sub_account_instance = SubAccount.from_json(json)
# print the JSON string representation of the object
print SubAccount.to_json()

# convert the object into a dict
sub_account_dict = sub_account_instance.to_dict()
# create an instance of SubAccount from a dict
sub_account_form_dict = sub_account.from_dict(sub_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


