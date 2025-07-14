# PrincipalApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMeMeGet**](PrincipalApi.md#getMeMeGet) | **GET** /me | Get Me |


<a id="getMeMeGet"></a>
# **getMeMeGet**
> Me getMeMeGet()

Get Me

Principal attributes

### Example
```java
// Import classes:
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.ApiException;
import com.natcrim.api.client.Configuration;
import com.natcrim.api.client.auth.*;
import com.natcrim.api.client.models.*;
import org.openapitools.client.api.PrincipalApi;

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

    PrincipalApi apiInstance = new PrincipalApi(defaultClient);
    try {
      Me result = apiInstance.getMeMeGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrincipalApi#getMeMeGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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
| **200** | Get information about the currently authenticated principal |  -  |

