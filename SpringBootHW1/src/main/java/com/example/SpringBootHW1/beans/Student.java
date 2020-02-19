package com.example.SpringBootHW1.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@ManyToMany(fetch = FetchType.EAGER)
	
	// change the join table parameters:
	// join columns - define the connection from this entity (students) to the join column
	// inverse join columns - define the connection from the other entity (courses) to the join column/
	
	//@JoinTable(inverseJoinColumns = @JoinColumn(name = "course_id"), 
	//	joinColumns = @JoinColumn(name = "student_id"), 
	//	name="students_vs_courses")
	private List<Course> courses;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
