package java8_date;
import java.time.*;
public class DateTimeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear(); 
		System.out.println(dd+".."+mm+".."+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
	}

}
