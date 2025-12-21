# OrderRequestPost


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_reference** | **str** |  | [optional] 
**profile_id** | **str** |  | [optional] 
**profile_def** | [**ProfileDefinition**](ProfileDefinition.md) |  | [optional] 
**fips** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**subject** | [**OrderSubject**](OrderSubject.md) |  | 
**max_results** | **int** |  | [optional] 

## Example

```python
from natcrim_api_client.models.order_request_post import OrderRequestPost

# TODO update the JSON string below
json = "{}"
# create an instance of OrderRequestPost from a JSON string
order_request_post_instance = OrderRequestPost.from_json(json)
# print the JSON string representation of the object
print OrderRequestPost.to_json()

# convert the object into a dict
order_request_post_dict = order_request_post_instance.to_dict()
# create an instance of OrderRequestPost from a dict
order_request_post_form_dict = order_request_post.from_dict(order_request_post_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


