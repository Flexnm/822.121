package com.example.facades;

import org.springframework.stereotype.Service;

import com.example.beans.Employee;

@Service
public class EmployeeFacade {

	public Employee createEmployee(long id, String name) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		return emp;
	}
	
	public String deleteEmp(long id) {
		return "Employee " + id  + " was deleted!";
	}
	
}
