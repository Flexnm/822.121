package threads4;

public class DividersThread extends Thread {
	// count how many dividers between two numbers
	
	private int min, max, number;

	public DividersThread(int min, int max, int number) {
		super();
		this.min = min;
		this.max = max;
		this.number = number;
	}
	
	@Override
	public void run() {
		int count = 0;
		for (int i = min; i <= max; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		
		System.out.println("found: " + count);
	}
}







