package com.example.SpringBootHW1.facades;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootHW1.beans.Course;
import com.example.SpringBootHW1.beans.Lecturer;
import com.example.SpringBootHW1.beans.Student;
import com.example.SpringBootHW1.db.CoursesRepository;
import com.example.SpringBootHW1.db.LecturerRepository;
import com.example.SpringBootHW1.db.StudentsRepository;

@Service
public class ManagerFacade {

	@Autowired
	private LecturerRepository lecturerRepo;
	@Autowired
	private CoursesRepository courseRepo;
	@Autowired
	private StudentsRepository studentRepo;
	
	
	public void addStudent(Student student) {
		studentRepo.save(student);
	}
	
	public void updateStudent(Student student) {
		if(studentRepo.existsById(student.getId())) { // if found- update
			studentRepo.save(student);
		}
	}
	
	public void deleteStudent(long id) {
		studentRepo.deleteById(id);
	}
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public Student getOneStudent(long id) {
		return studentRepo.findById(id).orElseThrow();
	}
	
	public void addLecturer(Lecturer lecturer) throws EmailExistsException {
		
		// get all lecturers
		List<Lecturer> lecturers = lecturerRepo.findAll();
		for (Lecturer lec : lecturers) {
			if(lec.getEmail().equals(lecturer.getEmail())) {
				// oh no! email exists...
				throw new EmailExistsException();
			}
		}
		// if email not found: add
		lecturerRepo.save(lecturer); // INSERT
	}
	
	
	public void deleteLecturer(int id) {
		
//		Lecturer lecturer = getOneLecturer(id);
//		for (Course c : lecturer.getCourses()) {
//			//courseRepo.delete(c);
//			c.setTeacher(null);
//		}
		
//		lecturer.getCourses().clear();
//		lecturerRepo.save(lecturer);
		
		lecturerRepo.deleteById(id);
	}
	
	
	public void addCourse(Course course) throws NameExistsException {
		// loop over all course and check name
		List<Course> courses = courseRepo.findAll();
		for (Course c : courses) {
			if(c.getName().equals(course.getName())) {
				// oh no! email exists...
				throw new NameExistsException();
			}
		}
		
		courseRepo.save(course);
	}
	
	public void deleteCourse(int number) {
		courseRepo.deleteById(number);
	}
	
	public List<Lecturer> getAllLecturers(){
		return lecturerRepo.findAll();
	}
	
	public Lecturer getOneLecturer(int id) {
		//return lecturerRepo.findById(id).orElseThrow(NoSuchElementException::new);
		Optional<Lecturer> opt = lecturerRepo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			throw new NoSuchElementException();
	}
	
	
	public List<Course> getAllCourses(){
		return courseRepo.findAll();
	}
	
	public Course getOneCourse(int number) {
		//return courseRepo.findById(number).orElse(null);
		return courseRepo.findById(number).orElseThrow(NoSuchElementException::new);
	}
	
	
	public void updateLecturer(Lecturer lecturer) {
		if(lecturerRepo.existsById(lecturer.getId())) {
			lecturerRepo.save(lecturer); // UPDATE!
		} else {
			throw new NoSuchElementException();
		}
	}
	
	
	public List<Course> getCoursesByDuration(int maxDuration){
		return courseRepo.findCoursesByDurationLessThan(maxDuration);
	}
	
}








