package com.example.facade;

public class CourseExistsException extends Exception {


	public CourseExistsException() {
		super("Course title already in the system");
	}
	
}
