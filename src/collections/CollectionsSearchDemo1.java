package collections;
import java.util.*;

class Comparator_DescendNum implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		return I2.compareTo(I1);
	}
}
public class CollectionsSearchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		
		System.out.println(l); // [15, 0, 20, 10, 5]
		Collections.sort(l, new Comparator_DescendNum());
		System.out.println(l); // [20, 15, 10, 5, 0]
		
		System.out.println(Collections.binarySearch(l,10,new Comparator_DescendNum())); // 10
		System.out.println(Collections.binarySearch(l,13,new Comparator_DescendNum()));
		System.out.println(Collections.binarySearch(l,17,new Comparator_DescendNum()));
	}
}
