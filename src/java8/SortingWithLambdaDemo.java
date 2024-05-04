package java8;
import java.util.*;
import java.util.stream.*;
public class SortingWithLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(20);
		l.add(15);
		l.add(5);
		l.add(10);
//		l.add("s");
		System.out.println(l);
		Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		List<Integer> l2 = l.stream().filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println("Even Number only list : "+l2);
	}

}
