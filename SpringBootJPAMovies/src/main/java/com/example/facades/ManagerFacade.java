package com.example.facades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Cinema;
import com.example.beans.Director;
import com.example.beans.Movie;
import com.example.db.CinemaRepository;
import com.example.db.DirectorRepository;
import com.example.db.MovieRepository;

@Service
public class ManagerFacade {

	@Autowired
	private DirectorRepository directorRepo;

	@Autowired
	private MovieRepository movieRepo;

	@Autowired
	private CinemaRepository cinemaRepo;

	public void addDirector(Director director) {
		directorRepo.save(director);
	}

	public void addMovie(Movie movie) {
		movieRepo.save(movie);
	}

	public void addCinema(Cinema cinema) {
		cinemaRepo.save(cinema);
	}

	public void updateDirector(Director director) {
		if (directorRepo.existsById(director.getId()))
			directorRepo.save(director);
	}

	public void updateMovie(Movie movie) {
		if (movieRepo.existsById(movie.getId()))
			movieRepo.save(movie);
	}

	public void updateCinema(Cinema cinema) {
		if (cinemaRepo.existsById(cinema.getId()))
			cinemaRepo.save(cinema);
	}

	public void deleteDirector(int id) {
		// get director object
		Director director = getOneDirector(id);
		// loop over all movies by director
		for (Movie movie : director.getMovies()) {
			// clear director from movie (detach director)
			movie.setDirector(null);
			// save to DB
			updateMovie(movie);
		}
		directorRepo.deleteById(id);
	}

	public void deleteMovie(int id) {
		// get Movie object
		Movie movie = getOneMovie(id);
		// get all cinemas
		List<Cinema> cinemas = getAllCinemas();
		// loop over all cinemas
		for (Cinema cinema : cinemas) {
			// remove movie from cinema (detach connection)
			cinema.getMovies().remove(movie);
			// save update to DB
			updateCinema(cinema);
		}
		
		movieRepo.deleteById(id);
	}

	public void deleteCinema(int id) {
		cinemaRepo.deleteById(id);
	}
	
	public List<Director> getAllDirectors(){
		return directorRepo.findAll();
	}
	
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}
	
	public List<Cinema> getAllCinemas(){
		return cinemaRepo.findAll();
	}
	
	public Movie getOneMovie(int id) {
		return movieRepo.findById(id).orElse(null);
	}
	public Director getOneDirector(int id) {
		return directorRepo.findById(id).orElse(null);
	}

}
