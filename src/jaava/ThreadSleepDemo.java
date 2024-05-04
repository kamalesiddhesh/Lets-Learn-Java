package jaava;

class TestInterruptMethod extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am Lazy Thread..");
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("I got interrupted");
		}
	}
}

public class ThreadSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterruptMethod ts = new TestInterruptMethod();
		ts.start();
		ts.interrupt();
		System.out.println("End of the main thread...");

	}

}
