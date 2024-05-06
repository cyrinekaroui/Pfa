package com.example.greetingmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class ProfileController {

     @GetMapping("/profile/{id}")
    public String userProfile (@PathVariable("id") Long id, Model model) {
        return "profile"; // Return the name of your profile view/template
        
    }
}

