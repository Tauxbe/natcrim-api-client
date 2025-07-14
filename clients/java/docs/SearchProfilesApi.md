# SearchProfilesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete**](SearchProfilesApi.md#deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete) | **DELETE** /customers/{customer_id}/profiles/{profile_id} | Delete a search profile |
| [**getProfileByIdCustomersCustomerIdProfilesProfileIdGet**](SearchProfilesApi.md#getProfileByIdCustomersCustomerIdProfilesProfileIdGet) | **GET** /customers/{customer_id}/profiles/{profile_id} | Retrieve a search profile |
| [**getProfilesCustomersCustomerIdProfilesGet**](SearchProfilesApi.md#getProfilesCustomersCustomerIdProfilesGet) | **GET** /customers/{customer_id}/profiles | Retrieve all search profiles |
| [**postProfileByIdCustomersCustomerIdProfilesPost**](SearchProfilesApi.md#postProfileByIdCustomersCustomerIdProfilesPost) | **POST** /customers/{customer_id}/profiles | Create a search profile |
| [**putProfileByIdCustomersCustomerIdProfilesProfileIdPut**](SearchProfilesApi.md#putProfileByIdCustomersCustomerIdProfilesProfileIdPut) | **PUT** /customers/{customer_id}/profiles/{profile_id} | Update a search profile |


<a id="deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete"></a>
# **deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete**
> Object deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete(customerId, profileId, isDeleted)

Delete a search profile

Delete a search profile

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.SearchProfilesApi;

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

    SearchProfilesApi apiInstance = new SearchProfilesApi(defaultClient);
    UUID customerId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    Boolean isDeleted = true; // Boolean | Delete a profile on a deleted customer
    try {
      Object result = apiInstance.deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete(customerId, profileId, isDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProfilesApi#deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete");
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
| **customerId** | **UUID**|  | |
| **profileId** | **UUID**|  | |
| **isDeleted** | **Boolean**| Delete a profile on a deleted customer | [optional] [default to false] [enum: true, false] |

### Return type

**Object**

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getProfileByIdCustomersCustomerIdProfilesProfileIdGet"></a>
# **getProfileByIdCustomersCustomerIdProfilesProfileIdGet**
> Profile getProfileByIdCustomersCustomerIdProfilesProfileIdGet(customerId, profileId)

Retrieve a search profile

Retrieve a search profile

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.SearchProfilesApi;

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

    SearchProfilesApi apiInstance = new SearchProfilesApi(defaultClient);
    UUID customerId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    try {
      Profile result = apiInstance.getProfileByIdCustomersCustomerIdProfilesProfileIdGet(customerId, profileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProfilesApi#getProfileByIdCustomersCustomerIdProfilesProfileIdGet");
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
| **customerId** | **UUID**|  | |
| **profileId** | **UUID**|  | |

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getProfilesCustomersCustomerIdProfilesGet"></a>
# **getProfilesCustomersCustomerIdProfilesGet**
> List&lt;Profile&gt; getProfilesCustomersCustomerIdProfilesGet(customerId, prefix, isDeleted)

Retrieve all search profiles

Retrieve all search profiles

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.SearchProfilesApi;

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

    SearchProfilesApi apiInstance = new SearchProfilesApi(defaultClient);
    UUID customerId = UUID.randomUUID(); // UUID | 
    String prefix = ""; // String | Search profile tag field by this prefix value
    Boolean isDeleted = true; // Boolean | Whether to include deleted profiles in the result, in addition to active profiles
    try {
      List<Profile> result = apiInstance.getProfilesCustomersCustomerIdProfilesGet(customerId, prefix, isDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProfilesApi#getProfilesCustomersCustomerIdProfilesGet");
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
| **customerId** | **UUID**|  | |
| **prefix** | **String**| Search profile tag field by this prefix value | [optional] [default to ] |
| **isDeleted** | **Boolean**| Whether to include deleted profiles in the result, in addition to active profiles | [optional] [default to false] [enum: true, false] |

### Return type

[**List&lt;Profile&gt;**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of profiles of customer |  -  |
| **422** | Validation Error |  -  |

<a id="postProfileByIdCustomersCustomerIdProfilesPost"></a>
# **postProfileByIdCustomersCustomerIdProfilesPost**
> Profile postProfileByIdCustomersCustomerIdProfilesPost(customerId, profilePut)

Create a search profile

Create a search profile

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.SearchProfilesApi;

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

    SearchProfilesApi apiInstance = new SearchProfilesApi(defaultClient);
    UUID customerId = UUID.randomUUID(); // UUID | 
    ProfilePut profilePut = new ProfilePut(); // ProfilePut | 
    try {
      Profile result = apiInstance.postProfileByIdCustomersCustomerIdProfilesPost(customerId, profilePut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProfilesApi#postProfileByIdCustomersCustomerIdProfilesPost");
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
| **customerId** | **UUID**|  | |
| **profilePut** | [**ProfilePut**](ProfilePut.md)|  | |

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="putProfileByIdCustomersCustomerIdProfilesProfileIdPut"></a>
# **putProfileByIdCustomersCustomerIdProfilesProfileIdPut**
> Profile putProfileByIdCustomersCustomerIdProfilesProfileIdPut(customerId, profileId, profilePut)

Update a search profile

Update a search profile

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.SearchProfilesApi;

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

    SearchProfilesApi apiInstance = new SearchProfilesApi(defaultClient);
    UUID customerId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    ProfilePut profilePut = new ProfilePut(); // ProfilePut | 
    try {
      Profile result = apiInstance.putProfileByIdCustomersCustomerIdProfilesProfileIdPut(customerId, profileId, profilePut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchProfilesApi#putProfileByIdCustomersCustomerIdProfilesProfileIdPut");
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
| **customerId** | **UUID**|  | |
| **profileId** | **UUID**|  | |
| **profilePut** | [**ProfilePut**](ProfilePut.md)|  | |

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

