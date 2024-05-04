package collections;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("b", "banana");
		t.put("c", "cat");
		t.put("a", "apple");
		t.put("d", "dog");
		t.put("g", "gun");
		
		System.out.println(t); // {a=apple, b=banana, c=cat, d=dog, g=gun}
		System.out.println(t.ceilingKey("c")); // c=cat
		System.out.println(t.higherKey("e")); // g=gun
		System.out.println(t.floorKey("e")); // d=dog
		System.out.println(t.lowerKey("e")); // d=dog
		
		System.out.println(t.pollFirstEntry()); // a=apple
		System.out.println(t.pollLastEntry()); // g=gun
		
		System.out.println(t.descendingMap()); // {d=dog, c=cat, b=banana}
		System.out.println(t); // {b=banana, c=cat, d=dog}
	} 
}
