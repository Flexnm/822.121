package threads6_sync;

import java.util.ArrayList;

public class NumbersThread extends Thread {
	// reference ArrayList, adds 50 random numbers to the list
	
	private ArrayList<Integer> nums;

	public NumbersThread(ArrayList<Integer> nums) {
		this.nums = nums;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			int num = (int)(Math.random()*101);
			synchronized (nums) {
				nums.add(num);				
			}
			System.out.println(num + " added");
		}
	}
	
	public synchronized void addNum(int num) {
		
	}
	
}
