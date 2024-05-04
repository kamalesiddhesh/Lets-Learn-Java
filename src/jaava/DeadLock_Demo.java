package jaava;


class A1 {
	
	public synchronized void d1(B1 b) {
		System.out.println("Thread 1 trying to execute d1() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 1 trying to call B1's last() method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A1, this B1's last() method");
	}
}

class B1 {
	
	public synchronized void d2(A1 a) {
		System.out.println("Thread 2 trying to execute d2() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 2 trying to call A1's last() method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B1, this A1's last() method");
	}
}

public class DeadLock_Demo extends Thread{
	
	A1 a = new A1();
	B1 b = new B1();
	
	public void m1() {
		this.start();
		a.d1(b);		// This line is executed by main thread
	}
	
	public void run() {
		b.d2(a);		// This line is executed by child thread
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock_Demo d =  new DeadLock_Demo();
		d.m1();
	}
}
