# OrderRequestGet


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_reference** | **str** |  | 
**profile_id** | **str** |  | 
**profile_def** | [**ProfileDefinitionGet**](ProfileDefinitionGet.md) |  | 
**fips** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**subject** | [**OrderSubject**](OrderSubject.md) |  | 
**max_results** | **int** |  | [optional] 

## Example

```python
from natcrim_api_client.models.order_request_get import OrderRequestGet

# TODO update the JSON string below
json = "{}"
# create an instance of OrderRequestGet from a JSON string
order_request_get_instance = OrderRequestGet.from_json(json)
# print the JSON string representation of the object
print OrderRequestGet.to_json()

# convert the object into a dict
order_request_get_dict = order_request_get_instance.to_dict()
# create an instance of OrderRequestGet from a dict
order_request_get_form_dict = order_request_get.from_dict(order_request_get_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


