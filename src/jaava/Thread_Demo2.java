package jaava;

class MyThread1 extends Thread{
	
	public void run() {		
		System.out.println("No-arg run()");
	}
	
	public void run(int i) {
		System.out.println("With-arg run()");
	}
}

public class Thread_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t	= new MyThread1();
		t.start();
	}
}
