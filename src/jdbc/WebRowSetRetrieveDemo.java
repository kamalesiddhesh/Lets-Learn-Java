package jdbc;
import java.io.*;
import javax.sql.rowset.*;

public class WebRowSetRetrieveDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		RowSetFactory rsf = RowSetProvider.newFactory();
		WebRowSet wrs = rsf.createWebRowSet();
		wrs.setUrl(url);
		wrs.setUsername(user);
		wrs.setPassword(pass);
		wrs.setCommand("select * from employees");
		wrs.execute();
		
		FileWriter fw = new FileWriter("emp.xml");
		wrs.writeXml(fw);;
		System.out.println("Employee Data Transfered to emp.xml file");
		fw.close();
	}
}
