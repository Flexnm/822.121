package com.example.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Beer;

@RestController
@RequestMapping("beer")
public class BeerController {

	private ArrayList<Beer> beerList = new ArrayList<Beer>();
	
	@PostMapping
	public String addBeer(String name, String type, double alcohol) {
		beerList.add( new Beer(name, type, alcohol) );
		return "Beer " + name + " added successfully!";
	}
	
	
	@GetMapping
	public ArrayList<Beer> getAllBeer(){
		return beerList;
	}
}










