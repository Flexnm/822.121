package threads4;

public class Program {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		DividersThread t1 = new DividersThread(1, 100_000_000, 900_000_000);
		t1.start();
		DividersThread t2 = new DividersThread(100_000_001, 200_000_000, 900_000_000);
		t2.start();
		DividersThread t3 = new DividersThread(200_000_001, 300_000_000, 900_000_000);
		t3.start();
		DividersThread t4 = new DividersThread(300_000_001, 450_000_000, 900_000_000);
		t4.start();
		
		// continue only after t1 finishes
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {}			
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Took us: " + (end-start) + "ms");
		
	}

}
