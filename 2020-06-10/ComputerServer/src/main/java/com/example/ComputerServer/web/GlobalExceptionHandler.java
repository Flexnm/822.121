package com.example.ComputerServer.web;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.ComputerServer.services.InvalidComputerException;

@ControllerAdvice
@MyAnnotation(name="hello")
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	//@MyAnnotation(name="no no")
	private int stam;
	
	@MyAnnotation(name="nnn")
	@ExceptionHandler(InvalidComputerException.class)
	public ResponseEntity<String> handleInvalidComputer(Exception e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	}
	
//	@ExceptionHandler(NoSuchElementException.class)
//	public ResponseEntity<String> handleNoSuch(){
//		
//	}
	
}
