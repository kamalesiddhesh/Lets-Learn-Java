package jaava;

class Mthread extends Thread{
	
}
public class DaemonThread_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().isDaemon());
//		Thread.currentThread().setDaemon(true);
		Mthread t1 =  new Mthread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}

}
