# BananasApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBanana**](BananasApi.md#createBanana) | **POST** /bananas | create a banana
[**getBanana**](BananasApi.md#getBanana) | **GET** /bananas/{id} | get a banana

<a name="createBanana"></a>
# **createBanana**
> createBanana(body)

create a banana

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BananasApi()
val body : CreateBanana =  // CreateBanana | 
try {
    apiInstance.createBanana(body)
} catch (e: ClientException) {
    println("4xx response calling BananasApi#createBanana")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BananasApi#createBanana")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateBanana**](CreateBanana.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBanana"></a>
# **getBanana**
> Banana getBanana(id)

get a banana

### markdown is supported&lt;/br&gt;

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BananasApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : Banana = apiInstance.getBanana(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BananasApi#getBanana")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BananasApi#getBanana")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**Banana**](Banana.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

