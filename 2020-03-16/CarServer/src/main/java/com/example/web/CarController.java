package com.example.web;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Car;
import com.example.facades.CarFacade;

@RestController
@RequestMapping("cars")
public class CarController {

	private CarFacade facade;

	public CarController(CarFacade facade) {
		super();
		this.facade = facade;
	}

	@GetMapping
	public List<Car> getAllCars() {
		return facade.getAllCars();
	}
	
	@GetMapping("{id}") // http://localhost:8080/cars/6
	public ResponseEntity<?> getCar(@PathVariable long id) {
		Car c = facade.getOneCar(id);
		if(c != null)
			return ResponseEntity.ok(c);
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Car not found");
	}
	
	@PostMapping // http://localhost:8080
	public void addCar(@RequestBody Car car) {
		facade.addCar(car);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCar(@PathVariable long id) {
		try {
			facade.deleteCar(id);
			return ResponseEntity.ok("car deleted");
		}catch (EmptyResultDataAccessException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("car not found");
		}
	}
	
	@PutMapping
	public ResponseEntity<String> updateCar(@RequestBody Car car) {
		if(facade.updateCar(car))
			return ResponseEntity.ok("Car updated successfully");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error updating car...");
	}
	
}










