package com.challenge.movie.mingle.utils;

import com.challenge.movie.mingle.models.db.Movie;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return Long.compare(o1.getRevenue(), o2.getRevenue());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
