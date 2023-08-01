package com.anny.SpringFirstApi2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @GetMapping("/greet")
    public String GreetMe(){
        return "Hello my lovely friend Anny";
    }
}
