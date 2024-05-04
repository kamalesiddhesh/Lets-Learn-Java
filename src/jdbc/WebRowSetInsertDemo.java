package jdbc;
import java.io.*;
import java.sql.*;
import javax.sql.rowset.*;


public class WebRowSetInsertDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		con.setAutoCommit(false);
		RowSetFactory rsf = RowSetProvider.newFactory();
		WebRowSet wrs = rsf.createWebRowSet();
		wrs.setCommand("select * from employees");
		wrs.execute(con);
		FileReader fr = new FileReader("emp.xml"); // New Data Will be added from emp.xml file
		wrs.readXml(fr);
		wrs.moveToCurrentRow();
		wrs.acceptChanges();
		
		
		System.out.println("Emp Data Inserted Successfully");
		fr.close();
		con.close();

	}

}
