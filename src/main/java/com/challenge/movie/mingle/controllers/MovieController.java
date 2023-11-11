package com.challenge.movie.mingle.controllers;

import com.challenge.movie.mingle.models.dto.MovieDto;
import com.challenge.movie.mingle.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:8080", "http://localhost:4200" })
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/{movieId}")
    Mono<ResponseEntity<MovieDto>> getById(@PathVariable int movieId) {
        return movieService.getById(movieId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());

    }
    @GetMapping("/paginated/{from}/{to}")
    Mono<ResponseEntity<List<MovieDto>>> getByFromTo(@PathVariable int from, @PathVariable int to) {
        return movieService.getByFromTo(from, to)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/top10")
    Mono<ResponseEntity<List<MovieDto>>> getByFromTo() {
        return movieService.getTopTen()
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/top10/{year}")
    Mono<ResponseEntity<List<MovieDto>>> getByFromTo(@PathVariable int year) {
        return movieService.getTopTenByYear(year)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
