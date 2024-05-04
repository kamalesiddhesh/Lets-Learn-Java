package java8;

interface Left{
	default void m1() {
		System.out.println("Left Interface m1 method");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right Interface m1 method");
	}
}

public class DefaultMethodDemo2 implements Left,Right {

	public void m1() {
//		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodDemo2 t = new DefaultMethodDemo2();
		t.m1();
	}
}
