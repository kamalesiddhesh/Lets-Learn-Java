package java8;
@FunctionalInterface
interface interfaceForAddMethod {
	public void add(int a,int b);
}

public class LambdaWithInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceForAddMethod i = (a, b) -> System.out.println("The sum is : " + (a + b));
		i.add(10, 20);

	}

}
