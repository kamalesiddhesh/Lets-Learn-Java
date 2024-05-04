package collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(1);
		l.add("A");
		l.add(null);
		System.out.println(l); // [A,1,A,null]
		l.remove(2);
		System.out.println(l); // [A,1,null]
		l.add(2,"M");
		l.add("N");
		System.out.println(l); // [A, 1, M, null, N] 
	}

}
