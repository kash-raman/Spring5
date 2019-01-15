package com.learn.spring5.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @GetMapping
    public String greeting(HttpServletRequest request, @RequestParam(required = false, defaultValue = "") String name) {
        System.out.println(request.getSession().getId());
        return "Hey ".concat(name).concat("!");
    }
}
