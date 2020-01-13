package threads2;

public class MySimpleThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
			
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {}
		}
	}
	
}
