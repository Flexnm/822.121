package com.example.web;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Drink;

@RestController
@RequestMapping("drinks")
public class DrinkController {

	private static List<Drink> drinkList = new ArrayList<Drink>();
	
	@GetMapping
	public List<Drink> getAllDrinks(){
		return drinkList;
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<?> getDrinksByName(@PathVariable String name){
		List<Drink> tempList = new ArrayList<Drink>();
		for (Drink drink : drinkList) {
			if(drink.getName().equals(name))
				tempList.add(drink);
		}
		if(tempList.size() > 0)
			return ResponseEntity.ok(tempList);
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found...");
		
		//Java 8 Streams
		//return drinkList.stream().filter(d->d.getName().equals(name)).collect(Collectors.toList());
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> getDrinkById(@PathVariable long id){
		for (Drink drink : drinkList) {
			if(drink.getId() == id)
				return ResponseEntity.ok(drink);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found...");
	}
	
	
	@PostMapping
	public Drink addDrink(@RequestBody Drink drink) {
		drinkList.add(drink);
		return drink;
	}
	
	@DeleteMapping("{id}") // http://localhost:8080/drinks/40
	public ResponseEntity<String> deleteDrink(@PathVariable long id) {
		for (int i = 0; i < drinkList.size(); i++) {
			if(drinkList.get(i).getId() == id) {
				drinkList.remove(i);
				//break;
				return ResponseEntity.ok("Drink deleted!");
			}
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found!");
		
	}
	
	/*
	@DeleteMapping() // http://localhost:8080/drinks?id=40
	public ResponseEntity<String> deleteDrink(long id) {
		for (int i = 0; i < drinkList.size(); i++) {
			if(drinkList.get(i).getId() == id) {
				drinkList.remove(i);
				//break;
				return ResponseEntity.ok("Drink deleted!");
			}
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found!");
		
	}
	*/
	
	
}
