package collections;

import java.util.*;
import java.io.*;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties p = new Properties();
		File file = new File("C:/Users/siddhesh.kamale/eclipse-ide/myproj/src/collections/abc.properties");
		 
		String path = "C:/Users/siddhesh.kamale/eclipse-ide/myproj/src/collections/abc.properties";
		
		FileInputStream fis = new FileInputStream(file);
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "8888");
		System.out.println(p);
		FileOutputStream fos = new FileOutputStream(file); 
		p.store(fos, "Updated By Durga for SCJP Demo Class");
		
	}

}
