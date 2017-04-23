# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        Movie movie = new Movie(); // Movie | Le nouveau film
        try {
            Movie result = apiInstance.addMovie(movie);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addMovie");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addMovie**](docs/DefaultApi.md#addMovie) | **POST** /movies | 
*DefaultApi* | [**deleteMovieById**](docs/DefaultApi.md#deleteMovieById) | **DELETE** /movies/{id} | 
*DefaultApi* | [**getMovieById**](docs/DefaultApi.md#getMovieById) | **GET** /movies/{id} | 
*DefaultApi* | [**getMovies**](docs/DefaultApi.md#getMovies) | **GET** /movies | 
*DefaultApi* | [**updateMovieById**](docs/DefaultApi.md#updateMovieById) | **PUT** /movies/{id} | 


## Documentation for Models

 - [Actors](docs/Actors.md)
 - [Error](docs/Error.md)
 - [Movie](docs/Movie.md)
 - [MovieRatings](docs/MovieRatings.md)
 - [Posters](docs/Posters.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



