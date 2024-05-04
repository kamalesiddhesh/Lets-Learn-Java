package jdbc;
import java.sql.*;

public class PreparedStatementDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String sqlQuery = "delete from employees where ename = ?";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		
		pst.setString(1,"Sunny");
		int updateCount = pst.executeUpdate();
		System.out.println("The number of rows deleted: "+ updateCount);
		
		System.out.println("Reusing prepared statement to delete one more record...");
		pst.setString(1,"durga");
		int updateCount1 = pst.executeUpdate();
		System.out.println("The number of rows deleted: "+ updateCount1);
		
		con.close();
	}

}
