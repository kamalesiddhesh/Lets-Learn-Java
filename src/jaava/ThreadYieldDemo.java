package jaava;

import java.util.Iterator;

class MyThread4 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread4 t1 = new MyThread4();
//		t1.setPriority(9);
		t1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
