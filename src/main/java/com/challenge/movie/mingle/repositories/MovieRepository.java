package com.challenge.movie.mingle.repositories;

import com.challenge.movie.mingle.models.db.Movie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends ReactiveCrudRepository<Movie, Integer> {
}

