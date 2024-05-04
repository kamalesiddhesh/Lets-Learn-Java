package jaava;

class CustomerThread extends Thread{
	static Integer custId =0;
	
	private static ThreadLocal tl = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
	public CustomerThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + 
				"..executing with customer ID : "+ tl.get());
	}
}

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer Thread-1");
		CustomerThread c2 = new CustomerThread("Customer Thread-2");
		CustomerThread c3 = new CustomerThread("Customer Thread-3");
		CustomerThread c4 = new CustomerThread("Customer Thread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		try {
			Thread.sleep(10000);
			System.out.println("CustomerThread c1 "+c1.custId);
		}
		catch(InterruptedException e) {}
		
		
	}

}
