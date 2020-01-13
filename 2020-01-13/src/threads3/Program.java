package threads3;

public class Program {

	public static void main(String[] args) {
		
		PrintThread t1 = new PrintThread("Noy");
		t1.start();
		
		PrintThread t2 = new PrintThread("Eliran");
		t2.start();

	}

}
