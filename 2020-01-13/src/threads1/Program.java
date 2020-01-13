package threads1;

public class Program {

	public static void main(String[] args) {
		System.out.println("The end?");
		
		System.out.println("bla bla");
		
		Thread t1 = new Thread(new MySimpleThread());
		t1.start(); // run in parallel! this will call run() for us


		Thread t2 = new Thread(new MySimpleThread());
		t2.start();
		
	}

}
