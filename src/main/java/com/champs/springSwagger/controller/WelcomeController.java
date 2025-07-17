package com.champs.springSwagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping()
    public String welcome() {
        return "Welcome to the Spring Swagger Application!";
    }
}
