package com.github.cicd.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HelloCICD {
    @GetMapping("/")
    public String helloCicd() {
        return "Hello CICD";
    }
}
