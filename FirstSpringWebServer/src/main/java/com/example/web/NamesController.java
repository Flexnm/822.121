package com.example.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("names")
public class NamesController {
	
	private List<String> names = new ArrayList<String>();
	
	@GetMapping
	public List<String> getAllNames(){
		return names;
	}
	
	@GetMapping("/add")
	public String addName(String name) {
		names.add(name);
		return name + " added successfully!";
	}
	
	@GetMapping("one")
	public String getName(int position) {
		try {
			return names.get(position-1);
		} catch(IndexOutOfBoundsException e) {
			return "ooops! Invalid position";
		}
	}
	
	@GetMapping("one/{pos}")
	public String getName2( @PathVariable int pos) {
		try {
			return names.get(pos-1);
		} catch(IndexOutOfBoundsException e) {
			return "<img src='../../images/puppy.jpg' alt='ooops!' />";
		}
	}
	
	@GetMapping("update/{pos}/{name}")
	public String updateName(@PathVariable int pos, @PathVariable String name) {
		try {
			names.set(pos-1, name);
			return name + " updated";
		} catch (IndexOutOfBoundsException e) {
			return "ooops! Invalid position";
		}
	}

}






