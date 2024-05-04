package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateSingleRowDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		String sql_query = "update employees set esal = 5555 where ename='Carlo'";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st =  con.createStatement();
		
		int updateCount = st.executeUpdate(sql_query);
		System.out.println("The number of rows updated : "+ updateCount);
		
	}

}
