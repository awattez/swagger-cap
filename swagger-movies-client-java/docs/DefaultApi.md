# DefaultApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMovie**](DefaultApi.md#addMovie) | **POST** /movies | 
[**deleteMovieById**](DefaultApi.md#deleteMovieById) | **DELETE** /movies/{id} | 
[**getMovieById**](DefaultApi.md#getMovieById) | **GET** /movies/{id} | 
[**getMovies**](DefaultApi.md#getMovies) | **GET** /movies | 
[**updateMovieById**](DefaultApi.md#updateMovieById) | **PUT** /movies/{id} | 


<a name="addMovie"></a>
# **addMovie**
> Movie addMovie(movie)



Ajouter un nouveau film

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Movie movie = new Movie(); // Movie | Le nouveau film
try {
    Movie result = apiInstance.addMovie(movie);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movie** | [**Movie**](Movie.md)| Le nouveau film |

### Return type

[**Movie**](Movie.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteMovieById"></a>
# **deleteMovieById**
> deleteMovieById(id)



Supprimer un film

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | ID du film
try {
    apiInstance.deleteMovieById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteMovieById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID du film |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMovieById"></a>
# **getMovieById**
> Movie getMovieById(id)



Retourne un seul film

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | ID du film
try {
    Movie result = apiInstance.getMovieById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMovieById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID du film |

### Return type

[**Movie**](Movie.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMovies"></a>
# **getMovies**
> List&lt;Movie&gt; getMovies()



Retourne tous les films

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Movie> result = apiInstance.getMovies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMovies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Movie&gt;**](Movie.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateMovieById"></a>
# **updateMovieById**
> Movie updateMovieById(id, movie)



Mettre à jour un film existant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | ID du film
Movie movie = new Movie(); // Movie | Le film
try {
    Movie result = apiInstance.updateMovieById(id, movie);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateMovieById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID du film |
 **movie** | [**Movie**](Movie.md)| Le film |

### Return type

[**Movie**](Movie.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

