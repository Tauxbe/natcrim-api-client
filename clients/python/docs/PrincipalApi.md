# natcrim_api_client.PrincipalApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_me_me_get**](PrincipalApi.md#get_me_me_get) | **GET** /me | Get Me


# **get_me_me_get**
> Me get_me_me_get()

Get Me

Principal attributes

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.me import Me
from natcrim_api_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = natcrim_api_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: HTTPBasic
configuration = natcrim_api_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure Bearer authorization: HTTPBearer
configuration = natcrim_api_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with natcrim_api_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = natcrim_api_client.PrincipalApi(api_client)

    try:
        # Get Me
        api_response = api_instance.get_me_me_get()
        print("The response of PrincipalApi->get_me_me_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PrincipalApi->get_me_me_get: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**Me**](Me.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get information about the currently authenticated principal |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

