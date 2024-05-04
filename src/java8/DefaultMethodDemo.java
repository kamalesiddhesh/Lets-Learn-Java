package java8;

interface I{
	public void m1();
	default void m2() {
		System.out.println("Default Method");
	}
	
//	default int hashCode() {
//		return 10;
//	}
}

public class DefaultMethodDemo implements I {

	public void m1() {
		System.out.println("Abstract Method Implemenation");
	}
	
	public void m2() {
		System.out.println("Overridden implementation of default method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodDemo t = new DefaultMethodDemo();
		I i = new DefaultMethodDemo();
		t.m2();
		i.m2();
		
	}

}
