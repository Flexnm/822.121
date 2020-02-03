import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.CEO;
import beans.Employee;
import config.SpringConfig;

public class Program2 {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			CEO theOnlyCEO = ctx.getBean(CEO.class);
			theOnlyCEO.setName("Moty Guttman");
			theOnlyCEO.setSalary(650_000);
			theOnlyCEO.setYearlyBonus(13_000_000);
			
			System.out.println(theOnlyCEO);
			
			Employee emp1 = ctx.getBean(Employee.class, "Eldar", 20_000, "Lecturer", 30);
			System.out.println(emp1);
			
			//emp1.getManager().setName("Nir Gal");
			
			Employee emp2 = ctx.getBean(Employee.class, "Hila", 34_000, "HR Manager", 2);
			System.out.println(emp2);
			
		}

	}

}
