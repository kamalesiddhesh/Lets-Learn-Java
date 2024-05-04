package jdbc;

import java.util.*;
import java.sql.*;

public class SelectRangeOfRecordsDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter City Name: ");
		String addr = sc.next();
		
		String sqlQuery = String.format("select * from employees where eaddress = '%s'",addr);
		
		ResultSet rs = st.executeQuery(sqlQuery);
		boolean flag =false;
		
		while(rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
							   rs.getInt(3)+"\t"+rs.getString(4));
		}
		
		if(flag = false) {
			System.out.println("No Matched Records Found");
		}
		con.close();

	}

}
