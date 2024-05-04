package jaava;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockMethods2 extends Thread{
	ReentrantLockMethods2(String name){
		super(name);
	}
	static ReentrantLock l = new ReentrantLock();
	
	public void run() {
		do {
			try {
				if(l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+ "....got lock");
					Thread.sleep(30000);
					
					l.unlock();
					System.out.println(Thread.currentThread().getName()+ "....release lock");
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName()
							+ "....unable to get lock and will try again!");
				}
			}
			catch(Exception e) {}
		}
		while(true);
	}	
}

public class ReentrantLockDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLockMethods2 t1 =  new ReentrantLockMethods2("First Thread");
		ReentrantLockMethods2 t2 =  new ReentrantLockMethods2("Second Thread");		
		t1.start();
		t2.start();
	}
}
