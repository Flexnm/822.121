package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wonder")
public class WonderfulController {

	@GetMapping("greet")
	public String greetUser() {
		return "Good morning users!";
	}
	
	@PostMapping
	public String greet2() {
		return "Hello to you too!";
	}
	
}
