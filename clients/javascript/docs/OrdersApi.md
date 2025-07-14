# NatcrimApiClient.OrdersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderCacheOrdersCacheOrderIdGet**](OrdersApi.md#getOrderCacheOrdersCacheOrderIdGet) | **GET** /orders/cache/{order_id} | Get Order Cache
[**getOrderOrdersOrderIdGet**](OrdersApi.md#getOrderOrdersOrderIdGet) | **GET** /orders/{order_id} | Get Order
[**listAllOrdersOrdersGet**](OrdersApi.md#listAllOrdersOrdersGet) | **GET** /orders | List All Orders
[**postOrderOrdersPost**](OrdersApi.md#postOrderOrdersPost) | **POST** /orders | Post Order



## getOrderCacheOrdersCacheOrderIdGet

> OrderPostResponseInput getOrderCacheOrdersCacheOrderIdGet(orderId, opts)

Get Order Cache

:raises:

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

let apiInstance = new NatcrimApiClient.OrdersApi();
let orderId = "orderId_example"; // String | 
let opts = {
  'offset': 0, // Number | 
  'length': 20 // Number | 
};
apiInstance.getOrderCacheOrdersCacheOrderIdGet(orderId, opts, (error, data, response) => {
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
 **orderId** | **String**|  | 
 **offset** | **Number**|  | [optional] [default to 0]
 **length** | **Number**|  | [optional] [default to 20]

### Return type

[**OrderPostResponseInput**](OrderPostResponseInput.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOrderOrdersOrderIdGet

> Order getOrderOrdersOrderIdGet(orderId)

Get Order

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

let apiInstance = new NatcrimApiClient.OrdersApi();
let orderId = "orderId_example"; // String | 
apiInstance.getOrderOrdersOrderIdGet(orderId, (error, data, response) => {
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
 **orderId** | **String**|  | 

### Return type

[**Order**](Order.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listAllOrdersOrdersGet

> [Order] listAllOrdersOrdersGet(opts)

List All Orders

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

let apiInstance = new NatcrimApiClient.OrdersApi();
let opts = {
  'firstName': "firstName_example", // String | First name, case insensitive
  'lastName': "lastName_example", // String | First name, case insensitive
  'customerId': "customerId_example", // String | Match on customer
  'subAccountId': "subAccountId_example", // String | Match on sub-account
  'createdAtFrom': new Date("2013-10-20T19:20:30+01:00"), // Date | Filter by order submission time
  'createdAtTo': new Date("2013-10-20T19:20:30+01:00"), // Date | Filter by order submission time
  'clientReference': "clientReference_example", // String | Contained in client reference, case insensitive
  'fips': "fips_example", // String | Match on requested FIPS code
  'region': "region_example", // String | Match on requested region code
  'sort': new NatcrimApiClient.AnyOf(), // AnyOf | Sorted field and sort direction, separated by colon. Ascending = 1, Descending = -1
  'limit': 56 // Number | Limit results to this many matches
};
apiInstance.listAllOrdersOrdersGet(opts, (error, data, response) => {
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
 **firstName** | **String**| First name, case insensitive | [optional] 
 **lastName** | **String**| First name, case insensitive | [optional] 
 **customerId** | **String**| Match on customer | [optional] 
 **subAccountId** | **String**| Match on sub-account | [optional] 
 **createdAtFrom** | **Date**| Filter by order submission time | [optional] 
 **createdAtTo** | **Date**| Filter by order submission time | [optional] 
 **clientReference** | **String**| Contained in client reference, case insensitive | [optional] 
 **fips** | **String**| Match on requested FIPS code | [optional] 
 **region** | **String**| Match on requested region code | [optional] 
 **sort** | [**AnyOf**](.md)| Sorted field and sort direction, separated by colon. Ascending &#x3D; 1, Descending &#x3D; -1 | [optional] 
 **limit** | **Number**| Limit results to this many matches | [optional] 

### Return type

[**[Order]**](Order.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postOrderOrdersPost

> OrderPostResponseOutput postOrderOrdersPost(orderPost, opts)

Post Order

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

let apiInstance = new NatcrimApiClient.OrdersApi();
let orderPost = new NatcrimApiClient.OrderPost(); // OrderPost | 
let opts = {
  'paginate': true // Boolean | 
};
apiInstance.postOrderOrdersPost(orderPost, opts, (error, data, response) => {
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
 **orderPost** | [**OrderPost**](OrderPost.md)|  | 
 **paginate** | **Boolean**|  | [optional] 

### Return type

[**OrderPostResponseOutput**](OrderPostResponseOutput.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic), [HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

