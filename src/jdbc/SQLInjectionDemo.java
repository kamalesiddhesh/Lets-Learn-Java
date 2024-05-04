package jdbc;
import java.util.*;
import java.sql.*;

public class SQLInjectionDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name: ");
		String uname = sc.next();
		
		System.out.println("Enter password: ");
		String upwd = sc.next();
		
		String sqlQuery = "select count(*) from users where uname= '"
				+uname+"' and upwd='"+upwd+ "'";
		
//		String sqlQuery = String.format("select count(*) from users where uname='%s'"
//				+ "and upwd='%s'",uname,upwd);
		System.out.println(sqlQuery);
		
		ResultSet rs = st.executeQuery(sqlQuery);
		
		
		int c = 0;
		if(rs.next()) {
			c = rs.getInt(1);
			System.out.println(c);
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
