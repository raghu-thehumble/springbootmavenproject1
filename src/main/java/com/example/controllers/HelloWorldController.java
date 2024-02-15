package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

	
	@RequestMapping("/")  
	@ResponseBody
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}  
	
	@RequestMapping(value = "/test")
	@ResponseBody
	   public String hello1() {
	      return "Hello World";
	   }
	
	
}
