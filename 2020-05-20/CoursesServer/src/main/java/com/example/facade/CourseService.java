package com.example.facade;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.beans.Course;
import com.example.db.CourseRepository;

@Service
public class CourseService {

	private CourseRepository repo;

	public CourseService(CourseRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void addCourse(Course course) throws CourseExistsException, DateInThePastException {
		
//		List<Course> courses = repo.findAll();
//		for (Course c : courses) {
//			if(c.getTitle().equals(course.getTitle()))
//				throw new CourseExistsException();
//		}
		
		Optional<Course> opt = repo.findCourseByTitle(course.getTitle());
		if(opt.isPresent())
			throw new CourseExistsException();
		
		Date currentDate = new Date(System.currentTimeMillis());
		if(course.getStartDate().before(currentDate))
			throw new DateInThePastException();
		
		repo.save(course);
	}
	
	public void deleteCourse(int id) throws NoCourseException {
		try {
			repo.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new NoCourseException();
		}
	}
	
	public List<Course> getAllCourses(){
		return repo.findAll();
	}
	
	public Course getCourseById(int id) throws NoCourseException {
		return repo.findById(id).orElseThrow(NoCourseException::new);
	}
	
	public Course getCourseByTitle(String title) throws NoCourseException {
		return repo.findCourseByTitle(title).orElseThrow(NoCourseException::new);
	}
}






