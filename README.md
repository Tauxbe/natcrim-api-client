# NatCrim API Clients

This repository contains ready-to-use API clients for the NatCrim API in multiple programming languages. These clients provide a simple and consistent way to interact with the NatCrim API from your applications.

## Available Clients

- **JavaScript/TypeScript** - For web applications and Node.js
- **Java** - For JVM-based applications
- **PHP** - For web applications and services
- **Python** - For data analysis, web apps, and scripts

## Quick Start

### JavaScript/Node.js

```bash
cd clients/javascript
npm install
```

```javascript
const NatCrimApi = require('natcrim-api-client');

// Initialize the client
const apiClient = new NatCrimApi.ApiClient();
apiClient.basePath = 'https://api.natcrim.com';

// Create an API instance
const defaultApi = new NatCrimApi.DefaultApi(apiClient);

// Make API calls
defaultApi.getSomeEndpoint((error, data, response) => {
  if (error) {
    console.error('API Error:', error);
  } else {
    console.log('API Response:', data);
  }
});
```

### Java

```bash
cd clients/java
./gradlew build
```

Add to your `pom.xml`:
```xml
<dependency>
    <groupId>com.natcrim</groupId>
    <artifactId>natcrim-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

```java
import com.natcrim.api.client.ApiClient;
import com.natcrim.api.client.api.DefaultApi;
import com.natcrim.api.client.model.*;

public class NatCrimExample {
    public static void main(String[] args) {
        // Initialize the client
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://api.natcrim.com");
        
        // Create an API instance
        DefaultApi defaultApi = new DefaultApi(apiClient);
        
        try {
            // Make API calls
            Object result = defaultApi.getSomeEndpoint();
            System.out.println("API Response: " + result);
        } catch (Exception e) {
            System.err.println("API Error: " + e.getMessage());
        }
    }
}
```

### PHP

```bash
cd clients/php
composer install
```

```php
<?php
require_once 'vendor/autoload.php';

use NatCrimApiClient\Configuration;
use NatCrimApiClient\ApiClient;
use NatCrimApiClient\Api\DefaultApi;

// Initialize the client
$config = Configuration::getDefaultConfiguration();
$config->setHost('https://api.natcrim.com');

$apiClient = new ApiClient($config);
$defaultApi = new DefaultApi($apiClient);

try {
    // Make API calls
    $result = $defaultApi->getSomeEndpoint();
    echo "API Response: " . json_encode($result) . "\n";
} catch (Exception $e) {
    echo "API Error: " . $e->getMessage() . "\n";
}
?>
```

### Python

```bash
cd clients/python
pip install -r requirements.txt
```

```python
import natcrim_api_client
from natcrim_api_client.rest import ApiException

# Initialize the client
configuration = natcrim_api_client.Configuration(
    host = "https://api.natcrim.com"
)

with natcrim_api_client.ApiClient(configuration) as api_client:
    # Create an API instance
    api_instance = natcrim_api_client.DefaultApi(api_client)
    
    try:
        # Make API calls
        api_response = api_instance.get_some_endpoint()
        print("API Response:", api_response)
    except ApiException as e:
        print("API Error:", e)
```

## Authentication

If the NatCrim API requires authentication, configure it as follows:

### API Key Authentication

**JavaScript:**
```javascript
apiClient.authentications['ApiKeyAuth'].apiKey = 'YOUR_API_KEY';
```

**Java:**
```java
apiClient.setApiKey("YOUR_API_KEY");
```

**PHP:**
```php
$config->setApiKey('ApiKeyAuth', 'YOUR_API_KEY');
```

**Python:**
```python
configuration.api_key['ApiKeyAuth'] = 'YOUR_API_KEY'
```

### Bearer Token Authentication

**JavaScript:**
```javascript
apiClient.authentications['BearerAuth'].accessToken = 'YOUR_ACCESS_TOKEN';
```

**Java:**
```java
apiClient.setAccessToken("YOUR_ACCESS_TOKEN");
```

**PHP:**
```php
$config->setAccessToken('YOUR_ACCESS_TOKEN');
```

**Python:**
```python
configuration.access_token = 'YOUR_ACCESS_TOKEN'
```

## Error Handling

### JavaScript
```javascript
defaultApi.getSomeEndpoint((error, data, response) => {
  if (error) {
    console.error('Status:', response.status);
    console.error('Error:', error.message);
  }
});
```

### Java
```java
try {
    Object result = defaultApi.getSomeEndpoint();
} catch (ApiException e) {
    System.err.println("Status Code: " + e.getCode());
    System.err.println("Response Body: " + e.getResponseBody());
}
```

### PHP
```php
try {
    $result = $defaultApi->getSomeEndpoint();
} catch (\NatCrimApiClient\ApiException $e) {
    echo "Status Code: " . $e->getCode() . "\n";
    echo "Response Body: " . $e->getResponseBody() . "\n";
}
```

### Python
```python
try:
    api_response = api_instance.get_some_endpoint()
except ApiException as e:
    print("Status Code:", e.status)
    print("Reason:", e.reason)
    print("Response Body:", e.body)
```

## Configuration Options

### Custom Base URL
All clients support custom base URLs if you're using a different environment:

- **JavaScript:** `apiClient.basePath = 'https://staging.api.natcrim.com'`
- **Java:** `apiClient.setBasePath("https://staging.api.natcrim.com")`
- **PHP:** `$config->setHost('https://staging.api.natcrim.com')`
- **Python:** `configuration.host = "https://staging.api.natcrim.com"`

### Timeout Configuration
Configure request timeouts:

- **JavaScript:** `apiClient.timeout = 30000` (milliseconds)
- **Java:** `apiClient.setConnectTimeout(30000)` (milliseconds)
- **PHP:** `$config->setCurlTimeout(30)` (seconds)
- **Python:** `configuration.timeout = 30` (seconds)

### SSL Verification
For development environments, you might need to disable SSL verification:

- **JavaScript:** `apiClient.rejectUnauthorized = false`
- **Java:** `apiClient.setVerifyingSsl(false)`
- **PHP:** `$config->setSSLVerification(false)`
- **Python:** `configuration.verify_ssl = False`

## Examples

### Handling Pagination
```python
# Python example for handling paginated responses
page = 1
per_page = 50

while True:
    try:
        response = api_instance.get_paginated_endpoint(page=page, per_page=per_page)
        
        # Process the data
        for item in response.data:
            print(f"Item: {item}")
        
        # Check if there are more pages
        if len(response.data) < per_page:
            break
        
        page += 1
    except ApiException as e:
        print(f"Error fetching page {page}: {e}")
        break
```

### Async Operations (JavaScript)
```javascript
// Using async/await with promises
async function fetchData() {
  try {
    const response = await new Promise((resolve, reject) => {
      defaultApi.getSomeEndpoint((error, data, response) => {
        if (error) reject(error);
        else resolve(data);
      });
    });
    
    console.log('Data:', response);
  } catch (error) {
    console.error('Error:', error);
  }
}
```

## API Documentation

For detailed API documentation including available endpoints, request/response schemas, and parameters, refer to the official NatCrim API documentation at [https://api.natcrim.com/docs](https://api.natcrim.com/docs).

## Support

Each client includes:
- Full type definitions/documentation
- Request/response model classes
- Error handling utilities
- Configuration options
- Example usage code

## License

These API clients are provided as-is for integrating with the NatCrim API. Please refer to the NatCrim API terms of service for usage guidelines.