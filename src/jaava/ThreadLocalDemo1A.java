package jaava;

public class ThreadLocalDemo1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadLocal tl = new ThreadLocal() {
			@Override
			public Object initialValue() {   // Overriding of initial value method...
				return "abc";
			}
		};
		
		System.out.println(tl.get()); // null
		tl.set("Durga");
		System.out.println(tl.get()); // Durga
		tl.remove();
		System.out.println(tl.get()); // null
	}

}
