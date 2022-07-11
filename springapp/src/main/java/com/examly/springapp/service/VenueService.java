package com.examly.springapp.service;


import com.examly.springapp.Repository.VenueRepository;
import com.examly.springapp.models.Venue;
import java.beans.Transient;
import java.util.List;
import javax.transaction.Transactional;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenueService {

  @Autowired
  private VenueRepository venueRepository;

  public Venue addNewVenue(Venue venue) {
    return venueRepository.save(venue);
  }

  public Venue getById(Integer id) {
    return venueRepository.findByVenueId(id);
  }

  public List<Venue> getAllVenues(){
    return venueRepository.findAll();
  }

  public Venue updateVenue(Integer id, Venue updatedVenue){
    Venue byVenueId = venueRepository.findByVenueId(id);
    if(byVenueId == null){
      return null;
    }
    if(Strings.isNotBlank(updatedVenue.getVenueName())){
      byVenueId.setVenueName(updatedVenue.getVenueName());
    }
    if(Strings.isNotBlank(updatedVenue.getVenueDescription())){
      byVenueId.setVenueDescription(updatedVenue.getVenueDescription());
    }
    if(Strings.isNotBlank(updatedVenue.getVenueLocation())){
      byVenueId.setVenueLocation(updatedVenue.getVenueLocation());
    }
    if(Strings.isNotBlank(updatedVenue.getVenueImageUrl())){
      byVenueId.setVenueImageUrl(updatedVenue.getVenueImageUrl());
    }
    venueRepository.save(byVenueId);
    return byVenueId;
  }

  @Transactional
  public void delete(Integer id){
    venueRepository.deleteByVenueId(id);
  }

}
