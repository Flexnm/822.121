package com.example.facade;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Car;
import com.example.db.CarsRepository;

@Service
public class CarsService {

	//@Autowired
	private CarsRepository repo;

	public CarsService(CarsRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void addCar(Car car) {
		repo.save(car);
	}
	
	public void deleteCar(int id) {
		repo.deleteById(id);
	}
	
	public List<Car> getAllCars(){
		return repo.findAll();
	}
	
	public Car getOneCar(int id) {
		//return repo.findById(id).orElseThrow( ()->{ return new NoSuchElementException(); } );
		return repo.findById(id).orElseThrow( NoSuchElementException::new );
	}
}






