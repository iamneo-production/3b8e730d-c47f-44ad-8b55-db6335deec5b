package com.examly.springapp.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {
    
    @GetMapping("/home")
    public String home(){
        return "hello world 2";   
    }
}


