package jaava;

class ThreadJoin extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Seetha Thread");
			try {
				ThreadJoin.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		
		ThreadJoin t= new ThreadJoin();
		t.start();
		t.join();
//		t.join(10000);
//		t.join(9999,99);
		
		for(int i=0;i<10;i++) {
			System.out.println("Rama Thread");
		}
	}

}
