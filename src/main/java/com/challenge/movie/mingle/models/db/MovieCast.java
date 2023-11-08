package com.challenge.movie.mingle.models.db;


public class MovieCast {

  private long movieId;
  private long personId;
  private String characterName;
  private long genderId;
  private long castOrder;


  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }


  public long getPersonId() {
    return personId;
  }

  public void setPersonId(long personId) {
    this.personId = personId;
  }


  public String getCharacterName() {
    return characterName;
  }

  public void setCharacterName(String characterName) {
    this.characterName = characterName;
  }


  public long getGenderId() {
    return genderId;
  }

  public void setGenderId(long genderId) {
    this.genderId = genderId;
  }


  public long getCastOrder() {
    return castOrder;
  }

  public void setCastOrder(long castOrder) {
    this.castOrder = castOrder;
  }

}
