package collections;
import java.util.*;

class MyComparator_Reverse_Alphabet implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
}


public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q = new PriorityQueue(15,new MyComparator_Reverse_Alphabet());
		
		q.offer("A");
		q.offer("Z");
		q.offer("B");
		q.offer("L");
		System.out.println(q);
	}

}
