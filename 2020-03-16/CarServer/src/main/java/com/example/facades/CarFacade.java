package com.example.facades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Car;
import com.example.db.CarsRepository;

@Service
public class CarFacade {

//	@Autowired
	private CarsRepository repo;

	public CarFacade(CarsRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void addCar(Car car) {
		repo.save(car);
	}
	
	public boolean updateCar(Car car) {
		if(repo.existsById(car.getId())) {
			repo.save(car);
			return true;
		} else {
			return false;
		}
	}
	
	public void deleteCar(long id) {
		repo.deleteById(id);
	}
	
	public List<Car> getAllCars(){
		return repo.findAll();
	}
	
	public Car getOneCar(long id) {
		return repo.findById(id).orElse(null);
	}
	
}
