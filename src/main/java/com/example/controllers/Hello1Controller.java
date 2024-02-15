package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello1Controller {
	
	
	 @GetMapping({
	        "/",
	        "/hello1"
	    })
	    public String hello1(@RequestParam(value = "name", defaultValue = "World",
	        required = true) String name, Model model) {
	     System.out.println("Test");  
		 
		 
		 model.addAttribute("name", name);
	        return "hello1";
	    }

	  
	 
}
