package oop_matala;

import java.util.Arrays;

public class Car {
	private String model;
	private int year;
	Driver[] drivers = new Driver[2];

	public Car(String model, int year, Driver[] drivers) {
		super();
		this.model = model;
		this.year = year;
		this.drivers = drivers;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver[] getDrivers() {
		return drivers;
	}

	public void setDrivers(Driver[] drivers) {
		this.drivers = drivers;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", drivers=" + Arrays.toString(drivers) + "]";
	}

	
}
