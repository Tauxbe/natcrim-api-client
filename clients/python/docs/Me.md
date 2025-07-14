# Me


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer** | [**Customer**](Customer.md) |  | 
**sub_account** | [**SubAccount**](SubAccount.md) |  | 

## Example

```python
from natcrim_api_client.models.me import Me

# TODO update the JSON string below
json = "{}"
# create an instance of Me from a JSON string
me_instance = Me.from_json(json)
# print the JSON string representation of the object
print Me.to_json()

# convert the object into a dict
me_dict = me_instance.to_dict()
# create an instance of Me from a dict
me_form_dict = me.from_dict(me_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


