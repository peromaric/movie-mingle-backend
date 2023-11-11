package com.challenge.movie.mingle.models.dto;

import java.time.LocalDate;

public record MovieDto(
        long movieId,
        String title,
        long budget,
        String overview,
        String popularity,
        LocalDate releaseDate,
        long revenue,
        long runtime,
        String movieStatus,
        String tagline,
        String voteAverage,
        long voteCount
) {
}
