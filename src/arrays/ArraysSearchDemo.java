package arrays;
import java.util.*;
import static java.util.Arrays.*;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//------------- Primitive Arrays----------------------------
		int[] a = {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));//1
		System.out.println(Arrays.binarySearch(a, 14)); //-5

//-------------- Object Arrays----------------------------

		String[] s ={"A","Z","B"};
		Arrays.sort(s);
		System.out.println(binarySearch(s, "Z")); // 2
		System.out.println(binarySearch(s, "S")); // -3

//-------------- Object Arrays with Customized Sorting----------------------------
		Arrays.sort(s,new Reverse_Alphabets());
		System.out.println(binarySearch(s, "Z",new Reverse_Alphabets())); // 0
		System.out.println(binarySearch(s, "S",new Reverse_Alphabets())); // -2
		System.out.println(binarySearch(s, "N")); // unpredictable result

	}
}
