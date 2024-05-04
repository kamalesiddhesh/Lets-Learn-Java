package arrays;

import java.util.*;

public class ArraysasListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"A","Z","B"};
		List l = Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		
		l.set(1, "L");
		for(String s1:s) {
			System.out.print(s1+" ");
		}
//		l.add("Durga"); // RE : UnsupportedOperationException
//		l.remove(2);  // RE : UnsupportedOperationException
//		l.set(1, new Integer(10)); // RE : ArrayStoreException

	}

}
