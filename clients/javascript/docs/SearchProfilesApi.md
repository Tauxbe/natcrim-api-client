# NatcrimApiClient.SearchProfilesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete**](SearchProfilesApi.md#deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete) | **DELETE** /customers/{customer_id}/profiles/{profile_id} | Delete a search profile
[**getProfileByIdCustomersCustomerIdProfilesProfileIdGet**](SearchProfilesApi.md#getProfileByIdCustomersCustomerIdProfilesProfileIdGet) | **GET** /customers/{customer_id}/profiles/{profile_id} | Retrieve a search profile
[**getProfilesCustomersCustomerIdProfilesGet**](SearchProfilesApi.md#getProfilesCustomersCustomerIdProfilesGet) | **GET** /customers/{customer_id}/profiles | Retrieve all search profiles
[**postProfileByIdCustomersCustomerIdProfilesPost**](SearchProfilesApi.md#postProfileByIdCustomersCustomerIdProfilesPost) | **POST** /customers/{customer_id}/profiles | Create a search profile
[**putProfileByIdCustomersCustomerIdProfilesProfileIdPut**](SearchProfilesApi.md#putProfileByIdCustomersCustomerIdProfilesProfileIdPut) | **PUT** /customers/{customer_id}/profiles/{profile_id} | Update a search profile



## deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete

> Object deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete(customerId, profileId, opts)

Delete a search profile

Delete a search profile

### Example

```javascript
import NatcrimApiClient from 'natcrim-api-client';
let defaultClient = NatcrimApiClient.ApiClient.instance;
// Configure HTTP basic authorization: HTTPBasic
let HTTPBasic = defaultClient.authentications['HTTPBasic'];
HTTPBasic.username = 'YOUR USERNAME';
HTTPBasic.password = 'YOUR PASSWORD';
// Configure Bearer access token for authorization: HTTPBearer
let HTTPBearer = defaultClient.authentications['HTTPBearer'];
HTTPBearer.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new NatcrimApiClient.SearchProfilesApi();
let customerId = "customerId_example"; // String | 
let profileId = "profileId_example"; // String | 
let opts = {
  'isDeleted': false // Boolean | Delete a profile on a deleted customer
};
apiInstance.deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete(customerId, profileId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  | 
 **profileId** | **String**|  | 
 **isDeleted** | **Boolean**| Delete a profile on a deleted customer | [optional] [default to false]

### Return type

**Object**

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getProfileByIdCustomersCustomerIdProfilesProfileIdGet

> Profile getProfileByIdCustomersCustomerIdProfilesProfileIdGet(customerId, profileId)

Retrieve a search profile

Retrieve a search profile

### Example

```javascript
import NatcrimApiClient from 'natcrim-api-client';
let defaultClient = NatcrimApiClient.ApiClient.instance;
// Configure HTTP basic authorization: HTTPBasic
let HTTPBasic = defaultClient.authentications['HTTPBasic'];
HTTPBasic.username = 'YOUR USERNAME';
HTTPBasic.password = 'YOUR PASSWORD';
// Configure Bearer access token for authorization: HTTPBearer
let HTTPBearer = defaultClient.authentications['HTTPBearer'];
HTTPBearer.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new NatcrimApiClient.SearchProfilesApi();
let customerId = "customerId_example"; // String | 
let profileId = "profileId_example"; // String | 
apiInstance.getProfileByIdCustomersCustomerIdProfilesProfileIdGet(customerId, profileId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  | 
 **profileId** | **String**|  | 

### Return type

[**Profile**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getProfilesCustomersCustomerIdProfilesGet

> [Profile] getProfilesCustomersCustomerIdProfilesGet(customerId, opts)

Retrieve all search profiles

Retrieve all search profiles

### Example

```javascript
import NatcrimApiClient from 'natcrim-api-client';
let defaultClient = NatcrimApiClient.ApiClient.instance;
// Configure HTTP basic authorization: HTTPBasic
let HTTPBasic = defaultClient.authentications['HTTPBasic'];
HTTPBasic.username = 'YOUR USERNAME';
HTTPBasic.password = 'YOUR PASSWORD';
// Configure Bearer access token for authorization: HTTPBearer
let HTTPBearer = defaultClient.authentications['HTTPBearer'];
HTTPBearer.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new NatcrimApiClient.SearchProfilesApi();
let customerId = "customerId_example"; // String | 
let opts = {
  'prefix': "''", // String | Search profile tag field by this prefix value
  'isDeleted': false // Boolean | Whether to include deleted profiles in the result, in addition to active profiles
};
apiInstance.getProfilesCustomersCustomerIdProfilesGet(customerId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  | 
 **prefix** | **String**| Search profile tag field by this prefix value | [optional] [default to &#39;&#39;]
 **isDeleted** | **Boolean**| Whether to include deleted profiles in the result, in addition to active profiles | [optional] [default to false]

### Return type

[**[Profile]**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postProfileByIdCustomersCustomerIdProfilesPost

> Profile postProfileByIdCustomersCustomerIdProfilesPost(customerId, profilePut)

Create a search profile

Create a search profile

### Example

```javascript
import NatcrimApiClient from 'natcrim-api-client';
let defaultClient = NatcrimApiClient.ApiClient.instance;
// Configure HTTP basic authorization: HTTPBasic
let HTTPBasic = defaultClient.authentications['HTTPBasic'];
HTTPBasic.username = 'YOUR USERNAME';
HTTPBasic.password = 'YOUR PASSWORD';
// Configure Bearer access token for authorization: HTTPBearer
let HTTPBearer = defaultClient.authentications['HTTPBearer'];
HTTPBearer.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new NatcrimApiClient.SearchProfilesApi();
let customerId = "customerId_example"; // String | 
let profilePut = new NatcrimApiClient.ProfilePut(); // ProfilePut | 
apiInstance.postProfileByIdCustomersCustomerIdProfilesPost(customerId, profilePut, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  | 
 **profilePut** | [**ProfilePut**](ProfilePut.md)|  | 

### Return type

[**Profile**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## putProfileByIdCustomersCustomerIdProfilesProfileIdPut

> Profile putProfileByIdCustomersCustomerIdProfilesProfileIdPut(customerId, profileId, profilePut)

Update a search profile

Update a search profile

### Example

```javascript
import NatcrimApiClient from 'natcrim-api-client';
let defaultClient = NatcrimApiClient.ApiClient.instance;
// Configure HTTP basic authorization: HTTPBasic
let HTTPBasic = defaultClient.authentications['HTTPBasic'];
HTTPBasic.username = 'YOUR USERNAME';
HTTPBasic.password = 'YOUR PASSWORD';
// Configure Bearer access token for authorization: HTTPBearer
let HTTPBearer = defaultClient.authentications['HTTPBearer'];
HTTPBearer.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new NatcrimApiClient.SearchProfilesApi();
let customerId = "customerId_example"; // String | 
let profileId = "profileId_example"; // String | 
let profilePut = new NatcrimApiClient.ProfilePut(); // ProfilePut | 
apiInstance.putProfileByIdCustomersCustomerIdProfilesProfileIdPut(customerId, profileId, profilePut, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  | 
 **profileId** | **String**|  | 
 **profilePut** | [**ProfilePut**](ProfilePut.md)|  | 

### Return type

[**Profile**](Profile.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

