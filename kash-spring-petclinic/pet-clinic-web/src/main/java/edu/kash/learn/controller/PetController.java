package edu.kash.learn.controller;

import edu.kash.learn.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {
    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String getWelcomepage(Model model) {
        model.addAttribute("pets", petService.findAll());
        return "pets/index";
    }
}
