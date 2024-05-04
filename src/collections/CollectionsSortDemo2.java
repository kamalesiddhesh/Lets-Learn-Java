package collections;

import java.util.*;

class CustomizedComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
}

public class CollectionsSortDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		System.out.println("Before Sorting: "+l); // [Z, A, K, L]
		Collections.sort(l, new CustomizedComparator());
		System.out.println("After Sorting: "+l); // [Z, L, K, A]
	}
}
