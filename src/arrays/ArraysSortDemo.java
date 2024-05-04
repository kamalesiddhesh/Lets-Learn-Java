package arrays;
import java.util.*;

class Reverse_Alphabets implements Comparator{
	public int compare(Object o1,Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}

public class ArraysSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//--------- Primitive Array --------------------
		int[] a = {10,5,20,11,6};
		System.out.print("Primitive Array before sorting : " );
		for(int a1 : a) {
			System.out.print(a1+ " "); // 10 5 20 11 6
		}
		System.out.println();
		
		Arrays.sort(a);
		System.out.print("Primitive Array after sorting : " );
		for(int a1 : a) {
			System.out.print(a1+ " "); // 5 6 10 11 20
		}
		System.out.println();
//--------- Object Array------------------
		
		String[] s = {"A","Z","B"};
		System.out.print("Object Array before sorting : " );
		for(String a2 : s) {
			System.out.print(a2+ " "); // A Z B 
		}
		System.out.println();
		
		Arrays.sort(s);
		System.out.print("Object Array after sorting : " );
		for(String a2 : s) {
			System.out.print(a2+ " "); // A B Z
		}
		System.out.println();
		
//---------- Object Array with Comparator-----------------
		
		Arrays.sort(s,new Reverse_Alphabets());
		System.out.print("Object Array after sorting by comparator: " );
		for(String a2 : s) {
			System.out.print(a2+ " "); // Z B A 
		}
	}
}
