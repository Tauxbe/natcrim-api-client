# NatcrimApiClient.PrincipalApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMeMeGet**](PrincipalApi.md#getMeMeGet) | **GET** /me | Get Me



## getMeMeGet

> Me getMeMeGet()

Get Me

Principal attributes

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

let apiInstance = new NatcrimApiClient.PrincipalApi();
apiInstance.getMeMeGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

