package java8;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = i->i%2==0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));
	}

}
