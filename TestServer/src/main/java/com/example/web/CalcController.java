package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalcController {

	@GetMapping("add")
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@GetMapping("mult")
	public int mult(int num1, int num2) {
		return num1 * num2;
	}
	
}
