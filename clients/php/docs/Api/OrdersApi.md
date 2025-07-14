# OpenAPI\Client\OrdersApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getOrderCacheOrdersCacheOrderIdGet()**](OrdersApi.md#getOrderCacheOrdersCacheOrderIdGet) | **GET** /orders/cache/{order_id} | Get Order Cache |
| [**getOrderOrdersOrderIdGet()**](OrdersApi.md#getOrderOrdersOrderIdGet) | **GET** /orders/{order_id} | Get Order |
| [**listAllOrdersOrdersGet()**](OrdersApi.md#listAllOrdersOrdersGet) | **GET** /orders | List All Orders |
| [**postOrderOrdersPost()**](OrdersApi.md#postOrderOrdersPost) | **POST** /orders | Post Order |


## `getOrderCacheOrdersCacheOrderIdGet()`

```php
getOrderCacheOrdersCacheOrderIdGet($order_id, $offset, $length): \OpenAPI\Client\Model\OrderPostResponseInput
```

Get Order Cache

:raises:

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: HTTPBasic
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OrdersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_id = 'order_id_example'; // string
$offset = 0; // int
$length = 20; // int

try {
    $result = $apiInstance->getOrderCacheOrdersCacheOrderIdGet($order_id, $offset, $length);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrdersApi->getOrderCacheOrdersCacheOrderIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order_id** | **string**|  | |
| **offset** | **int**|  | [optional] [default to 0] |
| **length** | **int**|  | [optional] [default to 20] |

### Return type

[**\OpenAPI\Client\Model\OrderPostResponseInput**](../Model/OrderPostResponseInput.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getOrderOrdersOrderIdGet()`

```php
getOrderOrdersOrderIdGet($order_id): \OpenAPI\Client\Model\Order
```

Get Order

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: HTTPBasic
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OrdersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_id = 'order_id_example'; // string

try {
    $result = $apiInstance->getOrderOrdersOrderIdGet($order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrdersApi->getOrderOrdersOrderIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order_id** | **string**|  | |

### Return type

[**\OpenAPI\Client\Model\Order**](../Model/Order.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAllOrdersOrdersGet()`

```php
listAllOrdersOrdersGet($first_name, $last_name, $customer_id, $sub_account_id, $created_at_from, $created_at_to, $client_reference, $fips, $region, $sort, $limit): \OpenAPI\Client\Model\Order[]
```

List All Orders

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: HTTPBasic
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OrdersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$first_name = 'first_name_example'; // string | First name, case insensitive
$last_name = 'last_name_example'; // string | First name, case insensitive
$customer_id = 'customer_id_example'; // string | Match on customer
$sub_account_id = 'sub_account_id_example'; // string | Match on sub-account
$created_at_from = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Filter by order submission time
$created_at_to = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Filter by order submission time
$client_reference = 'client_reference_example'; // string | Contained in client reference, case insensitive
$fips = 'fips_example'; // string | Match on requested FIPS code
$region = 'region_example'; // string | Match on requested region code
$sort = new \OpenAPI\Client\Model\AnyOf(); // AnyOf | Sorted field and sort direction, separated by colon. Ascending = 1, Descending = -1
$limit = 56; // int | Limit results to this many matches

try {
    $result = $apiInstance->listAllOrdersOrdersGet($first_name, $last_name, $customer_id, $sub_account_id, $created_at_from, $created_at_to, $client_reference, $fips, $region, $sort, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrdersApi->listAllOrdersOrdersGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **first_name** | **string**| First name, case insensitive | [optional] |
| **last_name** | **string**| First name, case insensitive | [optional] |
| **customer_id** | **string**| Match on customer | [optional] |
| **sub_account_id** | **string**| Match on sub-account | [optional] |
| **created_at_from** | **\DateTime**| Filter by order submission time | [optional] |
| **created_at_to** | **\DateTime**| Filter by order submission time | [optional] |
| **client_reference** | **string**| Contained in client reference, case insensitive | [optional] |
| **fips** | **string**| Match on requested FIPS code | [optional] |
| **region** | **string**| Match on requested region code | [optional] |
| **sort** | [**AnyOf**](../Model/.md)| Sorted field and sort direction, separated by colon. Ascending &#x3D; 1, Descending &#x3D; -1 | [optional] |
| **limit** | **int**| Limit results to this many matches | [optional] |

### Return type

[**\OpenAPI\Client\Model\Order[]**](../Model/Order.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `postOrderOrdersPost()`

```php
postOrderOrdersPost($order_post, $paginate): \OpenAPI\Client\Model\OrderPostResponseOutput
```

Post Order

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: HTTPBasic
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OrdersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_post = new \OpenAPI\Client\Model\OrderPost(); // \OpenAPI\Client\Model\OrderPost
$paginate = True; // bool

try {
    $result = $apiInstance->postOrderOrdersPost($order_post, $paginate);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrdersApi->postOrderOrdersPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order_post** | [**\OpenAPI\Client\Model\OrderPost**](../Model/OrderPost.md)|  | |
| **paginate** | **bool**|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\OrderPostResponseOutput**](../Model/OrderPostResponseOutput.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
