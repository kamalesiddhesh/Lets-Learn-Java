package jaava;


class Display_Number_Char{
	
	public synchronized void  displayn() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
		}
	}
	
	public synchronized void displayc() {
		for(int i=65;i<75;i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
		}
	}
}

class TestThread1 extends Thread{
	
	Display_Number_Char d;
	
	public TestThread1(Display_Number_Char d) {
		this.d = d;
	}
	
	public void run() {
		d.displayn();
	}
}

class TestThread2 extends Thread{
	
	Display_Number_Char d;
	
	public TestThread2(Display_Number_Char d) {
		this.d = d;
	}
	
	public void run() {
		d.displayc();
	}
}

public class SynchronizedDemo_With_Multiple_ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display_Number_Char d = new Display_Number_Char();
		
		TestThread1 t1 = new TestThread1(d);
		TestThread2 t2 = new TestThread2(d);
		
		t1.start();
		t2.start();
	}

}
