package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> texts = new ArrayList<String>();

		int choice;
		
		// **  VERSION 1  **
		
//		while (choice != 5) {
//			System.out.println("1> Add new text\n2> Delete last\n3> Delete first\n4> Print\n5> Exit");
//			choice = scan.nextInt();
//			if (choice == 1) {
//				// add new text
//				System.out.print("Please enter a new text: ");
//				texts.add(scan.next());
//			} else if (choice == 2) {
//				texts.remove(texts.size() - 1);
//			} else if (choice == 3) {
//				texts.remove(0);
//			} else if (choice == 4) {
//				System.out.println(texts);
//			} else if(choice == 5) {
//				System.out.println("BYE");
//			} else {
//				System.out.println("Invalid choice!");
//			}
//		}
		
		
		// **  VERSION 2  **
		
		do {
			System.out.println("1> Add new text\n2> Delete last\n3> Delete first\n4> Print\n5> Exit");
			choice = scan.nextInt();
//			if (choice == 1) {
//				// add new text
//				System.out.print("Please enter a new text: ");
//				texts.add(scan.next());
//			} else if (choice == 2) {
//				texts.remove(texts.size() - 1);
//			} else if (choice == 3) {
//				texts.remove(0);
//			} else if (choice == 4) {
//				System.out.println(texts);
//			} else if(choice == 5) {
//				System.out.println("BYE");
//			} else {
//				System.out.println("Invalid choice!");
//			}
			
			
			// **  VERSION 2.2  - switch  **
			switch(choice) {
			case 1:
				System.out.print("Please enter a new text: ");
				texts.add(scan.next());
				break;
			case 2:
				if(texts.size() > 0) {
					texts.remove(texts.size() - 1);
				}
				break;
				
			case 3:
				if(texts.size() > 0) {
					texts.remove(0);
				}
				break;
				
			case 4:
				System.out.println(texts);
				break;
				
			case 5:
				System.out.println("BYE");
				break;
				
			case 6:
				// delete by index
				System.out.print("Enter index of text to delete: ");
				int index = scan.nextInt();
				if(index >= 0 && index < texts.size()) {
					texts.remove(index);
				} else {
					System.out.println("No such index in your ArrayList");
				}
				break;
				
			default:
				System.out.println("Invalid choice!");
					
			}
		} while(choice != 5);
		
		
	}

}
