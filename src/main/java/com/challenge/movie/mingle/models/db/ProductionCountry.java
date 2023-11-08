package com.challenge.movie.mingle.models.db;


public class ProductionCountry {

  private long movieId;
  private long countryId;


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getCountryId() {
    return countryId;
  }

  public void setCountryId(long countryId) {
    this.countryId = countryId;
  }

}
