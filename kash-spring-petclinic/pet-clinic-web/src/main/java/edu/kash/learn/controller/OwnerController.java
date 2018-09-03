package edu.kash.learn.controller;

import edu.kash.learn.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/OWNer")
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String getWelcomepage(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
