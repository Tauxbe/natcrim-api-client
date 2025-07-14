# DOBFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_off_by_one** | **bool** | Allow any one part of the DOB: month, day, year, to be different by no more than 1. | [optional] [default to False]
**allow_empty_dob** | **bool** | Match records with no DOB | [optional] [default to False]
**minimum_components_matched** | **int** | How many of the parts of the DOB must match the searched DOB | [optional] [default to 3]

## Example

```python
from natcrim_api_client.models.dob_filter import DOBFilter

# TODO update the JSON string below
json = "{}"
# create an instance of DOBFilter from a JSON string
dob_filter_instance = DOBFilter.from_json(json)
# print the JSON string representation of the object
print DOBFilter.to_json()

# convert the object into a dict
dob_filter_dict = dob_filter_instance.to_dict()
# create an instance of DOBFilter from a dict
dob_filter_form_dict = dob_filter.from_dict(dob_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


