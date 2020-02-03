package db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import beans.Employee;

@Component
public class EmployeeDBDAO {

	@Autowired
	private JdbcTemplate jt; //getJdbcTemplate;
	
	public void addEmployee(Employee employee) {
		jt.update("insert into employees(id, first_name, last_name) values(?, ?, ?)", 
				employee.getId(), employee.getFirstName(), employee.getLastName());
	}
	
}
