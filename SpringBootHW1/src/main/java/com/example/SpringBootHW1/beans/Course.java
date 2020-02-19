package com.example.SpringBootHW1.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	@Column
	private String name;
	@Column
	private int duration;
	@ManyToOne
	private Lecturer teacher;
	@ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
	private List<Student> students;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String name, int duration, Lecturer teacher) {
		super();
		this.name = name;
		this.duration = duration;
		this.teacher = teacher;
	}

	
	
	public List<Student> getStudents() {
		return students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Lecturer getTeacher() {
		return teacher;
	}

	public void setTeacher(Lecturer teacher) {
		this.teacher = teacher;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Course [number=" + number + ", name=" + name + ", duration=" + duration + ", teacher=" + teacher + "]";
	}
	

	
	
}









