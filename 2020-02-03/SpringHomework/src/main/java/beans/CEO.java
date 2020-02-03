package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
public class CEO extends Person {

	//private String name = "Moty Guttman";
	//private double salary = 650_000;
	private double yearlyBonus = 13;
/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
*/
	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	@Override
	public String toString() {
		return "CEO [name=" + name + ", salary=" + salary + ", yearlyBonus=" + yearlyBonus + "]";
	}

}
