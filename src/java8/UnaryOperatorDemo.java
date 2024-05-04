package java8;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> f= i->i*i;
		System.out.println(f.apply(6));
	}

}
