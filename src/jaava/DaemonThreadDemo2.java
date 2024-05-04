package jaava;

class ChildDaemonThreadDemo extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
	
}
public class DaemonThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDaemonThreadDemo t = new ChildDaemonThreadDemo();
		t.setDaemon(true);
		t.start();
		System.out.println("End Of Main Thread");
	}

}
