package com.example.rememberme.sample.controller;

import com.example.rememberme.sample.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value="/helloworld")
    public String helloWorld(){

        return helloWorldService.helloWorld();
    }
}
