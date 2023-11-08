package com.challenge.movie.mingle.models.db;


public class MovieLanguages {

  private long movieId;
  private long languageId;
  private long languageRoleId;


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getLanguageId() {
    return languageId;
  }

  public void setLanguageId(long languageId) {
    this.languageId = languageId;
  }


  public long getLanguageRoleId() {
    return languageRoleId;
  }

  public void setLanguageRoleId(long languageRoleId) {
    this.languageRoleId = languageRoleId;
  }

}
