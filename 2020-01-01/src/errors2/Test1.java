package errors2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// input two int numbers and divide the first by the second
		
		int num1, num2;
		while(true) {
			try{
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter first number: ");
				num1 = scan.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Invalid input, try again...");
			}
		}
		
		while(true) {	
			try{
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter second number: ");
				num2 = scan.nextInt();
				
				// two correct numbers here
				System.out.println(num1 / num2);
				
				break;
			} catch(InputMismatchException e) {
				System.out.println("Invalid input, try again...");
			} catch (ArithmeticException e) {
				System.out.println("YOU CANNOT DIVIDE BY ZERO!!!");
			}
		}
		
		
		

	}

}
