package java8;
import java.util.function.*;
public class FunctionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f = i->i*i;
		System.out.println(f.apply(4)); // 16
	}

}
