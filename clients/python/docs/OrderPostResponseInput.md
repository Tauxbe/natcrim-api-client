# OrderPostResponseInput


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**created_at** | **datetime** |  | 
**sub_account_id** | **str** |  | 
**result** | [**OrderResult**](OrderResult.md) |  | 
**content** | [**AnyOf**](AnyOf.md) |  | 

## Example

```python
from natcrim_api_client.models.order_post_response_input import OrderPostResponseInput

# TODO update the JSON string below
json = "{}"
# create an instance of OrderPostResponseInput from a JSON string
order_post_response_input_instance = OrderPostResponseInput.from_json(json)
# print the JSON string representation of the object
print OrderPostResponseInput.to_json()

# convert the object into a dict
order_post_response_input_dict = order_post_response_input_instance.to_dict()
# create an instance of OrderPostResponseInput from a dict
order_post_response_input_form_dict = order_post_response_input.from_dict(order_post_response_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


