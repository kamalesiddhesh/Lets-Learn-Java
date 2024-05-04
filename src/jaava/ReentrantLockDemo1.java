package jaava;

import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockMethods extends Thread{ 
	static ReentrantLock l = new ReentrantLock();	
	
	public ReentrantLockMethods(String name) {
		super(name);
	}	

	public void run() {		
		if(l.tryLock()) {			
			System.out.println(Thread.currentThread().getName()+"....got Lock and performing safe operations");
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {}
			l.unlock();	
		}
		else {
			System.out.println(Thread.currentThread().getName()+ "....unable to get Lock hence, performing alternate operations");
		}
	}
}


public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLockMethods t1 =  new ReentrantLockMethods("First Thread");
		ReentrantLockMethods t2 =  new ReentrantLockMethods("Second Thread");		
		t1.start();
		t2.start();
	}

}
