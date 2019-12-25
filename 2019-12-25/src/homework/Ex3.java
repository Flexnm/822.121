package homework;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int numToGuess = (int) (Math.random() * 10 + 1);
		System.out.println("shhhh " + numToGuess);

		Scanner scan = new Scanner(System.in);

		int i;
		for (i = 0; i < 3; i++) {
			System.out.print("Please enter your guess: ");
			int guess = scan.nextInt();

			if (guess == numToGuess) {
				System.out.println("YOU WIN!!!");
				break;
			} else {
				if(guess > numToGuess) {
					System.out.println("Your guess is too big, try again...");
				} else {
					System.out.println("Your guess is too small, try again...");
				}
			}
		}
		if(i == 3) {
			System.out.println("You did not guess after 3 tries :(");
		}
		System.out.println("GAME OVER!");
		scan.close();
	}
}
