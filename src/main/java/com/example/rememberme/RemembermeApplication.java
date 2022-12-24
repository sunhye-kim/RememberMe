package com.example.rememberme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RemembermeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemembermeApplication.class, args);
    }

}
