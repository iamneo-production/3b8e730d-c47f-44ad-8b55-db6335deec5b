package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {
    
    @GetMapping("/old-home")
    public String home(){
        return "hello world 3";
    }
}


