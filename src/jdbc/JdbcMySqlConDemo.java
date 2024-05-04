package jdbc;
import java.sql.*;

public class JdbcMySqlConDemo {
	
	String url = "jdbc:mysql://localhost:3306/my";
	String user = "root";
	String password = "password";
		
	
	public void showAllResults(String selectQuery) throws Exception{
		JdbcMySqlConDemo jObj = new JdbcMySqlConDemo();
		Connection con = DriverManager.getConnection(jObj.url,jObj.user,jObj.password);
		Statement st = con.createStatement();	
		ResultSet rs = st.executeQuery(selectQuery);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+"..."+
							   rs.getString(3)+"..."+rs.getString(4));			
		}
		con.close();
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.jdbc.Driver");
		JdbcMySqlConDemo jObj = new JdbcMySqlConDemo();
		
		Connection con = DriverManager.getConnection(jObj.url,jObj.user,jObj.password);
		Statement st1 = con.createStatement();
		
		jObj.showAllResults("select * from movies ");
//		System.out.println();
//		System.out.println(".......Updating records.......");
//		int rowsCount = st1.executeUpdate("update movies set hero = 'JR NTR' where mno = 4");
//		System.out.println("No of rows affected: " + rowsCount);
//		System.out.println();
//		
//		jObj.showAllResults("select * from movies ");
		con.close();
	}

}
