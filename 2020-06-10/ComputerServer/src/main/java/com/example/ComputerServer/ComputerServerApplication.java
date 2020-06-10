package com.example.ComputerServer;

import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.ComputerServer.beans.Computer;

@SpringBootApplication
public class ComputerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerServerApplication.class, args);
		
		RestTemplate request = new RestTemplate();
//		try {
			// GET ONE
//			//ResponseEntity<Computer> c1 = request.getForEntity("http://localhost:8080/comp/2", Computer.class);
//			
			// GET ALL
//			ResponseEntity<Computer[]> c1 = request.getForEntity("http://localhost:8080/comp", 
//					Computer[].class);
//			System.out.println("status code: " + c1.getStatusCode());
//			System.out.println(Arrays.toString(c1.getBody()));
//			
			// ADD
//			Computer comp = new Computer("TEST2", 100, 22222);
//			ResponseEntity<Computer> result = request.postForEntity("http://localhost:8080/comp", 
//					comp, Computer.class);
//			System.out.println(result.getBody());
//			
//		}catch(HttpClientErrorException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		
		Computer[] computers = request.getForObject("http://localhost:8080/comp", Computer[].class); 
		System.out.println(Arrays.toString(computers));
		
		// DELETE
		//request.delete("http://localhost:8080/comp/" + computers[3].getId());
		
		// UPDATE
		//Computer updateComp = computers[0];
		//updateComp.setPrice(2500);
		//request.put("http://localhost:8080/comp", updateComp);
		
		ResponseEntity<Computer[]> response = request.exchange("http://localhost:8080/comp", 
				HttpMethod.GET, null, Computer[].class);
		
		HttpHeaders headers = request.headForHeaders("http://localhost:8080/comp");
		
		
	}

}
