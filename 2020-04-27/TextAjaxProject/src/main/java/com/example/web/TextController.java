package com.example.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("texts")
@CrossOrigin(origins = "http://localhost:8080") // do not block ajax requests from localhost:8080
public class TextController {
	private static ArrayList<String> texts = new ArrayList<String>();
//	static {
//		texts.add("TEST!");
//		texts.add("TEST2");
//		texts.add("TEST!4");
//		texts.add("TEST5");
//	}
	
	@GetMapping
	public List<String> getAllTexts(){
		return texts;
	}
	
	@GetMapping("{index}") // texts/0
	public ResponseEntity<String> getText(@PathVariable int index){
		/*
		try {
			//return ResponseEntity.ok(texts.get(index));
			return ResponseEntity.status(HttpStatus.OK).body(texts.get(index));
		}catch(IndexOutOfBoundsException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Invalid index!");
		}
		*/
		
		if(index >= 0 && index < texts.size()) {
			return ResponseEntity.status(HttpStatus.OK).body(texts.get(index));
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Invalid index!");
		}
	}
	
	@PostMapping
	public String addText(String txt) {
		texts.add(txt);
		return "Added...";
	}
	
}
