import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Employee;
import config.SpringConfig;
import db.EmployeeDBDAO;

public class Program {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			Employee emp = new Employee(10, "First", "Last");
			EmployeeDBDAO empDB = ctx.getBean(EmployeeDBDAO.class);
			empDB.addEmployee(emp);
			
		}

	}

}
