package java8;
import java.util.*;

class Employee{
	String name;
	int eno;
	public Employee(int eno,String name) {
		this.eno = eno;
		this.name = name;
	}
	
	public String toString() {
		return eno + " : " + name;
		
	}
}

public class LambdaWithEmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1,"Siddhesh"));
		l.add(new Employee(4,"Vikas"));
		l.add(new Employee(5,"Gian"));
		l.add(new Employee(2,"Tanuja"));
		l.add(new Employee(3,"Charan"));
		System.out.println(l);
//		Comparator<Employee> c1 = (o1,o2) -> (o1.eno <o2.eno)?-1:(o1.eno>o2.eno)?1:0; // based on Employee No
// 		Comparator<Employee> c2 = (o1,o2) -> o1.name.compareTo(o2.name);  // based on Employee Names
		Collections.sort(l,(o1,o2) -> o1.name.compareTo(o2.name));
		System.out.println(l);

	}

}
