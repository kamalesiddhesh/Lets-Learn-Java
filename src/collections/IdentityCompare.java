package collections;

import java.util.*;

public class IdentityCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap m = new HashMap();
		IdentityHashMap m = new IdentityHashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		
		m.put(I1, "pawan");
		m.put(I2, "kalyan");
		
		System.out.println(m);
	}
}
