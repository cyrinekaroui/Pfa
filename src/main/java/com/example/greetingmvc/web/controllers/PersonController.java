package com.example.greetingmvc.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.greetingmvc.web.models.Person;
import com.example.greetingmvc.web.models.requests.PersonForm;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PersonController {
    private static List<Person> people = new ArrayList<Person>();
    private static int idCount = 0;

    static {
        people.add(new Person(idCount++, "demo1", 20));
        people.add(new Person(idCount++, "demo2", 25));
        people.add(new Person(idCount++, "demo3", 30));
        people.add(new Person(idCount++, "demo4", 55));
    }

    @RequestMapping("/people")
    public String getPeople(Model model) {

        model.addAttribute("people", people);
        return "people-list";
    }

    @GetMapping("/add-person")
    public String showAddPerson(Model model) {
        model.addAttribute("personForm", new PersonForm());
        return "add-person";
    }

    @PostMapping("/add-person")
    public String savePerson(@Valid @ModelAttribute("personForm") PersonForm personForm,
            BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", "Something is wrong");
                return "add-person";
        }
        people.add(new Person(idCount++, personForm.getName(), personForm.getAge()));
        return "redirect:/people";
    }

    @GetMapping("/delete-person/{id}")
    public String deletePerson(@PathVariable("id") int id) {

        for (Person person : people) {
            if (person.getId() == id) {
                this.people.remove(person);
                return "redirect:/people";
            }
        }
        return "redirect:/people";
    }

    @GetMapping("/update-person/{id}")
    public String showUpdatePerson(@PathVariable("id") int id, Model model) {
        //model.addAttribute("personForm",new PersonForm()); 
        for (Person person : this.people) {
            if (person.getId()== id)
               { model.addAttribute("personForm", new PersonForm(person.getName(), person.getAge()));
                model.addAttribute("id", id);
                return "update-person";}
        }
        return "redirect:/people";

    }

    @PostMapping("/update-person/{id}")
    public String updatePerson(
                               @PathVariable("id") int id,
                               @Valid @ModelAttribute("personForm") PersonForm personForm, 
                               BindingResult bindingResult) {
       if (bindingResult.hasErrors()) {
            return "update-person";
        } 
            for (Person person : people) {
                if (person.getId() == id){
                   person.setName(personForm.getName());
                   person.setAge(personForm.getAge());
                   break;  }   
            }
        return "redirect:/people";

    }

}