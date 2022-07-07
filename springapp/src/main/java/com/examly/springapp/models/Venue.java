package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Venue {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer venueId;
  private String venueName;

  private String venueImageUrl;
  private String venueDescription;
  private String venueLocation;
}
