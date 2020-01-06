package homework_poly3;

public abstract class Furniture {
	
	private int length, width, height;
	private String color;
	
	public Furniture(int length, int width, int height, String color) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Furniture [length=" + length + ", width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	
	public abstract void draw();
	
}
