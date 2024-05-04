package collections;

import java.util.*;

class MyComparator1 implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		
		String s1 = obj1.toString(); // ---> for all -> String, StringBuffer etc.
		String s2 = (String)obj2;
		
	
		
//		return s2.compareTo(s1);
		return -s1.compareTo(s2);
		
	}
}

public class TreeSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator1());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("Rajakumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);

	}

}
