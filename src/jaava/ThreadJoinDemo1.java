package jaava;

class MyTestThread extends Thread{
	
	static Thread mt;
	
	public void run() {
		
		
		try {
//			Thread.sleep(2000);
			mt.join();
		}
		catch (InterruptedException e){
			System.out.println(e.getMessage());
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadJoinDemo1  {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyTestThread.mt = Thread.currentThread(); // ----- Initialize static object 'mt' of Thread class declared in MyTestThread
												  //       which will store pointer value of current executing thread which is (here)main thread
		
		
		MyTestThread t = new MyTestThread();
				
		t.start();
//		t.join();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}

	}

}
