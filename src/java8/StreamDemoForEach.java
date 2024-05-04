package java8;

import java.util.ArrayList;
import java.util.function.*;

public class StreamDemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println("List out elements: ");
		l.stream().forEach(System.out::println);
		Consumer<Integer> c = i->{
			System.out.println("The square of "+i+" is: "+ i*i );
		};
		l.stream().forEach(c);
	}

}
