package com.example.greetingmvc.web.controllers;
import com.example.greetingmvc.web.models.*;
import com.example.greetingmvc.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;



@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") @User user, BindingResult result) {
        if (result.hasErrors()) {
            return "register"; // Return to registration form with error messages
        }

        // Save the user data to the database
        userService.saveUser(user);

        return "redirect:/registration-success"; // Redirect to a success page
    }

    @GetMapping("/registration-success")
    public String showRegistrationSuccessPage() {
        return "registration-success";
    }
}

