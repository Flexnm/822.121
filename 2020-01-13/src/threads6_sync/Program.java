package threads6_sync;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		long start = System.currentTimeMillis();
		// fill array
		NumbersThread t1 = new NumbersThread(numbers);
		t1.start();
		NumbersThread t2 = new NumbersThread(numbers);
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {}
		
		long end = System.currentTimeMillis();
		System.out.println("size: " + numbers.size() +"\nTime elapsed: " + (end-start) + "ms");

	}
	
		

}
