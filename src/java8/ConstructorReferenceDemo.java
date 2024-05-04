package java8;

interface interf3{
	public Sample getObject(String s);	
}

class Sample{
	
	Sample(){
		System.out.println("Sample Class Constructor Execution: ");
	}
	Sample(String s){
		System.out.println("Sample Class Constructor Execution: "+s);
	}
}
public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf3 i = Sample :: new;
		Sample s1 = i.getObject("Sid"); // Object creation without implementing interface
		Sample s2 = i.getObject("ravi");
		Sample s3 = i.getObject("jassi");
	}

}
