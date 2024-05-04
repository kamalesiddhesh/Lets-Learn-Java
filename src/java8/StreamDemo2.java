package java8;

import java.util.ArrayList;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(20);
		l.add(5);
		System.out.println(l);
		
		// Find min element in list according to the D.N.S.O
		// [0,5,10,15,20]
		int min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value: "+ min);
		
		// Find max element in list according to the D.N.S.O
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximum value: "+ max);
		
		// Find min and max value in list according to the Customized Sorting (Here Descending order) 
		// [20,15,10,5,0]
		
		Integer newMin = l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("Minimum value(Descending order): "+ newMin);
		
		// Find min and max value in list according to the Customized Sorting (Here Descending order)
		Integer newMax = l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("Maximum value(Descending order: "+ newMax);

	}

}
