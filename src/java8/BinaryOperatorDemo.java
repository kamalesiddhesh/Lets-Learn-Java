package java8;
import java.util.function.*;
public class BinaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<String> b = (s1,s2)->s1+s2;
		System.out.println(b.apply("durga","soft"));
	}

}
