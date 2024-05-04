package jaava;


class EkClass{
	int a;
	
	public int getA() {
		return a;
	}
	
	public EkClass(int v) {
		a = v;
	}
}

public class This_Super_Demo {
	public static void main(String[] args) {
		EkClass a1 = new EkClass(3); 
		System.out.println(a1.getA());
	}

}
