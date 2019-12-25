package homework;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		int index = 0;
		while(index < nums.length) {
			int x = (int)(Math.random()*10+1);
			int i;
			for (i = 0; i < index; i++) {
				if(nums[i] == x) {
					break;
				}
			}
			
			// if x was found
			if(i == index) {
				nums[index] = x;
				index++;
			}
			
		}

		System.out.println(Arrays.toString(nums));
		
		int max = nums[0];
		int min = nums[0];
		int sum = 0;
		int counterOver5 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			} else if(nums[i] < min) {
				min = nums[i];
			}
			
			sum += nums[i];
			
			if(nums[i] > 5) {
				counterOver5++;
			}
		}
		
		System.out.println("Max = " + max + ", Min = " + min +
				", Average = " + sum / (double)nums.length + ",  Over 5 = " + counterOver5);
	}

}

















