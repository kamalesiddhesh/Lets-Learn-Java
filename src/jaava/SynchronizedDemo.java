package jaava;


class Display{
	
	public /*static synchronized*/  void wish(String name) {
		;;;;;;;;;;;;;;
		synchronized (this) {            // static block....
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
		}                                // static block
	;;;;;;;;;;;;;;;;;
	}
}

class SynchronizedThread extends Thread{
	Display d;
	String name;
	
	public SynchronizedThread(Display d, String name) {
		// TODO Auto-generated constructor stub
		this.d =  d;
		this.name = name;
	}
	
	public void run() {
//		d.wish(name);
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d1 =  new Display();
//		Display d2 =  new Display();
		
		SynchronizedThread t1 =  new SynchronizedThread(d1, "Siddhesh");
		SynchronizedThread t2 =  new SynchronizedThread(d1, "Omkar");
		t1.start();
		t2.start();
	}

}
