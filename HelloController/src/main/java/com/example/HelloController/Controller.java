package com.example.HelloController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot! Controller.";
    }
}