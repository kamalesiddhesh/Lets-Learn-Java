package jdbc;
import java.util.*;
import java.sql.*;

public class DeleteMultipleRowsDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Cut-Off Salary : ");
		int cutOff = sc.nextInt();
		
		String sqlQuery = String.format("Delete from employees where esal >= %d",cutOff);
		
		int count =  st.executeUpdate(sqlQuery);
		System.out.println("No. of Rows Deleted: "+ count);
		con.close();		
	}

}
