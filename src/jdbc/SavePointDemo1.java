package jdbc;
import java.sql.*;

public class SavePointDemo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		Statement st = con.createStatement();
		con.setAutoCommit(false);
		st.executeUpdate("insert into politicians values('kcr','trs')");
		st.executeUpdate("insert into politicians values('babu','jdp')");
		
		Savepoint sp = con.setSavepoint();
		st.executeUpdate("insert into politicians values('siddu','bjp')");
		
		System.out.println("oops.... wrong entry");
		con.rollback(sp);
		con.releaseSavepoint(sp);
		System.out.println("Operations are roll back from savepoint");
		con.commit();
		con.close();

	}

}
