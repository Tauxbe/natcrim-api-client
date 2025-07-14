# natcrim_api_client.SearchProfilesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_search_profile_by_id_customers_customer_id_profiles_profile_id_delete**](SearchProfilesApi.md#delete_search_profile_by_id_customers_customer_id_profiles_profile_id_delete) | **DELETE** /customers/{customer_id}/profiles/{profile_id} | Delete a search profile
[**get_profile_by_id_customers_customer_id_profiles_profile_id_get**](SearchProfilesApi.md#get_profile_by_id_customers_customer_id_profiles_profile_id_get) | **GET** /customers/{customer_id}/profiles/{profile_id} | Retrieve a search profile
[**get_profiles_customers_customer_id_profiles_get**](SearchProfilesApi.md#get_profiles_customers_customer_id_profiles_get) | **GET** /customers/{customer_id}/profiles | Retrieve all search profiles
[**post_profile_by_id_customers_customer_id_profiles_post**](SearchProfilesApi.md#post_profile_by_id_customers_customer_id_profiles_post) | **POST** /customers/{customer_id}/profiles | Create a search profile
[**put_profile_by_id_customers_customer_id_profiles_profile_id_put**](SearchProfilesApi.md#put_profile_by_id_customers_customer_id_profiles_profile_id_put) | **PUT** /customers/{customer_id}/profiles/{profile_id} | Update a search profile


# **delete_search_profile_by_id_customers_customer_id_profiles_profile_id_delete**
> object delete_search_profile_by_id_customers_customer_id_profiles_profile_id_delete(customer_id, profile_id, is_deleted=is_deleted)

Delete a search profile

Delete a search profile

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
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
    api_instance = natcrim_api_client.SearchProfilesApi(api_client)
    customer_id = 'customer_id_example' # str | 
    profile_id = 'profile_id_example' # str | 
    is_deleted = False # bool | Delete a profile on a deleted customer (optional) (default to False)

    try:
        # Delete a search profile
        api_response = api_instance.delete_search_profile_by_id_customers_customer_id_profiles_profile_id_delete(customer_id, profile_id, is_deleted=is_deleted)
        print("The response of SearchProfilesApi->delete_search_profile_by_id_customers_customer_id_profiles_profile_id_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchProfilesApi->delete_search_profile_by_id_customers_customer_id_profiles_profile_id_delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | 
 **profile_id** | **str**|  | 
 **is_deleted** | **bool**| Delete a profile on a deleted customer | [optional] [default to False]

### Return type

**object**

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_profile_by_id_customers_customer_id_profiles_profile_id_get**
> Profile get_profile_by_id_customers_customer_id_profiles_profile_id_get(customer_id, profile_id)

Retrieve a search profile

Retrieve a search profile

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.profile import Profile
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
    api_instance = natcrim_api_client.SearchProfilesApi(api_client)
    customer_id = 'customer_id_example' # str | 
    profile_id = 'profile_id_example' # str | 

    try:
        # Retrieve a search profile
        api_response = api_instance.get_profile_by_id_customers_customer_id_profiles_profile_id_get(customer_id, profile_id)
        print("The response of SearchProfilesApi->get_profile_by_id_customers_customer_id_profiles_profile_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchProfilesApi->get_profile_by_id_customers_customer_id_profiles_profile_id_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | 
 **profile_id** | **str**|  | 

### Return type

[**Profile**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_profiles_customers_customer_id_profiles_get**
> List[Profile] get_profiles_customers_customer_id_profiles_get(customer_id, prefix=prefix, is_deleted=is_deleted)

Retrieve all search profiles

Retrieve all search profiles

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.profile import Profile
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
    api_instance = natcrim_api_client.SearchProfilesApi(api_client)
    customer_id = 'customer_id_example' # str | 
    prefix = '' # str | Search profile tag field by this prefix value (optional) (default to '')
    is_deleted = False # bool | Whether to include deleted profiles in the result, in addition to active profiles (optional) (default to False)

    try:
        # Retrieve all search profiles
        api_response = api_instance.get_profiles_customers_customer_id_profiles_get(customer_id, prefix=prefix, is_deleted=is_deleted)
        print("The response of SearchProfilesApi->get_profiles_customers_customer_id_profiles_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchProfilesApi->get_profiles_customers_customer_id_profiles_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | 
 **prefix** | **str**| Search profile tag field by this prefix value | [optional] [default to &#39;&#39;]
 **is_deleted** | **bool**| Whether to include deleted profiles in the result, in addition to active profiles | [optional] [default to False]

### Return type

[**List[Profile]**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of profiles of customer |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_profile_by_id_customers_customer_id_profiles_post**
> Profile post_profile_by_id_customers_customer_id_profiles_post(customer_id, profile_put)

Create a search profile

Create a search profile

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.profile import Profile
from natcrim_api_client.models.profile_put import ProfilePut
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
    api_instance = natcrim_api_client.SearchProfilesApi(api_client)
    customer_id = 'customer_id_example' # str | 
    profile_put = natcrim_api_client.ProfilePut() # ProfilePut | 

    try:
        # Create a search profile
        api_response = api_instance.post_profile_by_id_customers_customer_id_profiles_post(customer_id, profile_put)
        print("The response of SearchProfilesApi->post_profile_by_id_customers_customer_id_profiles_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchProfilesApi->post_profile_by_id_customers_customer_id_profiles_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | 
 **profile_put** | [**ProfilePut**](ProfilePut.md)|  | 

### Return type

[**Profile**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_profile_by_id_customers_customer_id_profiles_profile_id_put**
> Profile put_profile_by_id_customers_customer_id_profiles_profile_id_put(customer_id, profile_id, profile_put)

Update a search profile

Update a search profile

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.profile import Profile
from natcrim_api_client.models.profile_put import ProfilePut
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
    api_instance = natcrim_api_client.SearchProfilesApi(api_client)
    customer_id = 'customer_id_example' # str | 
    profile_id = 'profile_id_example' # str | 
    profile_put = natcrim_api_client.ProfilePut() # ProfilePut | 

    try:
        # Update a search profile
        api_response = api_instance.put_profile_by_id_customers_customer_id_profiles_profile_id_put(customer_id, profile_id, profile_put)
        print("The response of SearchProfilesApi->put_profile_by_id_customers_customer_id_profiles_profile_id_put:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchProfilesApi->put_profile_by_id_customers_customer_id_profiles_profile_id_put: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | 
 **profile_id** | **str**|  | 
 **profile_put** | [**ProfilePut**](ProfilePut.md)|  | 

### Return type

[**Profile**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

