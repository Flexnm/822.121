package com.example.web;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Car;
import com.example.facade.CarsService;

@RestController
@RequestMapping("cars")
@CrossOrigin(origins = "http://localhost:4200")
public class CarsController {

	private CarsService service;

	public CarsController(CarsService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public List<Car> getAllCars(){
		return service.getAllCars();
	}
	

	@GetMapping("{id}")
	public ResponseEntity<?> getOneCar(@PathVariable int id) {
		try {
			return ResponseEntity.ok(service.getOneCar(id));
		}catch (NoSuchElementException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
		}
	}
	
	@PostMapping
	public Car addCar(@RequestBody Car car){
		//car.setId(0);
		service.addCar(car);
		return car; // return the new car WITH the new id!
	}
	
	
}







