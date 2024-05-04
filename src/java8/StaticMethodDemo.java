package java8;

import jaava.Test;

interface interf1{
	public static void m1() {
		System.out.println("Interface static method");
	}
}
public class StaticMethodDemo implements interf1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf1.m1();
//		m1(); // 2
//		Test.m1(); //3
//		Test t = new Test();
//		t.m1(); //4
		
	}

}
