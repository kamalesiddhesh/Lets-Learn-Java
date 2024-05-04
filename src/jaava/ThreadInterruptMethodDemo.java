package jaava;



class TestInterruptMethod1 extends Thread{
	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("I am Lazy Thread - " + i);
		}
		
		try {
			System.out.println("I'm entering into sleeping state");
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			System.out.println("I got Interrupted");
		}
	}
}

public class ThreadInterruptMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterruptMethod1 t = new TestInterruptMethod1();
		t.start();
		t.interrupt();
		System.out.println("End Of the Main Thread");
	}

}
