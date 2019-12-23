package shapes;

public class Rectangle extends Shape {

	private double width, length;

	public Rectangle(int x, int y, String color, double width, double length) {
		super(x, y, color);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

	@Override
	public double calcArea() {
		return width * length;
	}

}
