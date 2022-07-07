package com.examly.springapp.Repository;


import com.examly.springapp.models.Venue;
import java.beans.Transient;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Integer> {
  List<Venue> findAll();

  Venue findByVenueId(Integer id);

  @Transactional
  void deleteByVenueId(Integer id);
}
