package com.example.beans;

public class Drink {
	
	private long id;
	private String name;
	private double price;
	private double alchohol;
	
	private static long currentId = 10;
	
	public Drink(String name, double price, double alchohol) {
		super();
		this.id = currentId;
		currentId += 10;
		this.name = name;
		this.price = price;
		this.alchohol = alchohol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAlchohol() {
		return alchohol;
	}

	public void setAlchohol(double alchohol) {
		this.alchohol = alchohol;
	}

	public long getId() {
		return id;
	}
	
	
	

}
