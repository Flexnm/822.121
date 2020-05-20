package com.example.facade;

public class NoCourseException extends Exception {

	public NoCourseException() {
		super("No course found");
	}
}
