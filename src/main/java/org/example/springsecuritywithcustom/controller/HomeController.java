package org.example.springsecuritywithcustom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping("/Welcome")
    public String homepage(){
        return "Welcome to the rumi's place.";
    }

}
