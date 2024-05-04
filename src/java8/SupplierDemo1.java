package java8;

import java.util.function.*;
import java.util.Date;

public class SupplierDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s= ()-> new Date();
		System.out.println(s.get());
	}

}
