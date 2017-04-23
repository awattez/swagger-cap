package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Movie;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-22T22:19:58.119+02:00")

@Api(value = "movies", description = "the movies API")
public interface MoviesApi {

    @ApiOperation(value = "", notes = "Ajouter un nouveau film", response = Movie.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Le nouveau film", response = Movie.class),
        @ApiResponse(code = 200, message = "Erreur inattendue", response = Movie.class) })
    @RequestMapping(value = "/movies",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Movie> addMovie(@ApiParam(value = "Le nouveau film" ,required=true )  @Valid @RequestBody Movie movie, @RequestHeader("Accept") String accept) throws IOException;


    @ApiOperation(value = "", notes = "Supprimer un film", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Film supprimé", response = Void.class),
        @ApiResponse(code = 200, message = "Erreur inattendue", response = Void.class) })
    @RequestMapping(value = "/movies/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteMovieById(@ApiParam(value = "ID du film",required=true ) @PathVariable("id") Long id, @RequestHeader("Accept") String accept);


    @ApiOperation(value = "", notes = "Retourne un seul film", response = Movie.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Réponse OK", response = Movie.class),
        @ApiResponse(code = 204, message = "Aucun element", response = Movie.class),
        @ApiResponse(code = 200, message = "Erreur inattendue", response = Movie.class) })
    @RequestMapping(value = "/movies/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Movie> getMovieById(@ApiParam(value = "ID du film",required=true ) @PathVariable("id") Long id, @RequestHeader("Accept") String accept) throws IOException;


    @ApiOperation(value = "", notes = "Retourne tous les films", response = Movie.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Movie.class),
        @ApiResponse(code = 200, message = "Erreur inattendue", response = Movie.class) })
    @RequestMapping(value = "/movies",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Movie>> getMovies( @RequestHeader("Accept") String accept) throws IOException;


    @ApiOperation(value = "", notes = "Mettre à jour un film existant", response = Movie.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Le nouveau film", response = Movie.class),
        @ApiResponse(code = 200, message = "Erreur inattendue", response = Movie.class) })
    @RequestMapping(value = "/movies/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Movie> updateMovieById(@ApiParam(value = "ID du film",required=true ) @PathVariable("id") Long id,@ApiParam(value = "Le film" ,required=true )  @Valid @RequestBody Movie movie, @RequestHeader("Accept") String accept) throws IOException;

}
