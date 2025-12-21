# OrdersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrderCacheOrdersCacheOrderIdGet**](OrdersApi.md#getOrderCacheOrdersCacheOrderIdGet) | **GET** /orders/cache/{order_id} | Get Order Cache |
| [**getOrderOrdersOrderIdGet**](OrdersApi.md#getOrderOrdersOrderIdGet) | **GET** /orders/{order_id} | Get Order |
| [**listAllOrdersOrdersGet**](OrdersApi.md#listAllOrdersOrdersGet) | **GET** /orders | List All Orders |
| [**postOrderOrdersPost**](OrdersApi.md#postOrderOrdersPost) | **POST** /orders | Post Order |


<a id="getOrderCacheOrdersCacheOrderIdGet"></a>
# **getOrderCacheOrdersCacheOrderIdGet**
> OrderPostResponse getOrderCacheOrdersCacheOrderIdGet(orderId, offset, length)

Get Order Cache

:raises:

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: HTTPBasic
    HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
    HTTPBasic.setUsername("YOUR USERNAME");
    HTTPBasic.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID orderId = UUID.randomUUID(); // UUID | 
    Integer offset = 0; // Integer | 
    Integer length = 20; // Integer | 
    try {
      OrderPostResponse result = apiInstance.getOrderCacheOrdersCacheOrderIdGet(orderId, offset, length);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderCacheOrdersCacheOrderIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **UUID**|  | |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **length** | **Integer**|  | [optional] [default to 20] |

### Return type

[**OrderPostResponse**](OrderPostResponse.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the cached results |  -  |
| **403** | Forbidden |  -  |
| **410** | Results no longer available |  -  |
| **500** | Server Error |  -  |
| **422** | Validation Error |  -  |

<a id="getOrderOrdersOrderIdGet"></a>
# **getOrderOrdersOrderIdGet**
> Order getOrderOrdersOrderIdGet(orderId)

Get Order

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: HTTPBasic
    HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
    HTTPBasic.setUsername("YOUR USERNAME");
    HTTPBasic.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID orderId = UUID.randomUUID(); // UUID | 
    try {
      Order result = apiInstance.getOrderOrdersOrderIdGet(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderOrdersOrderIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **UUID**|  | |

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
| **200** | Order detail without search response |  -  |
| **422** | Validation Error |  -  |

<a id="listAllOrdersOrdersGet"></a>
# **listAllOrdersOrdersGet**
> List&lt;Order&gt; listAllOrdersOrdersGet(firstName, lastName, customerId, subAccountId, createdAtFrom, createdAtTo, clientReference, fips, region, sort, limit)

List All Orders

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: HTTPBasic
    HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
    HTTPBasic.setUsername("YOUR USERNAME");
    HTTPBasic.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String firstName = "firstName_example"; // String | First name, case insensitive
    String lastName = "lastName_example"; // String | First name, case insensitive
    UUID customerId = UUID.randomUUID(); // UUID | Match on customer
    UUID subAccountId = UUID.randomUUID(); // UUID | Match on sub-account
    OffsetDateTime createdAtFrom = OffsetDateTime.now(); // OffsetDateTime | Filter by order submission time
    OffsetDateTime createdAtTo = OffsetDateTime.now(); // OffsetDateTime | Filter by order submission time
    String clientReference = "clientReference_example"; // String | Contained in client reference, case insensitive
    String fips = "fips_example"; // String | Match on requested FIPS code
    String region = "region_example"; // String | Match on requested region code
    AnyOf sort = new AnyOf(); // AnyOf | Sorted field and sort direction, separated by colon. Ascending = 1, Descending = -1
    Integer limit = 56; // Integer | Limit results to this many matches
    try {
      List<Order> result = apiInstance.listAllOrdersOrdersGet(firstName, lastName, customerId, subAccountId, createdAtFrom, createdAtTo, clientReference, fips, region, sort, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#listAllOrdersOrdersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **firstName** | **String**| First name, case insensitive | [optional] |
| **lastName** | **String**| First name, case insensitive | [optional] |
| **customerId** | **UUID**| Match on customer | [optional] |
| **subAccountId** | **UUID**| Match on sub-account | [optional] |
| **createdAtFrom** | **OffsetDateTime**| Filter by order submission time | [optional] |
| **createdAtTo** | **OffsetDateTime**| Filter by order submission time | [optional] |
| **clientReference** | **String**| Contained in client reference, case insensitive | [optional] |
| **fips** | **String**| Match on requested FIPS code | [optional] |
| **region** | **String**| Match on requested region code | [optional] |
| **sort** | [**AnyOf**](.md)| Sorted field and sort direction, separated by colon. Ascending &#x3D; 1, Descending &#x3D; -1 | [optional] |
| **limit** | **Integer**| Limit results to this many matches | [optional] |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List submitted orders |  -  |
| **422** | Validation Error |  -  |

<a id="postOrderOrdersPost"></a>
# **postOrderOrdersPost**
> OrderPostResponse postOrderOrdersPost(orderPost, paginate)

Post Order

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: HTTPBasic
    HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
    HTTPBasic.setUsername("YOUR USERNAME");
    HTTPBasic.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    OrderPost orderPost = new OrderPost(); // OrderPost | 
    Boolean paginate = true; // Boolean | 
    try {
      OrderPostResponse result = apiInstance.postOrderOrdersPost(orderPost, paginate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#postOrderOrdersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderPost** | [**OrderPost**](OrderPost.md)|  | |
| **paginate** | **Boolean**|  | [optional] |

### Return type

[**OrderPostResponse**](OrderPostResponse.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

