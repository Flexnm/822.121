package threads3;

public class PrintThread extends Thread {

	private String threadName;

	public PrintThread(String threadName) {
		super();
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(threadName + ":" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("I woke up!");
			}
		}
	}
	
}
