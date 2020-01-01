package errors;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int index;

		for (int i = 1; i <= 5; i++) {
			while (true) {
				try {
					Scanner scan = new Scanner(System.in);
					System.out.print("Enter a valid index: ");
					index = scan.nextInt();
					nums.add(index, (int) (Math.random() * 100));
					System.out.println(nums);
					
					break;
				} catch (InputMismatchException mishmash) {
					System.out.println("Invalid whole number!");

				} catch (IndexOutOfBoundsException e) {
					System.out.println("Oops! Tried to insert the number in  a wrong index");
				}
			}
		}

	}

}
