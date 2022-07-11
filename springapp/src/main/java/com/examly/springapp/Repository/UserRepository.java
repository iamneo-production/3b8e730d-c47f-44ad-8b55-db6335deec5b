package com.examly.springapp.Repository;

import com.examly.springapp.models.User;
import com.examly.springapp.models.Venue;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
