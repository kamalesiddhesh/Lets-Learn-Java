package java8;
@FunctionalInterface
interface interf{
	public void m1(); // --- Single Abstract Method--------
	default void m2() {
		
	}
	public static void m3() {
		
	}
}

public class LambdaDemoWithInterface {

	public static void main(String[] args) {
		// Giving reference of Interface interf i for define lambda expression
		interf i = ()-> System.out.println("Hello .....By Lambda Expression");
		i.m1();   // invoked Lambda Expression with Functional Interface(interf)
	}

}
