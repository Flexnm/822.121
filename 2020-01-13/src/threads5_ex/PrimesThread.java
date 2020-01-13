package threads5_ex;

public class PrimesThread extends Thread {
	private int min, max, count;

	public PrimesThread(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		count = 0;
		if(min == 1) {
			count--;
		}
		
		for (int i = min; i <= max; i++) {
			
			if(isPrime(i)) {
				count++;
			}
			
//			boolean isPrime = true;
//			for (int j = 2; j <= i/2; j++) {
//				if(i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			
//			if(isPrime) {
//				count++;
//			}
		}
		
		System.out.println("Found " + count + " primes!");
	}
	
	public boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
