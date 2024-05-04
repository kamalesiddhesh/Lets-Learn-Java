package java8;
import java.util.function.*;
public class FunctionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f1= i->i*2;
		Function<Integer,Integer> f2= i->i*i*i;
		System.out.println("andThen Output of value 2: "+f1.andThen(f2).apply(2)); // 64
		System.out.println("compose Output of value 2: "+f1.compose(f2).apply(2)); // 16
	}

}
