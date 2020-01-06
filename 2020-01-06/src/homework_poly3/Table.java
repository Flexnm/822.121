package homework_poly3;

public class Table extends Furniture {

	private int numOfSeats;

	public Table(int length, int width, int height, String color, int numOfSeats) {
		super(length, width, height, color);
		this.numOfSeats = numOfSeats;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	@Override
	public void draw() {
		System.out.println("   =====================");
		System.out.println("  /                   /");
		System.out.println(" /                   /|");
		System.out.println("===================== |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");

	}

	@Override
	public String toString() {
		return "Table [numOfSeats=" + numOfSeats + ", " + super.toString() + "]";
	}
	
	

}
