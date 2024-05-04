package jaava;

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeRadiusException extends Exception{
	
	public String toString() {
		return "Radius can not be negative";
	}
}

public class Throw_Throws_Demo {
	
	public static int divide(int a, int b) throws ArithmeticException{
		
		int c = a/b;
		return c;
	}
	
	public static double areaOfCircle(int r) throws NegativeRadiusException, InputMismatchException{
		
		
		if(r<0) {
			throw new NegativeRadiusException();
		}
				
		double area = Math.PI*r*r;
		
		return area;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner sc =  new Scanner(System.in);
		int r=0;
		//**************** Built-in Exception Handling********************
		
		/*
		while(flag) {
			System.out.println("Enter Number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter divisor: ");
			int num2 = sc.nextInt();
			
			try {
				int res = divide(num1, num2);
				System.out.println("Result: " + res);
				flag = false;
			}
			catch (ArithmeticException e){
	//			System.out.println(e.toString());
				e.printStackTrace();
			}
		}
		*/
		
		
		//********** Custom Exception Handling**********************
		
		
		while(flag) {
			System.out.println("Enter Radius : ");
			
		
			try {
				
				while(!sc.hasNextInt()) {
					sc.next();
					throw new InputMismatchException();
										
				}
				r = sc.nextInt();

				double ans = areaOfCircle(r);
				System.out.println("Area of Circle : " + ans);
				flag = false;
				

			}
						
			catch (NegativeRadiusException n) {
				// TODO: handle exception
				System.out.println(n);
			}
			
			catch (InputMismatchException i) {
				// TODO: handle exception
				System.out.println(i);
			}
			
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
//			sc.close();
		}
		
	}

}
