package java8_date;

import java.time.*;

public class DateTimeDemo3 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		System.out.printf("Date:- %d-%d-%d\n",dd,mm,yyyy);
		
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		System.out.printf("Time:- %d:%d:%d:%d",h,m,s,n);
	}

}
