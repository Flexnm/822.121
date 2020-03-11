package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greet")
public class GreetController {

	@GetMapping
	public String greet(String username) {
		return "Hello (get) " + username;
	}
	
	@PostMapping
	public String greetPost(String username) {
		return "Hello (post) " + username;
	}
	
}
