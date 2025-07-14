# OpenAPI\Client\SearchProfilesApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete()**](SearchProfilesApi.md#deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete) | **DELETE** /customers/{customer_id}/profiles/{profile_id} | Delete a search profile |
| [**getProfileByIdCustomersCustomerIdProfilesProfileIdGet()**](SearchProfilesApi.md#getProfileByIdCustomersCustomerIdProfilesProfileIdGet) | **GET** /customers/{customer_id}/profiles/{profile_id} | Retrieve a search profile |
| [**getProfilesCustomersCustomerIdProfilesGet()**](SearchProfilesApi.md#getProfilesCustomersCustomerIdProfilesGet) | **GET** /customers/{customer_id}/profiles | Retrieve all search profiles |
| [**postProfileByIdCustomersCustomerIdProfilesPost()**](SearchProfilesApi.md#postProfileByIdCustomersCustomerIdProfilesPost) | **POST** /customers/{customer_id}/profiles | Create a search profile |
| [**putProfileByIdCustomersCustomerIdProfilesProfileIdPut()**](SearchProfilesApi.md#putProfileByIdCustomersCustomerIdProfilesProfileIdPut) | **PUT** /customers/{customer_id}/profiles/{profile_id} | Update a search profile |


## `deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete()`

```php
deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete($customer_id, $profile_id, $is_deleted): object
```

Delete a search profile

Delete a search profile

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


$apiInstance = new OpenAPI\Client\Api\SearchProfilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string
$profile_id = 'profile_id_example'; // string
$is_deleted = false; // bool | Delete a profile on a deleted customer

try {
    $result = $apiInstance->deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete($customer_id, $profile_id, $is_deleted);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchProfilesApi->deleteSearchProfileByIdCustomersCustomerIdProfilesProfileIdDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | |
| **profile_id** | **string**|  | |
| **is_deleted** | **bool**| Delete a profile on a deleted customer | [optional] [default to false] |

### Return type

**object**

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getProfileByIdCustomersCustomerIdProfilesProfileIdGet()`

```php
getProfileByIdCustomersCustomerIdProfilesProfileIdGet($customer_id, $profile_id): \OpenAPI\Client\Model\Profile
```

Retrieve a search profile

Retrieve a search profile

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


$apiInstance = new OpenAPI\Client\Api\SearchProfilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string
$profile_id = 'profile_id_example'; // string

try {
    $result = $apiInstance->getProfileByIdCustomersCustomerIdProfilesProfileIdGet($customer_id, $profile_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchProfilesApi->getProfileByIdCustomersCustomerIdProfilesProfileIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | |
| **profile_id** | **string**|  | |

### Return type

[**\OpenAPI\Client\Model\Profile**](../Model/Profile.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getProfilesCustomersCustomerIdProfilesGet()`

```php
getProfilesCustomersCustomerIdProfilesGet($customer_id, $prefix, $is_deleted): \OpenAPI\Client\Model\Profile[]
```

Retrieve all search profiles

Retrieve all search profiles

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


$apiInstance = new OpenAPI\Client\Api\SearchProfilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string
$prefix = ''; // string | Search profile tag field by this prefix value
$is_deleted = false; // bool | Whether to include deleted profiles in the result, in addition to active profiles

try {
    $result = $apiInstance->getProfilesCustomersCustomerIdProfilesGet($customer_id, $prefix, $is_deleted);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchProfilesApi->getProfilesCustomersCustomerIdProfilesGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | |
| **prefix** | **string**| Search profile tag field by this prefix value | [optional] [default to &#39;&#39;] |
| **is_deleted** | **bool**| Whether to include deleted profiles in the result, in addition to active profiles | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\Profile[]**](../Model/Profile.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `postProfileByIdCustomersCustomerIdProfilesPost()`

```php
postProfileByIdCustomersCustomerIdProfilesPost($customer_id, $profile_put): \OpenAPI\Client\Model\Profile
```

Create a search profile

Create a search profile

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


$apiInstance = new OpenAPI\Client\Api\SearchProfilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string
$profile_put = new \OpenAPI\Client\Model\ProfilePut(); // \OpenAPI\Client\Model\ProfilePut

try {
    $result = $apiInstance->postProfileByIdCustomersCustomerIdProfilesPost($customer_id, $profile_put);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchProfilesApi->postProfileByIdCustomersCustomerIdProfilesPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | |
| **profile_put** | [**\OpenAPI\Client\Model\ProfilePut**](../Model/ProfilePut.md)|  | |

### Return type

[**\OpenAPI\Client\Model\Profile**](../Model/Profile.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `putProfileByIdCustomersCustomerIdProfilesProfileIdPut()`

```php
putProfileByIdCustomersCustomerIdProfilesProfileIdPut($customer_id, $profile_id, $profile_put): \OpenAPI\Client\Model\Profile
```

Update a search profile

Update a search profile

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


$apiInstance = new OpenAPI\Client\Api\SearchProfilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string
$profile_id = 'profile_id_example'; // string
$profile_put = new \OpenAPI\Client\Model\ProfilePut(); // \OpenAPI\Client\Model\ProfilePut

try {
    $result = $apiInstance->putProfileByIdCustomersCustomerIdProfilesProfileIdPut($customer_id, $profile_id, $profile_put);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchProfilesApi->putProfileByIdCustomersCustomerIdProfilesProfileIdPut: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | |
| **profile_id** | **string**|  | |
| **profile_put** | [**\OpenAPI\Client\Model\ProfilePut**](../Model/ProfilePut.md)|  | |

### Return type

[**\OpenAPI\Client\Model\Profile**](../Model/Profile.md)

### Authorization

[HTTPBasic](../../README.md#HTTPBasic), [HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
