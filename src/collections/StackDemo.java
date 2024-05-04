package collections;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s); // [A,B,C]
		System.out.println(s.search("A")); // 3
		System.out.println(s.search("Z")); // -1
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

	}

}
