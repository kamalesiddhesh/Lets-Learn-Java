package jaava;


class MyRunnable implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread..");
		}
	}
}

public class Runnable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		
		t2.start();
//		r.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread...");
		}

	}

}
