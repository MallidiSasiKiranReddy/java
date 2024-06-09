package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/")
	public String Hello()
	{
		return "Hello , this is a sring rest api";
	}
	@GetMapping("/hello-world")
	public String world() {
		return "Hello World";
	}

}
