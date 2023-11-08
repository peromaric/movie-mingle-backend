package com.challenge.movie.mingle.models.db;


public class MovieGenres {

  private long movieId;
  private long genreId;


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getGenreId() {
    return genreId;
  }

  public void setGenreId(long genreId) {
    this.genreId = genreId;
  }

}
