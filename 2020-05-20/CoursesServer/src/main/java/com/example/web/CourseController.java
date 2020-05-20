package com.example.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Course;
import com.example.facade.CourseExistsException;
import com.example.facade.CourseService;
import com.example.facade.DateInThePastException;
import com.example.facade.NoCourseException;

@RestController
@RequestMapping("courses")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

	private CourseService service;

	public CourseController(CourseService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Course> getCourses(){
		return service.getAllCourses();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCourseById(@PathVariable int id) {
		try {
			return ResponseEntity.ok(service.getCourseById(id));
		} catch (NoCourseException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@GetMapping("/title/{title}")
	public ResponseEntity<?> getCourseByTitle(@PathVariable String title) {
		try {
			return ResponseEntity.ok(service.getCourseByTitle(title));
		} catch (NoCourseException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable int id){
		try {
			service.deleteCourse(id);
			return ResponseEntity.ok("Course " + id + " deleted!");
		} catch (NoCourseException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@PostMapping
	public ResponseEntity<?> addCourse(@RequestBody Course course) {
		try {
			service.addCourse(course);
			return ResponseEntity.ok(course);
		} catch (CourseExistsException | DateInThePastException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
}
