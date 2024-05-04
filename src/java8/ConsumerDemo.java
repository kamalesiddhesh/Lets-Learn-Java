package java8;
import java.util.function.*;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<StudentDemo> c = s->{
			System.out.println("Student Name: "+s.name);
			System.out.println("Student Marks: "+s.mark);
			System.out.println();
		};
		StudentDemo s1= new StudentDemo("Durga",100); // StudentDemo class object declared in another file
		c.accept(s1);
	}

}
