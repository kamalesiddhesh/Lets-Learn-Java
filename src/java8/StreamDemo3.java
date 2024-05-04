package java8;

import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Group of objects 
		Stream<Integer> s = Stream.of(9,99,999,9999);
		s.forEach(System.out::println);
		
		// arrays
		Integer[] i = {10,20,30,40,50};
		Stream.of(i).forEach(System.out::println);
	}

}
