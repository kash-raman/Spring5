package edu.kash.learn.controller;

import edu.kash.learn.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Vet")
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String getWelcomepage(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
