package shapes;

public class Circle extends Shape {

	private double radius;

	public Circle(int x, int y, String color, double radius) {
		super(x, y, color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double calcArea() {
		//return radius* radius * 3.14;
		
		return Math.PI * Math.pow(radius, 2);
	}

}
