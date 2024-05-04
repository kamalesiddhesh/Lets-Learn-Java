package jaava;

class Base1{
	public int x;
	
	public Base1() {
		System.out.println("I am a Constructor");
	}
	
	public Base1(int a) {
		System.out.println("I am a Overloaded Constructor with value of a : " + a);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class Derived1 extends Base1{
	public int y;
	
	public Derived1() {
//		super(5); 
		System.out.println("I am a Constructor from Derived Class..");
	}
	
	public Derived1(int a, int b) {
		super(a); 
		System.out.println("I am a Overloaded Constructor from Derived Class with value of b : "+b);
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class constructors_In_Inheritance {
	public static void main(String[] args) {
		
//		Base1 b =  new Base1();
		Derived1 d =  new Derived1(2,3);
		
		
	}

}
