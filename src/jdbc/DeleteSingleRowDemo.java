package jdbc;
import java.util.*;
import java.sql.*;

public class DeleteSingleRowDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String sqlQuery =  "delete from employees where ename = 'Amy'";
		
		int count = st.executeUpdate(sqlQuery);
		System.out.println("No of Rows Deleted: "+ count);
	}

}
