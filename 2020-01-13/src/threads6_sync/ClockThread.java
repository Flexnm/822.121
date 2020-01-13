package threads6_sync;

import java.util.Calendar;

public class ClockThread extends Thread {
	
	@Override
	public void run() {
		while(true) {
			Calendar cal = Calendar.getInstance();
			//System.out.println(cal.getTime());
			
			//System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":" 
			//		+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
			
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int minutes = cal.get(Calendar.MINUTE);
			int seconds = cal.get(Calendar.SECOND);
			
			System.out.println((hour<10? "0" + hour: hour )+ ":" + 
					(minutes<10? "0" + minutes : minutes) + ":" +
					(seconds<10? "0" + seconds : seconds));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
}
