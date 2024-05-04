package java8;
import java.util.function.*;
public class FunctionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> f = s->s.toUpperCase();
		System.out.println(f.apply("sIddhesh"));

	}

}
