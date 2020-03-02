package com.example;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.beans.Cinema;
import com.example.beans.Director;
import com.example.beans.GenreType;
import com.example.beans.Movie;
import com.example.facades.ManagerFacade;

@SpringBootApplication
public class SpringBootJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJpa3Application.class, args);
		
		ManagerFacade manager = ctx.getBean(ManagerFacade.class);
		
		Cinema cinema1 = new Cinema("C1", "TA", 2);
		manager.addCinema(cinema1);
		
		Movie movie1 = new Movie("M1", GenreType.Action, 120, new Date(System.currentTimeMillis()));
		manager.addMovie(movie1);
		
		Director director1 = new Director("D1", 5);
		manager.addDirector(director1);
		
		movie1.setDirector(director1);
		manager.updateMovie(movie1);
//		
//		
//		
//		Cinema cinema2 = manager.getAllCinemas().get(0);
//		Movie movie2 = manager.getAllMovies().get(0);
//		
//		cinema2.getMovies().add(movie2);
//		manager.updateCinema(cinema2);
		
//		manager.deleteCinema(cinema1.getId());
//		manager.deleteMovie(movie2.getId());
		
//		Director director2 = manager.getAllDirectors().get(0);
//		manager.deleteDirector(director2.getId());
		
		
	}

}
