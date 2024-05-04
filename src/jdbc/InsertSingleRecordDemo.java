package jdbc;

import java.sql.*;

public class InsertSingleRecordDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		String sql_query = "insert into employees values(300,'Radhika',6000,'Chennai')";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st =  con.createStatement();
		
		int updateCount =  st.executeUpdate(sql_query);
		System.out.println("No. of Rows inserted : "+updateCount);
		con.close();		
	}
}
