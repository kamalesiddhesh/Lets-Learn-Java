package java8;
import java.util.*;
import java.util.function.*;

class Employee1{
	String name;
	double salary;
	public Employee1(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return this.name + " : " + this.salary;
	}
	
}

public class PredicateDemoWithEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		l.add(new Employee1("Siddhesh",20000));
		l.add(new Employee1("Mahesh",12000));
		l.add(new Employee1("Pratiksha",25000));
		l.add(new Employee1("Darshan",9000));
		l.add(new Employee1("Prajwal",15000));
		
		Predicate<Employee1> p =  e-> e.salary>10000;
		
		for(Employee1 e:l) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
	}

}
