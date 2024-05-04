package jdbc;
import java.sql.*;

public class ResultSetTypeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		System.out.println(dbmd.supportsResultSetType(1003));
		System.out.println(dbmd.supportsResultSetType(1004));
		System.out.println(dbmd.supportsResultSetType(1005));
		System.out.println();
		
		System.out.println(dbmd.supportsResultSetConcurrency(1003,1007));
		System.out.println(dbmd.supportsResultSetConcurrency(1003,1008));
		System.out.println();
		
		System.out.println(dbmd.supportsResultSetConcurrency(1004,1007));
		System.out.println(dbmd.supportsResultSetConcurrency(1004,1008));
		System.out.println();
		
		System.out.println(dbmd.supportsResultSetConcurrency(1005,1007));
		System.out.println(dbmd.supportsResultSetConcurrency(1005,1008));
		
		

	}

}
