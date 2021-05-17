package com.example.springmvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMvcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDemoApplication.class, args);
    }

    @GetMapping("/sayCar")
    public String sayCar(@RequestParam(value = "myName", defaultValue = "Honda, Toyota, BMW...") String name) {
        return String.format("Hello %s!", name);
    }

}
