package java8;
import java.util.function.*;

public class SupplierDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s= ()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
	}
}
