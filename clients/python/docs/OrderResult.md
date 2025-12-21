# OrderResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed_at** | **datetime** |  | 
**failure** | [**OrderFailure**](OrderFailure.md) |  | 
**success** | [**OrderSuccess**](OrderSuccess.md) |  | 
**max_results** | **bool** |  | [optional] 

## Example

```python
from natcrim_api_client.models.order_result import OrderResult

# TODO update the JSON string below
json = "{}"
# create an instance of OrderResult from a JSON string
order_result_instance = OrderResult.from_json(json)
# print the JSON string representation of the object
print OrderResult.to_json()

# convert the object into a dict
order_result_dict = order_result_instance.to_dict()
# create an instance of OrderResult from a dict
order_result_form_dict = order_result.from_dict(order_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


