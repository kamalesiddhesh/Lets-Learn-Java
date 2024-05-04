package java8;

public class MethodReferenceOpertorDemo {
	
	public static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread-1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceOpertorDemo t1= new MethodReferenceOpertorDemo(); 
		Runnable r=MethodReferenceOpertorDemo::m1;                       // Static Method Reference
//		Runnable r=t1::m1;  // Instance Method Reference 
		Thread t =  new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread-1");
		}
	}

}
