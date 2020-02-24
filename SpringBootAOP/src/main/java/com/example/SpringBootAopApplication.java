package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.beans.Employee;
import com.example.facades.EmployeeFacade;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAopApplication.class, args);
		
		EmployeeFacade facade = ctx.getBean(EmployeeFacade.class);
		Employee employee = facade.createEmployee(1234, "Moshe");
		System.out.println(employee);
		
		System.out.println(facade.deleteEmp(1234));
	}

}
