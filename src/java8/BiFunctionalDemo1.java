package java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class EmployeeDemo{
	int eno;
	String name;
	double salary;
	
	public EmployeeDemo(int eno,String name) {
		this.eno = eno;
		this.name = name;
	}
	
	public EmployeeDemo(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class BiFunctionalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDemo> l = new ArrayList<EmployeeDemo>();
		BiFunction<Integer,String,EmployeeDemo> 
				f= (eno,name)-> new EmployeeDemo(eno,name);
		l.add(f.apply(100,"Durga"));
		l.add(f.apply(200,"Ravi"));
		l.add(f.apply(300,"Shiva"));
		l.add(f.apply(400,"Pawan"));
		
		for(EmployeeDemo e:l) {
			System.out.println("Employee Number : "+e.eno);
			System.out.println("Employee Name : "+e.name);
			System.out.println();
		}		
	}
}
