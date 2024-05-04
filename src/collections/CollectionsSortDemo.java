package collections;
import java.util.*;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
//		 l.add(new Integer("10"));
//		 l.add(null);
		System.out.println("Before Sorting" + l); // [Z, A, K, N]
		Collections.sort(l);
		System.out.println("After Sorting" + l); // [A, K, N, Z]
	}
}
