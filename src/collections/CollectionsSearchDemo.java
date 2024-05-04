package collections;
import java.util.*;
public class CollectionsSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println(l); // [Z, A, M, K, a]
		Collections.sort(l);
		System.out.println(l); // [A, K, M, Z, a]
		System.out.println(Collections.binarySearch(l, "Z")); // 3
		System.out.println(Collections.binarySearch(l, "J")); // -2
	}
}
