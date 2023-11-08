package com.challenge.movie.mingle.models.db;


public class Genre {

  private long genreId;
  private String genreName;


  public long getGenreId() {
    return genreId;
  }

  public void setGenreId(long genreId) {
    this.genreId = genreId;
  }


  public String getGenreName() {
    return genreName;
  }

  public void setGenreName(String genreName) {
    this.genreName = genreName;
  }

}
