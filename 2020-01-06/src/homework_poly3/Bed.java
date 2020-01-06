package homework_poly3;

public class Bed extends Furniture {

	private boolean isDoubleBed;

	public Bed(int length, int width, int height, String color, boolean isDoubleBed) {
		super(length, width, height, color);
		this.isDoubleBed = isDoubleBed;
	}

	public boolean isDoubleBed() {
		return isDoubleBed;
	}

	@Override
	public void draw() {
		System.out.println("   ||");
		System.out.println("   ||                   ||");
		System.out.println("||/||___                ||");
		System.out.println("|| /`   )____________||_/|");
		System.out.println("||/___ //_/_/_/_/_/_/||/ |");
		System.out.println("||(___)/_/_/_/_/_/_/_||  |");
		System.out.println("||     |_|_|_|_|_|_|_|| /|");
		System.out.println("||     | | | | | | | ||/||");
		System.out.println("||~~~~~~~~~~~~~~~~~~~||");
		System.out.println("||                   ||");

	}

	@Override
	public String toString() {
		return "Bed [isDoubleBed=" + isDoubleBed + ", " + super.toString() + "]";
	}
	
	

}
