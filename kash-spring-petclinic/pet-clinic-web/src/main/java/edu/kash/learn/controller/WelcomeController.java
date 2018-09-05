package edu.kash.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class WelcomeController

{

    @RequestMapping({"index", "", "/index.html"})
    public String getWelcomepage(Model model) {
        model.addAttribute("name", "Hello World");
        return "welcome";
    }
}
