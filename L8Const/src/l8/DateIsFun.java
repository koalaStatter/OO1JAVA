package l8;

import java.util.Calendar;
import java.util.Date;

public class DateIsFun {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.set(2018,10,23,11,15);
		Date d1=cal.getTime();
		System.out.println(d1);
		System.out.println(d1.toLocaleString());
		cal.set(1976,05,19,22,30);
		Date d2=cal.getTime();
		System.out.println(d2.toLocaleString());
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		
		
	}

}
