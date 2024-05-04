package java8_date;
import java.time.*;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate birthday = LocalDate.of(2000,01,20);
		LocalDate today = LocalDate.now();
		
		Period p= Period.between(birthday,today);
		System.out.printf("Age is %d Years %d Months %d Days", 
						   p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathday =LocalDate.of(2000+60,06,15);
		Period p1 = Period.between(today,deathday);
		int d = p1.getYears()*365 + p1.getMonths()*30+p1.getDays();
		System.out.printf("\nYou will be on earth only %d Days..."
				+"... Hurry up to more IMP things",d);
	}

}
