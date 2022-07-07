package com.examly.springapp.controller;

import com.examly.springapp.VenueService;
import com.examly.springapp.models.Venue;
import javax.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminConroller {

  @Autowired
  private VenueService venueService;


  @PermitAll
  @PostMapping(value = "/addVenue")
  public ResponseEntity<?> addVenue(@RequestBody Venue venue) {
    venue.setVenueId(null);
    venue = venueService.addNewVenue(venue);
    return ResponseEntity.ok(venue);
  }

  @GetMapping("/getVenue")
  public ResponseEntity<?> getAllVenues() {
    return ResponseEntity.ok(venueService.getAllVenues());
  }


  @PutMapping("/editVenue/{id}")
  public ResponseEntity<?> getAllVenues(@PathVariable("id") Integer id, @RequestBody Venue venue) {

    Venue updatedVenue = venueService.updateVenue(id, venue);
    return ResponseEntity.ok(updatedVenue);
  }

  @DeleteMapping("/deleteVenue/{id}")
  public ResponseEntity<?> deleteVenue(@PathVariable("id") Integer id) {
    venueService.delete(id);
    return ResponseEntity.ok().build();
  }


}
