# OrderPost


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sub_account_id** | **str** |  | [optional] 
**request** | [**OrderRequestPost**](OrderRequestPost.md) |  | 

## Example

```python
from natcrim_api_client.models.order_post import OrderPost

# TODO update the JSON string below
json = "{}"
# create an instance of OrderPost from a JSON string
order_post_instance = OrderPost.from_json(json)
# print the JSON string representation of the object
print OrderPost.to_json()

# convert the object into a dict
order_post_dict = order_post_instance.to_dict()
# create an instance of OrderPost from a dict
order_post_form_dict = order_post.from_dict(order_post_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


