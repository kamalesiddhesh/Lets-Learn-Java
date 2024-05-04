package jdbc;

import java.sql.*;
import java.util.*;

public class SelectAllRowsDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String sqlQuery= "select * from employees";
		ResultSet rs = st.executeQuery(sqlQuery);
		boolean flag = false;
		
		System.out.println("ENO\tENAME\tESAL\tEADDRESS");
		System.out.println();	
		
		while(rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
								rs.getInt(3)+"\t"+rs.getString(4));
		}
	
		
		if(flag== false) {
			System.out.println("No Records found...");
		}
		con.close();	
	}
}
