package jdbc;
import java.sql.*;

public class ResultSetHoldabilityDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		DatabaseMetaData dbmd = con.getMetaData();
		
		if(dbmd.supportsResultSetHoldability(1))
			System.out.println("HOLD_CURSOR_OVER_COMMIT");
		
		if(dbmd.supportsResultSetHoldability(2))
			System.out.println("CLOSE_CURSORS_AT_COMMIT");
		
		con.close();

	}

}
