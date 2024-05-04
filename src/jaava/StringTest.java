package jaava;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sid";
		String s2 = "Sid";
		String s3 = new String("Sid");
		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
////		
		System.out.println("HashCode s1 :" + s1.hashCode());
		System.out.println("HashCode s2 :" + s2.hashCode());
		System.out.println("HashCode s3 :" + s3.hashCode());
//		
		
		StringBuffer s4 =  new StringBuffer("Sid");
		StringBuffer s5 =  new StringBuffer("Sid");
		
//		System.out.println(s5==s4);
//		System.out.println(s1.equals(s5));
//		System.out.println(s4.equals(s5));
//		
		System.out.println("HashCode s4 :" + s4.hashCode());
		System.out.println("HashCode s5 :" + s5.hashCode());
		
	}

}
