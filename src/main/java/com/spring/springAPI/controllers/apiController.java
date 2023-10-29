package com.spring.springAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class apiController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}
