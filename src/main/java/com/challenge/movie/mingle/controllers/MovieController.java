package com.challenge.movie.mingle.controllers;

import com.challenge.movie.mingle.models.db.Movie;
import com.challenge.movie.mingle.repositories.MovieRepository;
import com.challenge.movie.mingle.utils.NumberRangeIterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/{movieId}")
    Mono<ResponseEntity<Movie>> getById(@PathVariable int movieId) {
        return movieRepository.findById(movieId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
    @GetMapping("/paginated/{from}/{to}")
    Mono<ResponseEntity<List<Movie>>> getByFromTo(@PathVariable int from, @PathVariable int to) {
        return movieRepository.findAllById(new NumberRangeIterable(from,to))
                .collect(Collectors.toList()).map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

}
