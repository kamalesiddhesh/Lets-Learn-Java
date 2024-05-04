package jdbc;
import java.util.*;
import java.sql.*;

public class SQLInjectionWithPreparedStatement {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String sqlQuery = "select count(*) from users where uname=? and upwd=?";
		
		PreparedStatement ps = con.prepareStatement(sqlQuery);	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name: ");
		String uname = sc.next();
		
		System.out.println("Enter password: ");
		String upwd = sc.next();
		
		ps.setString(1,uname);
		ps.setString(2,upwd);
		
		ResultSet rs = ps.executeQuery();
		int c = 0;
		
		if(rs.next()) {
			c = rs.getInt(1);
//			System.out.println(c);
		}
		
		if(c == 0) {
			System.out.println("Invalid Credentials");
		}
		else {
			System.out.println("Valid Credentials");
		}
		con.close();
	}

}
