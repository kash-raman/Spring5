package edu.learn.kashspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloWorldController {

    @GetMapping
    public String sayHello() {
        return "hello world";
    }

}
