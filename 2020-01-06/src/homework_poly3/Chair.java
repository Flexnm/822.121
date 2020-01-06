package homework_poly3;

public class Chair extends Furniture {

	private int numOfLegs;

	public Chair(int length, int width, int height, String color, int numOfLegs) {
		super(length, width, height, color);
		this.numOfLegs = numOfLegs;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	@Override
	public void draw() {
		
		System.out.println("  i______i");
		System.out.println("  I______I");
		System.out.println("  I      I");
		System.out.println("  I______I");
		System.out.println(" /      /I");
		System.out.println("(______( I");
		System.out.println("I I    I I");
		System.out.println("I      I");

	}

	@Override
	public String toString() {
		return "Chair [numOfLegs=" + numOfLegs + ", " + super.toString() + "]";
	}
	
	

}
