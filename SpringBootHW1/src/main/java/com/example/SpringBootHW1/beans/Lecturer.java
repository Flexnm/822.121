package com.example.SpringBootHW1.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Lecturer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	@OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
	private List<Course> courses;
	
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Lecturer(String name, String email, List<Course> courses) {
		super();
		this.name = name;
		this.email = email;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Lecturer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
}
