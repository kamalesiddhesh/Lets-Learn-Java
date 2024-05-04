package java8_date;
import java.time.*;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter year Number: ");
		
		int n = sc.nextInt();
		Year y = Year.of(n);
		
		if(y.isLeap()) {
			System.out.printf("%d is Leap Year ",n);
		}
		else {
			System.out.printf("%d is not Leap Year ",n);
		}
	}

}
