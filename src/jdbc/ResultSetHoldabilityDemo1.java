package jdbc;
import java.sql.*;

public class ResultSetHoldabilityDemo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		Statement st = con.createStatement();
		System.out.println(st.getResultSetHoldability());
		con.close();
	}

}
