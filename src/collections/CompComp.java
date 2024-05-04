package collections;
import java.util.*;

class Employee implements Comparable{
	
	String name;
	int eid;
	
	public Employee(String name, int eid) {
		this.eid = eid;
		this.name = name;
	}	
	public String toString() {
		return name + "--" + eid;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int eid1 = this.eid;
		Employee e = (Employee)obj;
		int eid2 = e.eid;
		
		if(eid1 < eid2)
			return -1;
		else if(eid1 > eid2) 
			return +1;
		else 
			return 0;
	}
	
}

class MyComparator4 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return s1.compareTo(s2);
	}
	
}
public class CompComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 =  new Employee("nag",100);
		Employee e2 =  new Employee("balaiah",200);
		Employee e3 =  new Employee("chiru",50);
		Employee e4 =  new Employee("veki",150);
		Employee e5 =  new Employee("nag",100);
		
		TreeSet t =  new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyComparator4());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}

}
