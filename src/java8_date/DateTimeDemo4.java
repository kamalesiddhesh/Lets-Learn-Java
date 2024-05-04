package java8_date;
import java.time.*;
public class DateTimeDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.of(2000,Month.JANUARY,20,12,40);
		System.out.println(dt);
		
		System.out.println("After Six Months: "+dt.plusMonths(6));
		System.out.println("Before Six Months: "+dt.minusMonths(6));
	}

}
