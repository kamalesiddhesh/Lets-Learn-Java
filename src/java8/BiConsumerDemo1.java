package java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerDemo1 {
	
	public static void populate(ArrayList<EmployeeDemo> l) {
		l.add(new EmployeeDemo("Durga",5000));
		l.add(new EmployeeDemo("Sunny",6000));
		l.add(new EmployeeDemo("Binny",6500));
		l.add(new EmployeeDemo("Vinny",9000));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<EmployeeDemo,Double> c = (e,d)-> e.salary = e.salary+d;		
		
		ArrayList<EmployeeDemo> l = new ArrayList<EmployeeDemo>();
		populate(l);
		
		for(EmployeeDemo e:l) {
			c.accept(e, 500.0);
		}
		
		for(EmployeeDemo e:l) {
			System.out.println("Employee Name: "+e.name);
			System.out.println("Employee salary: "+e.salary);
			System.out.println();
		}

	}

}
