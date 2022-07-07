package com.examly.springapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {
    
    @GetMapping("/home")
    public String home(){
        return "hello world 3";
    }
}


