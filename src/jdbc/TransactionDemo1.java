package jdbc;
import java.sql.*;
import java.util.*;

public class TransactionDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from accounts");
		System.out.println("Data Before Transaction");
		System.out.println("------------------------");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"....."+rs.getInt(2));
		}
		
		System.out.println("Transaction Begins..........");
		con.setAutoCommit(false);
		st.executeUpdate("update accounts set balance = balance-10000 where name = 'durga'");
		st.executeUpdate("update accounts set balance = balance+10000 where name = 'sunny'");
		System.out.println("Can you please confirm this transaction of 10000 ...[Yes/No]:");
		Scanner sc = new Scanner(System.in);
		String option = sc.next();
		if(option.equalsIgnoreCase("yes")) {
			con.commit();
			System.out.println("Transaction commited");
		}
		else {
			con.rollback();
			System.out.println("Transaction rollbacked");
		}
		System.out.println("Data After Transaction");
		System.out.println("------------------------");
		ResultSet rs1 = st.executeQuery("select * from accounts");
		while(rs1.next()) {
			System.out.println(rs1.getString(1)+"....."+rs1.getInt(2));
		}
		con.close();
		
	}

}
