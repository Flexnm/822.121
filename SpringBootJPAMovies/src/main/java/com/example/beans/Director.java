package com.example.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="directors")
public class Director {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private int experience;
	@OneToMany(mappedBy = "director", fetch = FetchType.EAGER)
	private List<Movie> movies;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	@Override
	public String toString() {
		return "Director [id=" + id + ", name=" + name + ", experience=" + experience + "]";
	}
	
	
 	
	
}
