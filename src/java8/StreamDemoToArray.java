package java8;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class StreamDemoToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		Integer[] i = l.stream().toArray(Integer[]::new);
		for(Integer i1:i) {
			System.out.println(i1);
		}
		//--------- Another way is -----------
		// Converting Array i into stream using static method Stream.of
		Stream.of(i).forEach(System.out::println); 
	}

}
