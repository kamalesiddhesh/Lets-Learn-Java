package jdbc;

import java.sql.*;


public class SelectAllRowSortingDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String sqlQuery = "Select * from employees order by esal DESC";
		boolean flag = false;
		ResultSet rs = st.executeQuery(sqlQuery);
		
		System.out.println("ENO\tENAME\tESALARY\tEADDR");
		System.out.println();
		
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
