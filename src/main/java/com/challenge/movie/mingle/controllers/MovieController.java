package com.challenge.movie.mingle.controllers;

import com.challenge.movie.mingle.models.db.Movie;
import com.challenge.movie.mingle.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/{movieId}")
    Mono<ResponseEntity<Movie>> retrieve(@PathVariable int movieId) {
        return movieRepository.findById(movieId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
