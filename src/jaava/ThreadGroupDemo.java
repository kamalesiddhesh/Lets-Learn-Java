package jaava;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread Name : " + Thread.currentThread().getName());
		System.out.println("Thread Group : "+ Thread.currentThread().getThreadGroup().getName());
		System.out.println("Thread Group : "+ Thread.currentThread().getThreadGroup().getName());
//		System.out.println();
//		System.out.println("Parent Thread Name : " + Thread.currentThread().getThreadGroup().getParent());
		System.out.println("Parent Thread Group of Current Thread: " + Thread.currentThread().getThreadGroup().getParent().getName());	
		
//		System.out.println("Parent Thread class : " + Thread.currentThread().getThreadGroup().getParent().getName().getClass());		
		// Constructor Type - 1 
		ThreadGroup g = new ThreadGroup("First Group");
		System.out.println(g.getParent().getName());
		// Constructor Type - 2
		ThreadGroup g1 = new ThreadGroup(g,"Second Group");  // (ThreadGroup ParentGroupObject, String GroupName)
		System.out.println(g1.getParent().getName());
		
	}

}
