package com.example.db;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.GenreType;
import com.example.beans.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	List<Movie> findByGenre(GenreType genre);
	List<Movie> findByShowtime(Date date);
	List<Movie> findByShowtimeBetween(Date startDate, Date endDate);
	
}
