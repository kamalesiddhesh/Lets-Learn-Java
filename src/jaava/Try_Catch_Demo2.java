package jaava;

import java.util.Scanner;

public class Try_Catch_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[3];
		
		arr[0]= 10;
		arr[1]= 9;
		arr[2]= 20;
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter array index that you want to divide: " );
//		int ind=sc.nextInt();
//		System.out.print("Enter divisor: ");
//		int num=sc.nextInt(); 
		boolean flag = true;
		while(flag) {
			
			System.out.print("Enter array index that you want to divide: " );
			int ind=sc.nextInt();
			System.out.print("Enter divisor: ");
			int num=sc.nextInt();
			
			try {
				int res = arr[ind]/num;
				System.out.println("Result: "+res);
				flag = false;
			}
			catch (ArithmeticException e) {
				System.out.println("ArithmeticException Occurred!!");
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException Occurred!!");
			}
			catch (Exception e) {
				System.out.println("Other Exception Occurred. Please check");
			}
		}
	}

}
