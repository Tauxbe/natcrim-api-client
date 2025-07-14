# OrderSubject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **object** |  | 
**middle_name** | [**MiddleName**](MiddleName.md) |  | [optional] 
**last_name** | **object** |  | 
**dob** | [**Dob**](Dob.md) |  | [optional] 

## Example

```python
from natcrim_api_client.models.order_subject import OrderSubject

# TODO update the JSON string below
json = "{}"
# create an instance of OrderSubject from a JSON string
order_subject_instance = OrderSubject.from_json(json)
# print the JSON string representation of the object
print OrderSubject.to_json()

# convert the object into a dict
order_subject_dict = order_subject_instance.to_dict()
# create an instance of OrderSubject from a dict
order_subject_form_dict = order_subject.from_dict(order_subject_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


