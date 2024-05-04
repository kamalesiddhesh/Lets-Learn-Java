package jaava;

class ThreadGroup_Methods extends Thread{
	public ThreadGroup_Methods(ThreadGroup g, String name) {
		// TODO Auto-generated constructor stub
		super(g,name);
	}
	
	public void run() {
		System.out.println("Child thread");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {}
	}
}

public class ThreadGroup_Method_Demo3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");
		
		ThreadGroup_Methods t1 = new ThreadGroup_Methods(pg, "ChildThread1");
		ThreadGroup_Methods t2 = new ThreadGroup_Methods(pg, "ChildThread2");
		
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount()); //2
		System.out.println(pg.activeGroupCount());//1
		
		pg.list();
		
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
//		System.out.println(Thread.currentThread().getName());
		pg.list();
	}

}
