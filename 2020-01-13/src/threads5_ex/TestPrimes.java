package threads5_ex;

public class TestPrimes {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
//		PrimesThread t1 = new PrimesThread(1, 200_000); //17984 primes in 2197ms
		PrimesThread t1 = new PrimesThread(1, 50_000);
		t1.start();
		PrimesThread t2 = new PrimesThread(50_001, 100_000);
		t2.start();
		PrimesThread t3 = new PrimesThread(100_001, 150_000);
		t3.start();
		PrimesThread t4 = new PrimesThread(150_001, 200_000);
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {}
		
		long end = System.currentTimeMillis();
		System.out.println("Total primes found: " + (t1.getCount() + t2.getCount() + t3.getCount() + t4.getCount()));
		System.out.println("Took " + (end-start) + "ms");
		

	}

}
