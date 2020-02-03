package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee extends Person {
	//private String name;
	//private double salary;
	private String jobDescription;
	private int numDaysOff;
	@Autowired
	private CEO manager;
	
	public Employee(String name, double salary, String jobDescription, int numDaysOff) {
		super();
		this.name = name;
		this.salary = salary;
		this.jobDescription = jobDescription;
		this.numDaysOff = numDaysOff;
	}
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
	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getNumDaysOff() {
		return numDaysOff;
	}

	public void setNumDaysOff(int numDaysOff) {
		this.numDaysOff = numDaysOff;
	}

	public CEO getManager() {
		return manager;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", jobDescription=" + jobDescription + ", numDaysOff="
				+ numDaysOff + ", manager=" + manager.getName() + "]";
	}
	
	
	
}
