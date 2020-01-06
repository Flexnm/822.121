package oop_matala;

import java.util.Arrays;

public class Circuit {
	private String name;
	private String country;
	private int length;
	Car[] cars = new Car[10];

	public Circuit(String name, String country, int length, Car[] cars) {
		super();
		this.name = name;
		this.country = country;
		this.length = length;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Circuit [name=" + name + ", country=" + country + ", length=" + length + ", cars="
				+ Arrays.toString(cars) + "]";
	}

}
