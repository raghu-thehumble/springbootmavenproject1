package com.example.controllers;
// Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
// Annotation
@Controller
public class DemoController {
 
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld()
    { 
        // Print statement
        return "Hello World!";
    }
}