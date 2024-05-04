package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga"); // [durga,30,null,durga]
		l.set(0, "Software"); // [Software,30,null,durga]
		l.add(0,"venky"); // [venky,Software,30,null,durga]
		l.removeLast(); // [venky,Software,30,null]
		l.addFirst("CCC"); // [CCC,venky,Software,30,null]
		System.out.println(l); // [CCC,venky,Software,30,null]

	}

}
