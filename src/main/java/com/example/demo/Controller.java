package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
    @GetMapping("/") 
    public String homepage() {
        return "index";
    }   
}
