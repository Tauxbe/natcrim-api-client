# OrderRequestPost


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_reference** | [**ClientReference**](ClientReference.md) |  | [optional] 
**profile_id** | [**ProfileId1**](ProfileId1.md) |  | [optional] 
**profile_def** | [**OrderRequestPostProfileDef**](OrderRequestPostProfileDef.md) |  | [optional] 
**fips** | [**Fips**](Fips.md) |  | [optional] 
**region** | [**Region**](Region.md) |  | [optional] 
**subject** | [**OrderSubject**](OrderSubject.md) |  | 
**max_results** | [**MaxResults1**](MaxResults1.md) |  | [optional] 

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


