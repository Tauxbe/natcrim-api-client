# natcrim_api_client.OrdersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_order_cache_orders_cache_order_id_get**](OrdersApi.md#get_order_cache_orders_cache_order_id_get) | **GET** /orders/cache/{order_id} | Get Order Cache
[**get_order_orders_order_id_get**](OrdersApi.md#get_order_orders_order_id_get) | **GET** /orders/{order_id} | Get Order
[**list_all_orders_orders_get**](OrdersApi.md#list_all_orders_orders_get) | **GET** /orders | List All Orders
[**post_order_orders_post**](OrdersApi.md#post_order_orders_post) | **POST** /orders | Post Order


# **get_order_cache_orders_cache_order_id_get**
> OrderPostResponseInput get_order_cache_orders_cache_order_id_get(order_id, offset=offset, length=length)

Get Order Cache

:raises:

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.order_post_response_input import OrderPostResponseInput
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
    api_instance = natcrim_api_client.OrdersApi(api_client)
    order_id = 'order_id_example' # str | 
    offset = 0 # int |  (optional) (default to 0)
    length = 20 # int |  (optional) (default to 20)

    try:
        # Get Order Cache
        api_response = api_instance.get_order_cache_orders_cache_order_id_get(order_id, offset=offset, length=length)
        print("The response of OrdersApi->get_order_cache_orders_cache_order_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrdersApi->get_order_cache_orders_cache_order_id_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **str**|  | 
 **offset** | **int**|  | [optional] [default to 0]
 **length** | **int**|  | [optional] [default to 20]

### Return type

[**OrderPostResponseInput**](OrderPostResponseInput.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the cached results |  -  |
**403** | Forbidden |  -  |
**410** | Results no longer available |  -  |
**500** | Server Error |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_orders_order_id_get**
> Order get_order_orders_order_id_get(order_id)

Get Order

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.order import Order
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
    api_instance = natcrim_api_client.OrdersApi(api_client)
    order_id = 'order_id_example' # str | 

    try:
        # Get Order
        api_response = api_instance.get_order_orders_order_id_get(order_id)
        print("The response of OrdersApi->get_order_orders_order_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrdersApi->get_order_orders_order_id_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **str**|  | 

### Return type

[**Order**](Order.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order detail without search response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_all_orders_orders_get**
> List[Order] list_all_orders_orders_get(first_name=first_name, last_name=last_name, customer_id=customer_id, sub_account_id=sub_account_id, created_at_from=created_at_from, created_at_to=created_at_to, client_reference=client_reference, fips=fips, region=region, sort=sort, limit=limit)

List All Orders

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.order import Order
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
    api_instance = natcrim_api_client.OrdersApi(api_client)
    first_name = 'first_name_example' # str | First name, case insensitive (optional)
    last_name = 'last_name_example' # str | First name, case insensitive (optional)
    customer_id = 'customer_id_example' # str | Match on customer (optional)
    sub_account_id = 'sub_account_id_example' # str | Match on sub-account (optional)
    created_at_from = '2013-10-20T19:20:30+01:00' # datetime | Filter by order submission time (optional)
    created_at_to = '2013-10-20T19:20:30+01:00' # datetime | Filter by order submission time (optional)
    client_reference = 'client_reference_example' # str | Contained in client reference, case insensitive (optional)
    fips = 'fips_example' # str | Match on requested FIPS code (optional)
    region = 'region_example' # str | Match on requested region code (optional)
    sort = natcrim_api_client.AnyOf() # AnyOf | Sorted field and sort direction, separated by colon. Ascending = 1, Descending = -1 (optional)
    limit = 56 # int | Limit results to this many matches (optional)

    try:
        # List All Orders
        api_response = api_instance.list_all_orders_orders_get(first_name=first_name, last_name=last_name, customer_id=customer_id, sub_account_id=sub_account_id, created_at_from=created_at_from, created_at_to=created_at_to, client_reference=client_reference, fips=fips, region=region, sort=sort, limit=limit)
        print("The response of OrdersApi->list_all_orders_orders_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrdersApi->list_all_orders_orders_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **first_name** | **str**| First name, case insensitive | [optional] 
 **last_name** | **str**| First name, case insensitive | [optional] 
 **customer_id** | **str**| Match on customer | [optional] 
 **sub_account_id** | **str**| Match on sub-account | [optional] 
 **created_at_from** | **datetime**| Filter by order submission time | [optional] 
 **created_at_to** | **datetime**| Filter by order submission time | [optional] 
 **client_reference** | **str**| Contained in client reference, case insensitive | [optional] 
 **fips** | **str**| Match on requested FIPS code | [optional] 
 **region** | **str**| Match on requested region code | [optional] 
 **sort** | [**AnyOf**](.md)| Sorted field and sort direction, separated by colon. Ascending &#x3D; 1, Descending &#x3D; -1 | [optional] 
 **limit** | **int**| Limit results to this many matches | [optional] 

### Return type

[**List[Order]**](Order.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List submitted orders |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_order_orders_post**
> OrderPostResponseOutput post_order_orders_post(order_post, paginate=paginate)

Post Order

### Example

* Basic Authentication (HTTPBasic):
* Bearer Authentication (HTTPBearer):
```python
import time
import os
import natcrim_api_client
from natcrim_api_client.models.order_post import OrderPost
from natcrim_api_client.models.order_post_response_output import OrderPostResponseOutput
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
    api_instance = natcrim_api_client.OrdersApi(api_client)
    order_post = natcrim_api_client.OrderPost() # OrderPost | 
    paginate = True # bool |  (optional)

    try:
        # Post Order
        api_response = api_instance.post_order_orders_post(order_post, paginate=paginate)
        print("The response of OrdersApi->post_order_orders_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrdersApi->post_order_orders_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_post** | [**OrderPost**](OrderPost.md)|  | 
 **paginate** | **bool**|  | [optional] 

### Return type

[**OrderPostResponseOutput**](OrderPostResponseOutput.md)

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

