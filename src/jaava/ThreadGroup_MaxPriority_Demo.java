package jaava;

public class ThreadGroup_MaxPriority_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup g = new ThreadGroup("tG");
		Thread t1 = new Thread(g,"First Thread");
		Thread t2 = new Thread(g,"Second Thread");
		g.setMaxPriority(3);
		Thread t3 = new Thread(g,"Third Thread");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

	}

}
