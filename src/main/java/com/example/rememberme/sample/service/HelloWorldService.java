package com.example.rememberme.sample.service;

import com.example.rememberme.sample.dto.HelloWorldDTO;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(){

        HelloWorldDTO helloWorld = new HelloWorldDTO();
        helloWorld.setMsg("helloWorld");

        return helloWorld.getMsg();
    }
}
