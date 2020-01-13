package threads2;

public class Program {

	public static void main(String[] args) {
		
		MySimpleThread2 t1 = new MySimpleThread2();
		t1.start();

		MySimpleThread2 t2 = new MySimpleThread2();
		t2.start();

	}

}
