package jaava;

public class ThreadGroupDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup system =  Thread.currentThread().getThreadGroup().getParent();
//		System.out.println(system.getName());
		
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		
		for(Thread t1 : t) {
			System.out.println(t1.getName()+ "......."+ t1.isDaemon() );
		}
		

	}

}
