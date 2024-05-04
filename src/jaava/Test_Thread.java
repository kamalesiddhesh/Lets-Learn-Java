package jaava; 

class Thread1 extends Thread{
	
}

public class Test_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(17);
//		Thread.currentThread().setPriority(7);
//		System.out.println(Thread.currentThread().getPriority());
		
		Thread1 t1 = new Thread1();
		
		System.out.println("Priority of Thread t1 : " + t1.getPriority());
	}

}
