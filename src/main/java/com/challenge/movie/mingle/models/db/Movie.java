package com.challenge.movie.mingle.models.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table("movies.movie")
public class Movie {
  @Id
  private long movieId;
  @Column
  private String title;
  @Column
  private long budget;
  @Column
  private String homepage;
  @Column
  private String overview;
  @Column
  private String popularity;
  @Column
  private java.sql.Date releaseDate;
  @Column
  private long revenue;
  @Column
  private long runtime;
  @Column
  private String movieStatus;
  @Column
  private String tagline;
  @Column
  private String voteAverage;
  @Column
  private long voteCount;
}
