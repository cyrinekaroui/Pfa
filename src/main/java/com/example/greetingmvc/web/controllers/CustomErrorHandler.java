package com.example.greetingmvc.web.controllers;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@ControllerAdvice

public class CustomErrorHandler {
/*
   @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleMissingParameter(MissingServletRequestParameterException e, Model model) {
        // Handle the exception and add information to the model
        model.addAttribute("errorMessage", "Parameter 'age' is missing in the request.");

        // Return the name of the view that should be used to render the error page
        return "errors";
    }
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handlerTypeMismatch(MethodArgumentTypeMismatchException e, Model model) {
        // Handle the exception and add information to the model
        model.addAttribute("errorMessage", e.getMessage());

        // Return the name of the view that should be used to render the error page
        return "errors";
    }*/
}