package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagecontroller {

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        // sending data to view
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "Learn Code With Durgesh");
        model.addAttribute("githubRepo", "https://github.com/learncodewithdurgesh/");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("About page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    // registration page
    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
