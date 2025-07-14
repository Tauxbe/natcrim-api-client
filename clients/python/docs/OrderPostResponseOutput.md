# OrderPostResponseOutput


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
from natcrim_api_client.models.order_post_response_output import OrderPostResponseOutput

# TODO update the JSON string below
json = "{}"
# create an instance of OrderPostResponseOutput from a JSON string
order_post_response_output_instance = OrderPostResponseOutput.from_json(json)
# print the JSON string representation of the object
print OrderPostResponseOutput.to_json()

# convert the object into a dict
order_post_response_output_dict = order_post_response_output_instance.to_dict()
# create an instance of OrderPostResponseOutput from a dict
order_post_response_output_form_dict = order_post_response_output.from_dict(order_post_response_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


