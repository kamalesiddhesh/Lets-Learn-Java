package jaava;

class MyThread3 extends Thread{
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		MyThread3 t1 =  new MyThread3(); 
		System.out.println(t1.getName());
		MyThread3 t2 =  new MyThread3();
		System.out.println(t2.getName());
		
		Thread.currentThread().setName("Siddhesh Kamale");
		System.out.println(Thread.currentThread().getName());
//		 System.out.println(10/0);
	}

}
