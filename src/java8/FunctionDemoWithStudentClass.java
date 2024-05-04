package java8;

import java.util.function.*;

class StudentDemo{
	int mark;
	String name;
	public StudentDemo(String name, int mark) {
		this.name = name;
		this.mark = mark;		
	}
}

public class FunctionDemoWithStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<StudentDemo,String> f = s->{
			int mark = s.mark;
			String grade= "";
			if(mark>=80) grade="A[Distinction]";
			else if(mark>=60) grade="B[First Class]";
			else if(mark>=50) grade="C[Second Class]";
			else if(mark>=35) grade="D[Third Class]";
			else  grade="E[Failed]";
			return grade;
		};
		
		StudentDemo[] s = {
				new StudentDemo("Durga",100),
				new StudentDemo("Sunny",76),
				new StudentDemo("Bunny",55),
				new StudentDemo("Durga",45),
				new StudentDemo("Durga",25),
		};
		
		for(StudentDemo s1:s) {
			System.out.println("Student Name: "+s1.name);
			System.out.println("Student Marks: "+s1.mark);
			System.out.println("Student Grade: "+f.apply(s1));
			System.out.println();
		}

	}

}
