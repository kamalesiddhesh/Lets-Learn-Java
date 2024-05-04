package java8;
import java.util.function.*;
public class BiPredicateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> bp= (a,b)->(a+b)%2==0;
		System.out.println(bp.test(10,20));
		System.out.println(bp.test(10,15));

	}

}
