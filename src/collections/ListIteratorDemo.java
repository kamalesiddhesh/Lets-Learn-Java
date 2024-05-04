package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList(); 
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		
		System.out.println(l); // [balakrishna,venki,chiru,nag]
		
		ListIterator ltr =l.listIterator();
		
		while(ltr.hasNext()) {
			String s =  (String)ltr.next();
			
			if(s.equals("venki")) {
				ltr.remove(); // [balakrishna,chiru,nag]
			}
			else if(s.equals("nag")) {
				ltr.add("chaitu"); // [balakrishna,chiru,nag,chaitu]
			}
			else if(s.equals("chiru")) {
				ltr.set("charan"); // [balakrishna,charan,nag,chaitu]
			}
		}
		System.out.println(l);//[balakrishna,charan,nag,chaitu]
	}
}
