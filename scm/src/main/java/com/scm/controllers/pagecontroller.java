package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagecontroller {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");

        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutpage() {
        return "about";
    }

    @RequestMapping("/services")
    public String servicespage() {
        return "services";
    }

}
