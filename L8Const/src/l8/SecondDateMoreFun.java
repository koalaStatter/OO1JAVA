package l8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;


public class SecondDateMoreFun {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld.format(dtf));
		System.out.println(ld.with(TemporalAdjusters.firstDayOfNextMonth()));
	}

}
