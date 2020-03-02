package com.example.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cinemas")
public class Cinema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String city;
	@Column
	private int numOfScreens;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Movie> movies;
	
	public Cinema() {}

	public Cinema(String name, String city, int numOfScreens) {
		super();
		this.name = name;
		this.city = city;
		this.numOfScreens = numOfScreens;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumOfScreens() {
		return numOfScreens;
	}

	public void setNumOfScreens(int numOfScreens) {
		this.numOfScreens = numOfScreens;
	}

	public int getId() {
		return id;
	}

	public Set<Movie> getMovies() {
		return movies;
	}
	
	
	
}










