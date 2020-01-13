package threads6_sync;

public class ClockProgram {

	public static void main(String[] args) {
		
		ClockThread t = new ClockThread();
		t.start();

	}

}
