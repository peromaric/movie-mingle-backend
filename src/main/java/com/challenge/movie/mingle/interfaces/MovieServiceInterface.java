package com.challenge.movie.mingle.interfaces;

import com.challenge.movie.mingle.models.dto.MovieDto;
import reactor.core.publisher.Mono;
import java.util.List;

public interface MovieServiceInterface {
    Mono<MovieDto> getById(int id);
    Mono<List<MovieDto>> getByFromTo(int from, int to);
    Mono<List<MovieDto>> getTopTen();
    Mono<List<MovieDto>> getTopTenByYear(int year);
}
