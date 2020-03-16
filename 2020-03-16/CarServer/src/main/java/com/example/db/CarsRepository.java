package com.example.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Car;

public interface CarsRepository extends JpaRepository<Car, Long> {

}
