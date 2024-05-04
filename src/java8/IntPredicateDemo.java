package java8;
import java.util.function.*;

public class IntPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate ip = i->i%2==0;  // Input is Integer only so no need to specify
		System.out.println(ip.test(20));
		System.out.println(ip.test(21));
	}

}
