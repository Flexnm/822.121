package com.example.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("texts")
public class TextController {
	private static ArrayList<String> texts = new ArrayList<String>();
	static {
		texts.add("TEST!");
		texts.add("TEST2");
		texts.add("TEST!4");
		texts.add("TEST5");
	}
	
	@GetMapping
	public List<String> getAllTexts(){
		return texts;
	}
	
	@GetMapping("{index}")
	public String getText(@PathVariable int index){
		return texts.get(index); // !! ADD ERROR HANDLING FOR INDEX OUT OF BOUNDS !!
	}
	
	@PostMapping
	public String addText(String text) {
		texts.add(text);
		return "Added...";
	}
	
}
