package jaava;

import java.util.concurrent.locks.ReentrantLock;

class Display1{
	ReentrantLock l = new ReentrantLock(); // Using java.util.concurrent package 
	
	public  void wish(String name) {
		
		l.lock();
		
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning, ");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e){
				System.out.println(e.getMessage());				
			}
			System.out.println(name+"!");
		  
		}       
		l.unlock();
	}
}

class SynchronizedThread2 extends Thread{
	Display1 d;
	String name;
	
	public SynchronizedThread2(Display1 d, String name) {
		// TODO Auto-generated constructor stub
		this.d =  d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class JavaUtilConcurrentDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display1 d1 =  new Display1();
		
		SynchronizedThread2 t1 =  new SynchronizedThread2(d1, "Siddhesh");
		SynchronizedThread2 t2 =  new SynchronizedThread2(d1, "Omkar");
		t1.start();
		t2.start();
	}

}
