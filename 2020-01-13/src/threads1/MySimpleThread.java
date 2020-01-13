package threads1;

public class MySimpleThread implements Runnable{

	@Override
	public void run() {
		
		//System.out.println("I am in a thread!");
		for (int i = 1; i < 10; i++) {
			System.out.println("i = " + i);
			
			// a long running loop 
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {}
		}
		
		
	}

}
