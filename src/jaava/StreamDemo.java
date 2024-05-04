package jaava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println(l);
		
		// List out Even Numbers using Streams
		List<Integer> l1 = l.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		long noOfElements = l.stream().filter(i->i%2==0).count();
		System.out.println("No of Even Numbers : "+noOfElements);
		
		// Added 5 to values of List l
		List<Integer> l2 = l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l2);
		
		// Sorted list  - ascending order
		List<Integer> l3 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending Order: "+l3);
		
		// Sorted list  - descending order
		// Using comparator for 
		List<Integer> l4 = l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
//		List<Integer> l4 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Descending Order: "+l4);
	}

}
