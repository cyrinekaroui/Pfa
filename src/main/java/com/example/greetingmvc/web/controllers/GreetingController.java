package com.example.greetingmvc.web.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.greetingmvc.web.models.User;

@Controller
public class GreetingController {
  
   /*  @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
   // @ResponseBody
    public String handleMissingParameter(MissingServletRequestParameterException e, Model model) {
        // Handle the exception and add information to the model
        model.addAttribute("errorMessage", "Parameter 'age' is missing in the request.");
        // Return the name of the view that should be used to render the error page
        //return "<h1>error:"+e.getMessage()+" </h1>";
        return "errors";
    } */

    @RequestMapping("/greeting")
    //@ResponseBody
    public String greeting(
    @RequestParam(value = "name",required = false, defaultValue = "World")String name,
    @RequestParam(defaultValue ="18")int age,
    Model model){
      
        String [] names=new String[]{"demo1","demo2","demo3"};
        List<User> users=new ArrayList<User>();
              users.add(new User("demo1","admin"));
              users.add(new User("demo2","user"));
              users.add(new User("demo3","staff"));
        model.addAttribute("users", users);      
       // return "<h1>hello "+name+"</h1> <h2> votre age est "+age+" ans</h2>";
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("names", names);
        model.addAttribute("logo", "logo.png");
       return "greeting";
      }
    /*public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
            @RequestParam(value = "age") int age,
            // @RequestParam(value="age", required = false, defaultValue = "18") int age,
            Model model) {
       

        model.addAttribute("name", "<strong>" + name + "</strong>");
        model.addAttribute("age", age);
        model.addAttribute("user", new User("demo", "admin"));
        return "greeting";
    }*/
}