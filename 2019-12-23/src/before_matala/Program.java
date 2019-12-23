package before_matala;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num1 = scan.nextInt();
//		
//		System.out.println("You entered the number: "  +num1);
//		
//		System.out.println("Enter a number: ");
//		double num2 = scan.nextDouble();
//		System.out.println("You entered the number: "  +num2);
		
		
		
//		System.out.println("Enter your name: ");
//		String name = scan.next();
//		
//		System.out.println("Hello " + name);
		
		
//		System.out.println("Enter a char: ");
//		char tav = scan.next().charAt(0);
//		System.out.println("You entered " + tav);
		
		
		//-----------------------------------------------
		
		Random rand = new Random();
//		System.out.println(rand.nextInt(10)+1);
//		System.out.println((int)(rand.nextDouble()*11));
		
		
		// create a new int array with a size of 3.
		// fill the array with 3 random numbers between 1-10
		int[] nums = new int[3];
		
//		for (int i = 0; i < nums.length; i++) {
//			boolean found = false;
//			int x = (int)(rand.nextDouble()*5+1);
//			System.out.println(x);
//			
//			for (int j = 0; j < nums.length; j++) {
//				if(nums[j] == x) {
//					found = true;
//					break;
//				}
//			}
//			if(found == false) {
//				nums[i] = x;
//			} else {
//				i--;
//			}
//		}
		
		int index = 0;
		while(index < nums.length) {
			int x = (int)(rand.nextDouble()*5+1);
			int i;
			for (i = 0; i < nums.length; i++) {
				if(nums[i] == x) {
					break;
				}
			}
			
			if(i == nums.length) {
				// not found!
				nums[index] = x;
				index++;
			}
		}
		
		
		
		System.out.println(Arrays.toString(nums));
		
		scan.close();
		
	}

}











