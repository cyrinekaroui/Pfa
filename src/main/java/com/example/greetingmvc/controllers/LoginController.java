package com.example.greetingmvc.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.greetingmvc.models.User;
import com.example.greetingmvc.models.Dto.UserDto;
import com.example.greetingmvc.repositories.UserRepository;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "login";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("userdto") UserDto userDto, Model model, BindingResult bindingResult) {
        model.addAttribute("email", userDto.getEmail());

        if (bindingResult.hasErrors()) {
            return "login";
        }

        String email = userDto.getEmail();

        User user = userRepository.findByEmail(email);

        if (user!=null) {
            model.addAttribute("user", user);
            model.addAttribute("userdto", new UserDto());
            return "redirect:/profile/" + user.getId();
        } else {
            model.addAttribute("error", "Invalid Username or Password");
            return "login";
        }
    }
}
