package jdbc;

import java.sql.*;


public class RowCountDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String sqlQuery = "select count(*) from employees";
		
		ResultSet rs = st.executeQuery(sqlQuery);
		
		if(rs.next()) {
			System.out.println(rs.getInt(1));
		}
	}

}
