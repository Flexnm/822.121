package homework;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// the array
		int[] nums = new int[10];
		// init the array with random numbers
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*5+1);
		}
		
		System.out.println(Arrays.toString(nums));
		
		for (int c = 1; c <= 5; c++) {
			int counter = 0;
			for (int i = 0; i < nums.length; i++) {
				if(nums[i] == c) {
					counter++;
				}
			}
			System.out.println(c +" was found " + counter + " times!");
		}

	}

}
