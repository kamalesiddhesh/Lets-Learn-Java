package jdbc;
import java.sql.*;

public class RowIdLifetimeDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		DatabaseMetaData dbmd  = con.getMetaData();
		System.out.println(dbmd.getRowIdLifetime());
		con.close();
	}

}
