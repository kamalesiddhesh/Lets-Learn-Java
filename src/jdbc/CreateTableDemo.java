package jdbc;
import java.sql.*;

public class CreateTableDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		String sql_query = "create table employees"
				+ "(eno INT(3),ename varchar(10),esal INT(8),eaddress varchar(20))";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st =  con.createStatement();	
		
		st.executeUpdate(sql_query);
		
		System.out.println("Table Created Successfully");
		con.close();
	}

}
