package homework;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		char[] chars = {'a', 'y', 'c', 's', 'z', 'f'};
		
		// ����� ����� �� ��� ������� ������ ������� ���� ���� ���� ��� ���
		
		// random from char array
		char toGuess = chars[(int)(Math.random()*6)];
		// random from ASCII code
		//char toGuess = (char)(int)(Math.random()*6 + 97);
		
		System.out.println("cheating: " +toGuess);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your guess (a, y, c, s, z, f): ");
		char g = scan.next().charAt(0); // ��� �� ��
		
		if(toGuess == g) {
			System.out.println("You win!");
		} else {
			System.out.println("Wrong guess");
		}

	
		
	}

}









