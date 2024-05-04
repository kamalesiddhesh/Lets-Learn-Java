package java8;
@FunctionalInterface
interface interfDemo{
	public void add(int a, int b);
}

public class MethodReferenceOpertorDemo1 {

	public static void sum(int x,int y ) {
		System.out.println("The sum is : "+(x+y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfDemo i = (a,b)->System.out.println("The sum is : "+(a+b));
		i.add(10,20);
		
		interfDemo i1=MethodReferenceOpertorDemo1::sum;
		i1.add(100,200);
	}
	

}
