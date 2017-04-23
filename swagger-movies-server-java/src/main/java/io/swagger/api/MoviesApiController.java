package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Movie;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-22T22:19:58.119+02:00")

@Controller
public class MoviesApiController implements MoviesApi {
    public ResponseEntity<Movie> addMovie(@ApiParam(value = "Le nouveau film" ,required=true )  @Valid @RequestBody Movie movie,
        @RequestHeader("Accept") String accept) throws IOException {
        // do some magic!
        
        ObjectMapper objectMapper = new ObjectMapper();

        if (accept != null && (accept.contains("application/json") || accept.contains("application/xhtml+xml"))) {
            return new ResponseEntity<Movie>(objectMapper.readValue("{  \"criticsConsensus\" : \"aeiou\",  \"Directors\" : [ \"aeiou\" ],  \"ratings\" : {    \"audienceScore\" : 14,    \"criticsScore\" : 60  },  \"posters\" : {    \"thumbnail\" : \"http://example.com/aeiou\",    \"original\" : \"http://example.com/aeiou\",    \"detailed\" : \"http://example.com/aeiou\",    \"profile\" : \"http://example.com/aeiou\"  },  \"Actors\" : [ {    \"name\" : \"aeiou\",    \"id\" : 5,    \"pictures\" : [ \"http://example.com/aeiou\" ]  } ],  \"id\" : 0,  \"title\" : \"aeiou\"}", Movie.class), HttpStatus.OK);
        }

        return new ResponseEntity<Movie>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteMovieById(@ApiParam(value = "ID du film",required=true ) @PathVariable("id") Long id,
        @RequestHeader("Accept") String accept) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Movie> getMovieById(@ApiParam(value = "ID du film",required=true ) @PathVariable("id") Long id,
        @RequestHeader("Accept") String accept) throws IOException {
        // do some magic!
        
        ObjectMapper objectMapper = new ObjectMapper();

        if (accept != null && (accept.contains("application/json") || accept.contains("application/xhtml+xml"))) {
            return new ResponseEntity<Movie>(objectMapper.readValue("{  \"criticsConsensus\" : \"aeiou\",  \"Directors\" : [ \"aeiou\" ],  \"ratings\" : {    \"audienceScore\" : 14,    \"criticsScore\" : 60  },  \"posters\" : {    \"thumbnail\" : \"http://example.com/aeiou\",    \"original\" : \"http://example.com/aeiou\",    \"detailed\" : \"http://example.com/aeiou\",    \"profile\" : \"http://example.com/aeiou\"  },  \"Actors\" : [ {    \"name\" : \"aeiou\",    \"id\" : 5,    \"pictures\" : [ \"http://example.com/aeiou\" ]  } ],  \"id\" : 0,  \"title\" : \"aeiou\"}", Movie.class), HttpStatus.OK);
        }

        return new ResponseEntity<Movie>(HttpStatus.OK);
    }

    public ResponseEntity<List<Movie>> getMovies(@RequestHeader("Accept") String accept) throws IOException {
        // do some magic!
        
        ObjectMapper objectMapper = new ObjectMapper();

        if (accept != null && (accept.contains("application/json") || accept.contains("application/xhtml+xml"))) {
            return new ResponseEntity<List<Movie>>(objectMapper.readValue("[ {  \"criticsConsensus\" : \"aeiou\",  \"Directors\" : [ \"aeiou\" ],  \"ratings\" : {    \"audienceScore\" : 14,    \"criticsScore\" : 60  },  \"posters\" : {    \"thumbnail\" : \"http://example.com/aeiou\",    \"original\" : \"http://example.com/aeiou\",    \"detailed\" : \"http://example.com/aeiou\",    \"profile\" : \"http://example.com/aeiou\"  },  \"Actors\" : [ {    \"name\" : \"aeiou\",    \"id\" : 5,    \"pictures\" : [ \"http://example.com/aeiou\" ]  } ],  \"id\" : 0,  \"title\" : \"aeiou\"} ]", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<Movie>>(HttpStatus.OK);
    }

    public ResponseEntity<Movie> updateMovieById(@ApiParam(value = "ID du film",required=true ) @PathVariable("id") Long id,
        @ApiParam(value = "Le film" ,required=true )  @Valid @RequestBody Movie movie,
        @RequestHeader("Accept") String accept) throws IOException {
        // do some magic!
        
        ObjectMapper objectMapper = new ObjectMapper();

        if (accept != null && (accept.contains("application/json") || accept.contains("application/xhtml+xml"))) {
            return new ResponseEntity<Movie>(objectMapper.readValue("{  \"criticsConsensus\" : \"aeiou\",  \"Directors\" : [ \"aeiou\" ],  \"ratings\" : {    \"audienceScore\" : 14,    \"criticsScore\" : 60  },  \"posters\" : {    \"thumbnail\" : \"http://example.com/aeiou\",    \"original\" : \"http://example.com/aeiou\",    \"detailed\" : \"http://example.com/aeiou\",    \"profile\" : \"http://example.com/aeiou\"  },  \"Actors\" : [ {    \"name\" : \"aeiou\",    \"id\" : 5,    \"pictures\" : [ \"http://example.com/aeiou\" ]  } ],  \"id\" : 0,  \"title\" : \"aeiou\"}", Movie.class), HttpStatus.OK);
        }

        return new ResponseEntity<Movie>(HttpStatus.OK);
    }

}
