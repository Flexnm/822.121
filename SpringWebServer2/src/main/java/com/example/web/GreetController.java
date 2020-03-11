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
	
	@PostMapping("login")
	public String checkLogin(String email, String password) {
		if(email.equals("admin@admin.com") && password.equals("admin"))
			return "Welcome Admin :)";
		
		return "Invalid email or password...";
	}
	
}











