package com.examly.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

  @GetMapping("/home")
  public String getHome() {
    return "home";
  }

  @GetMapping("/")
  public String getHomeData() {
    return "home";
  }

  @GetMapping("/hello")
  public String getHello() {
    return "hello";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }


}
