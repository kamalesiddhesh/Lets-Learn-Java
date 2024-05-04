package jaava;



class Phone{
	
	public void greet() {
		System.out.println("Welcome!");
	}
	
	public void on() {
		System.out.println("Turning on Phone");
	}
	
}

class SmartPhone extends Phone{
	
	public void swagat() {
		System.out.println("Swagat hai aapka!");
	}
	
	public void on() {
		System.out.println("Turning on Smart Phone");
	}
}
public class Dynamic_Method_Dispatch_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Phone obj = new Phone();
//		SmartPhone smObj = new SmartPhone();
		
		Phone obj1 = new SmartPhone(); // Allowed
		
//		SmartPhone smObj1 = new Phone(); // Not allowed
		
		obj1.on();      // on() method of SmartPhone class....
//		obj1.swagat(); // Not Allowed...
		obj1.greet();  
		
	}

}
