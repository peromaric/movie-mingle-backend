package com.challenge.movie.mingle.models.db;


public class MovieCrew {

  private long movieId;
  private long personId;
  private long departmentId;
  private String job;


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


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }


  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

}
