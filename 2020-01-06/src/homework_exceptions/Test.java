package homework_exceptions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		TV tv1 = new TV("Sony", 2, false);

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter X to mute/unmute, E to exit or number for volume change: ");
			String input = scan.next();
			if (input.equalsIgnoreCase("X")) { // x or X
				// mute/unmute
				
				tv1.muteVolume();
			} else if (input.equalsIgnoreCase("e")) {
				// exit
				
				System.out.println("Bye!");
				break;
			} else {
				// volume change

				try {
					int vol = Integer.parseInt(input); // "cast" String to int
					tv1.changeVolume(vol);
				} catch(NumberFormatException e) {
					System.out.println("Invalid input! You must enter a valid number");
				} catch (VolumeException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
