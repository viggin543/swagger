# BananasApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBanana**](BananasApi.md#createBanana) | **POST** /bananas | create a banana
[**getBanana**](BananasApi.md#getBanana) | **GET** /bananas/{id} | get a banana

<a name="createBanana"></a>
# **createBanana**
> Banana createBanana(body)

create a banana

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BananasApi;


BananasApi apiInstance = new BananasApi();
CreateBanana body = new CreateBanana(); // CreateBanana | 
try {
    Banana result = apiInstance.createBanana(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BananasApi#createBanana");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateBanana**](CreateBanana.md)|  | [optional]

### Return type

[**Banana**](Banana.md)

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BananasApi;


BananasApi apiInstance = new BananasApi();
String id = "id_example"; // String | 
try {
    Banana result = apiInstance.getBanana(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BananasApi#getBanana");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Banana**](Banana.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

