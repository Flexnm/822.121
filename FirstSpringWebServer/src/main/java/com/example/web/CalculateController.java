package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
	
//	@GetMapping
//	public String sayHi() {
//		return "<h1>Hello world from web server!</h1>";
//	}
	
	@GetMapping("/greet")
	public String greetUser(String name) {
		return "Welcome " + name + ", enjoy your stay :)";
	}
	
	@GetMapping("div")
	public double divNums(double num1, double num2) {
		return num1 / num2;
	}
	
	// get two numbers and add them (plus)
	// get two numbers and subtract them (minus)
	// get two numbers and divide them (div)
	// get two numbers and multiply them (mult)
	
	// in the browser: http://localhost:8080/plus?num1=10&num2=5

}
