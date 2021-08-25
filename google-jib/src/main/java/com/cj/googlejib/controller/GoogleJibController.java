package com.cj.googlejib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/google/jib")
public class GoogleJibController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1 style=\"text-align:center; color:green\" >Greetings from Spring Boot and Jib!</h1>";
    }
}
