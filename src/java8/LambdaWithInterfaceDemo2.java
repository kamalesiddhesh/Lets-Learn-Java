package java8;
@FunctionalInterface
interface intefaceForSquareMethod{
	public int squareIt(int n);
}
public class LambdaWithInterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intefaceForSquareMethod i= (n)-> n*n;
		System.out.println(i.squareIt(4));

	}

}
