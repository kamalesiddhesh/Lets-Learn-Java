package jdbc;
import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcPropertiesDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties p =  new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		
		p.load(fis);// To load all properties from db.properties file into java properties Object...
		
		String url =  p.getProperty("url");
		String user = p.getProperty("user");
		String pass = p.getProperty("pass");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employees");
		
		System.out.println("ENO\tENAME\tESAL\tEADDRESS");
		System.out.println("---------------------------");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"
								+rs.getInt(3)+"\t"+rs.getString(4));
		}
		con.close();
	}
}
