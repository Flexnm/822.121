package collections;

public class Car {
	private int carNumber;
	private String model;
	private String color;

	public Car(int carNumber, String model, String color) {
		super();
		this.carNumber = carNumber;
		this.model = model;
		this.color = color;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
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

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false;
		}
		
		Car other = (Car)obj;
//		if(other.carNumber == this.carNumber && other.model.equals(this.model)) {
//			return true;
//		} else {
//			return false;
//		}
		
		return other.carNumber == this.carNumber && other.model.equals(this.model);
		
	}
	
	@Override
	public String toString() {
		return "Car [car number= " + carNumber + ", model=" + model + ", color=" + color + "]";
	}

}
