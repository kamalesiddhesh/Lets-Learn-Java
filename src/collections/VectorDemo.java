package collections;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		System.out.println("Initial Capacity: "+v.capacity()); //10
		
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity()); // 10
		v.addElement("A");
		System.out.println("New Capaciy: "+v.capacity()); // 20
		System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

	}

}
