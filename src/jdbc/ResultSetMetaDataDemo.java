package jdbc;

import java.sql.*;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("Select * from employees");
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int count =  rsmd.getColumnCount();
		
		for(int i=1;i<=count;i++) {
			System.out.println("Column Number: "+ i);
			System.out.println("Column Name: "+rsmd.getColumnName(i));
			System.out.println("Column Type: "+ rsmd.getColumnType(i));
			System.out.println("Column size: "+ rsmd.getColumnDisplaySize(i));
			System.out.println("-----------------------------------------");
		}
		
		con.close();
	}

}
