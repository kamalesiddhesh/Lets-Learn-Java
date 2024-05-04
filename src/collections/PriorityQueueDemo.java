package collections;
import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q = new PriorityQueue();
		
//		System.out.println(q.peek());
//		System.out.println(q.element()); // RE: NoSuchElementException
		
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		System.out.println(q); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(q.poll()); // 0
		System.out.println(q); // [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]
	}
}
