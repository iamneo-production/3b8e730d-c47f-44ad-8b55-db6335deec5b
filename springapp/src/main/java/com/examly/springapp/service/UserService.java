package com.examly.springapp.service;

import com.examly.springapp.Repository.UserRepository;
import com.examly.springapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User userSignup(User user) {
    return userRepository.save(user);
  }

}
