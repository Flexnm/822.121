package threads6_sync;

import java.util.Calendar;

public class Program2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.set(2000, Calendar.MARCH, 40);
		System.out.println(cal.getTime());
		
		cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 20);
		System.out.println(cal.getTime());
		
	}

}
