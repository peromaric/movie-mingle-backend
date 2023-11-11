package com.challenge.movie.mingle.services;

import com.challenge.movie.mingle.interfaces.MovieServiceInterface;
import com.challenge.movie.mingle.models.db.Movie;
import com.challenge.movie.mingle.models.dto.MovieDto;
import com.challenge.movie.mingle.repositories.MovieRepository;
import com.challenge.movie.mingle.utils.MovieComparator;
import com.challenge.movie.mingle.utils.NumberRangeIterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements MovieServiceInterface {
    @Autowired
    MovieRepository movieRepository;


    @Override
    public Mono<MovieDto> getById(int id) {
        return movieRepository.findById(id).map(this::createDto);
    }

    @Override
    public Mono<List<MovieDto>> getByFromTo(int from, int to) {
        return movieRepository.findAllById(new NumberRangeIterable(from,to))
                .map(this::createDto)
                .collect(Collectors.toList());
    }

    @Override
    public Mono<List<MovieDto>> getTopTen() {
        return movieRepository.findAll()
                .sort(new MovieComparator().reversed()).take(10)
                .map(this::createDto)
                .collect(Collectors.toList());
    }

    @Override
    public Mono<List<MovieDto>> getTopTenByYear(int year) {
        //#TODO i don't like these two consecutive filters, might need refactoring
        return movieRepository.findAll()
                .filter(movie -> movie.getReleaseDate() != null)
                .filter(movie -> movie.getReleaseDate().toLocalDate().getYear() == year)
                .sort(new MovieComparator().reversed()).take(10)
                .map(this::createDto)
                .collect(Collectors.toList());
    }

    private MovieDto createDto(Movie movie) {
        return new MovieDto(
                movie.getMovieId(),
                movie.getTitle(),
                movie.getBudget(),
                movie.getOverview(),
                movie.getPopularity(),
                movie.getReleaseDate().toLocalDate(),
                movie.getRevenue(),
                movie.getRuntime(),
                movie.getMovieStatus(),
                movie.getTagline(),
                movie.getVoteAverage(),
                movie.getVoteCount()
        );
    }
}
