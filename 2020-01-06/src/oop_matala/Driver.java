package oop_matala;

import java.util.Arrays;

public class Driver {
	private String name;
	private int age;
	Medal[] medals = new Medal[4];

	public Driver(String name, int age, Medal[] medals) {
		super();
		this.name = name;
		this.age = age;
		this.medals = medals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Medal[] getMedals() {
		return medals;
	}

	public void setMedals(Medal[] medals) {
		this.medals = medals;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + ", medals=" + Arrays.toString(medals) + "]";
	}

}
