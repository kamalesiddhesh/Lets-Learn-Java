package jaava;

class ParentThread extends Thread{
	
//  Using ThreadLocal
//	public static ThreadLocal = new ThreadLocal();
	
//  Using InheritableThreadLocal
	public static InheritableThreadLocal tl = new InheritableThreadLocal(){ 
		public Object childValue(Object p) {
			return "CC";
		}	
	};

	
	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread Value--" + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread{
	public void run() {
		System.out.println("Child Thread Value--" + ParentThread.tl.get());
	}
}

public class ThreadLocalDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentThread pt = new ParentThread();
		pt.start();

	}

}
