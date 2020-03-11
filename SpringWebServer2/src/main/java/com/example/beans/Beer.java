package com.example.beans;

public class Beer {
	private String name;
	private String type;
	private double alcohol;

	public Beer(String name, String type, double alcohol) {
		super();
		this.name = name;
		this.type = type;
		this.alcohol = alcohol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

}
