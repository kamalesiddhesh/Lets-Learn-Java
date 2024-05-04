package jaava;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal tl = new ThreadLocal();
		
		System.out.println(tl.get()); // null
		tl.set("Durga");
		System.out.println(tl.get()); // Durga
		tl.remove();
		System.out.println(tl.get()); // null

	}

}
