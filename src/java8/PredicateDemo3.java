package java8;
import java.util.function.*;
public class PredicateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0,5,10,15,20,25,30,35};
		
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>10;
//		Predicate<Integer> p3 = i->i<30;
		// and(), or(), negate()
		System.out.println("The numbers which are even & greater than 10 are : ");
		for(int x1:x) {
			if(p1.negate().test(x1)) {
				System.out.println(x1); // 20 30
			}
		}

	}

}
