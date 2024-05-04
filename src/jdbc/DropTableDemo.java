package jdbc;

import java.sql.*;

public class DropTableDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		String sql_query = "drop table employees";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table Deleted Successfully");
		con.close();
	}

}
