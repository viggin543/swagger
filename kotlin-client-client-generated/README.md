# io.swagger.client - Kotlin client library for OpenAPIDefinition annotation is required only once in a project

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BananasApi* | [**createBanana**](docs/BananasApi.md#createbanana) | **POST** /bananas | create a banana
*BananasApi* | [**getBanana**](docs/BananasApi.md#getbanana) | **GET** /bananas/{id} | get a banana

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.ApiError](docs/ApiError.md)
 - [io.swagger.client.models.Banana](docs/Banana.md)
 - [io.swagger.client.models.CreateBanana](docs/CreateBanana.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
