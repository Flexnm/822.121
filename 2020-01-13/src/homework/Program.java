package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Program {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int choice;
		do {
			System.out.println(
					"1> Add random number\n2> Print list\n3> Save list to file\n4> Load list from file\n5> Print sum of numbers\n6> Print average of numbers\n7> Print max\n8> Print min\n9> Exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				numbers.add(rand.nextInt(500)+1);
				break;

			case 2:
				//System.out.println(numbers);
				for (int num : numbers) {
					System.out.print(num + " & ");
				}
				System.out.println();
				break;
			case 3:
				// save to file
				try(FileOutputStream fos = new FileOutputStream("backup.nir"); 
						ObjectOutputStream oos = new ObjectOutputStream(fos)){
					
					oos.writeObject(numbers);
					System.out.println("Numbers saved to file");
					
				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 4:
				// read from file
				try(FileInputStream fis = new FileInputStream("backup.nir");
						ObjectInputStream ois = new ObjectInputStream(fis)){
					
					numbers = (ArrayList<Integer>) ois.readObject();
					
					System.out.println("Numbers loaded successfully");
				} catch (IOException | ClassNotFoundException e) {
					System.out.println("Error: " + e.getMessage());
				}
				
				break;
			case 5:
				// sum of all numbers
				int sum = 0;
				for (int num : numbers) {
					sum += num;
				}
				System.out.println("Sum = " + sum);
				break;

			case 6:
				// average of all numbers
				sum = 0;
				for (int num : numbers) {
					sum += num;
				}
				System.out.println("Average = " + sum/(double)numbers.size());
				break;
			case 7:
				// max of numbers
				int max = 0;
//				for (int num : numbers) {
//					if(num > max) {
//						max = num;
//					}
//				}
				max = Collections.max(numbers);
				System.out.println("Max = " + max);
				break;

			case 8:
				int min = Collections.min(numbers);
				System.out.println("Min = " + min);
				break;

			case 9:
				System.out.println("Bye bye");
				break;

			default:
				System.out.println("What are you doing?? Only 1 - 9!");
				break;
			}
			
		

		} while (choice != 9);

	}

}
