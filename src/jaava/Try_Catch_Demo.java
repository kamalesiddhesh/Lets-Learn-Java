package jaava;

public class Try_Catch_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b= 4;
		
		try{
			int c = a/b;
			System.out.println("Ans: "+c);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("We have failed to divide");
			System.out.println("Reason to failure: "+e);
			
		}

	}

}
