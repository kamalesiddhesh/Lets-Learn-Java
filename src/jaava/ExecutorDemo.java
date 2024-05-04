package jaava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
	
	String name;
	
	PrintJob(String name){
		this.name =  name;
	}
	public void run() {
		System.out.println(name + "....job started by : " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {}
		System.out.println(name+ "....job completed by :" + Thread.currentThread().getName());
	}
}
public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintJob[] jobs = {
							new PrintJob("Sid"),
							new PrintJob("Ravi"),
							new PrintJob("Shiva"),
							new PrintJob("Omkar"),
							new PrintJob("Zack"),
							new PrintJob("David")
						  };
		ExecutorService service = Executors.newFixedThreadPool(6);
		for(PrintJob job: jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}

