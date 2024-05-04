package jaava;


abstract class Parent2{
	
	public Parent2() {
		System.out.println("I am Base2 Constructor");
		System.out.println("Parent Object HashCode "+this.hashCode());
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	abstract public void greet();
	abstract public void greet2();
}

class Child2 extends Parent2{
	
	public Child2() {
		 
		System.out.println("I am Child2 Constructor");
		System.out.println("Child Object HashCode "+this.hashCode());
	}
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
	public void greet2() {
		System.out.println("Good Afternoon");
	}
	
	public void sayHello2() {
		System.out.println("Hello2!");
	}
	
}

abstract class Child3 extends Parent2{
	
	public void th() {
		System.out.println("Hiii");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Parent2 p = new Parent2();
		Child2 c = new Child2();
//		c.greet();
//		c.sayHello2();
		
//		Child3 c3 = new Child3();
//		Parent2 p1 = new Child2();
//		p1.sayHello();
		
	}

}
