package com.example.SpringBootHW1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringBootHW1.beans.Course;
import com.example.SpringBootHW1.beans.Lecturer;
import com.example.SpringBootHW1.beans.Student;
import com.example.SpringBootHW1.facades.EmailExistsException;
import com.example.SpringBootHW1.facades.ManagerFacade;

@SpringBootApplication
public class SpringBootHw1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootHw1Application.class, args);
		System.out.println("\n\n\n");
		ManagerFacade manager = ctx.getBean(ManagerFacade.class);
		try {
			//manager.addLecturer(new Lecturer("Nir", "nirg@jbh.co.il"));
			
			//Lecturer lec1 = manager.getOneLecturer(1);
			
			
			//System.out.println(lec1.getCourses());
			
			// add course
			//manager.addCourse(new Course("Java", 100, lec1));
			
			// delete course
			//manager.deleteCourse(2);
			
			// delete lecturer
			//manager.deleteLecturer(2);
			
			//lec1.getCourses().add(new Course("NEW", 222, lec1));
			
			//manager.addStudent(new Student("Donald"));
			//manager.addStudent(new Student("Mickey"));
			
			Student student1 = manager.getOneStudent(1);
			
			//student1.getCourses().add(manager.getOneCourse(1));
			//manager.updateStudent(student1);
			
			System.out.println("Student 1:" + student1.getCourses());
			
			Course course1 = manager.getOneCourse(1);
			System.out.println("Course 1: " + course1.getStudents());
			
			
			System.out.println("Duration: " + manager.getCoursesByDuration(200));
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n\n\n");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
