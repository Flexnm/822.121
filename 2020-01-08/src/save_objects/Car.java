package save_objects;

import java.io.Serializable;

public class Car implements Serializable {
	private String model;
	private String color;
	private int year;
	private boolean isAutomatic;
	
	public Car(String model, String color, int year, boolean isAutomatic) {
		super();
		this.model = model;
		this.color = color;
		this.year = year;
		this.isAutomatic = isAutomatic;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", year=" + year + ", isAutomatic=" + isAutomatic + "]";
	}
	
	
	
}
