package com.example.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Integer> {

	List<Cinema> findByCity(String city);
	
}
