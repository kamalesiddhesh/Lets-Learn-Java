package collections;
import java.util.*;

public class TreeSetDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t =  new TreeSet();
		t.add("A");
		t.add("a");
		t.add("Z");
		t.add("B");
		t.add("L");
//		t.add(new Integer(10));
//		t.add(null);
		System.out.println(t);
	}
}
