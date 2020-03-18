package com.example.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Course;
import com.example.beans.Student;
import com.example.facade.College;

@RestController
@RequestMapping("college")
public class CollegeController {

	private College college;

	public CollegeController(College college) {
		super();
		this.college = college;
	}
	
	@GetMapping("students")
	public List<Student> getAllStudents(){
		return college.getAllStudents();
	}
	
	@GetMapping("courses")
	public List<Course> getAllCourses(){
		return college.getAllCourses();
	}
	
	@PostMapping("students")
	public void addStudent(@RequestBody Student student) {
		college.addStudent(student);
	}
	
	@PostMapping("courses")
	public void addCourse(@RequestBody Course course) {
		college.addCourse(course);
	}
	
	
}











