package jdbc;

import java.sql.*;
import java.util.*;

public class SelctParticularColumnsDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String sqlQuery = "select ename,eaddress from employees";
		
		boolean flag = false;
		ResultSet rs = st.executeQuery(sqlQuery);
		
		System.out.println("ENAME\tEADDR");
		System.out.println("------------------");
		
		while(rs.next()) {
			flag = true;
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		if(flag == false) {
			System.out.println("No Matched Records Found");
		}
		con.close();
	}

}
