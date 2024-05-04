package jdbc;
import java.sql.*;

public class TransactionIsolationDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println(con.getTransactionIsolation());
		
//		con.setTransactionIsolation(1);
//		System.out.println(con.getTransactionIsolation());
		
		con.close();
	}

}
