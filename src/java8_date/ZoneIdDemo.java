package java8_date;
import java.time.*;

public class ZoneIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
	}

}
