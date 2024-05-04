package collections;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap m = new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
		m.put(104, 106);
//		m.put("FFFF", "XXX");
//		m.put(null, "XXX");
		System.out.println(m); // {100=ZZZ, 101=XXX, 103=YYY, 104=106}
	}

}
