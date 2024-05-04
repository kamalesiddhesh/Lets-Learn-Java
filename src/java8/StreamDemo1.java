package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l= new ArrayList<String>();
		l.add("A");
		l.add("AAA");
		l.add("AA");
		l.add("AAAAAA");
		l.add("AAAA");
		l.add("AAB");
		
		System.out.println(l);
		
		// Sorting according to the length of String
		
		Comparator<String> c = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			
			if(l1<l2) 
				return -1;
			else if(l1>l2) 
				return 1;
			else 
				return s1.compareTo(s2);
		};
		List<String> l2= l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l2);

	}

}
