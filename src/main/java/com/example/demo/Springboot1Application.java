package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan({"com.example.controllers","com.example.configuration"})
public class Springboot1Application{      
	   
	
	

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
	
}
