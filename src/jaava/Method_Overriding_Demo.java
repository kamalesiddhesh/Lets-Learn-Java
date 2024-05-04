package jaava;

class A{
	
	public int sid() {
		return 5;
	}
	
	public void meth2() {
		System.out.println("I am Method 2 of Class A");
	}
}

class B extends A{
	
	@Override
	public void meth2() {
		System.out.println("I am Method 2 of Class B");
	}
	
	public void meth3() {
		System.out.println("I am Method 3 of Class B");
	}
}

public class Method_Overriding_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.meth2();
		
		B b = new B();
		b.meth2();

	}

}
