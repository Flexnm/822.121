package com.example.SpringBootProj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringBootProj1.beans.Person;
import com.example.SpringBootProj1.db.PersonDBDAO;

@SpringBootApplication
public class SpringBootProj1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProj1Application.class, args);
		
		PersonDBDAO personDB = ctx.getBean(PersonDBDAO.class);
		
		//personDB.save(new Person(30, "Nir"));
		
//		for (Person p : personDB.findAll()) {
//			System.out.println(p);
//		}
		
		Person p1 = personDB.findById(10).orElseThrow();
		System.out.println(p1);
	}

}
