package jdbc;
import java.util.*;
import java.sql.*;

public class UpdateMultipleRows {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Increment Amount : ");
		int increment = sc.nextInt();
		
		System.out.println("Enter Salary Range : ");
		int salRange = sc.nextInt();
		
		String sqlQuery =  String.format("update employees set esal = esal + %d where esal<%d",increment,salRange);
		
		int updateCount = st.executeUpdate(sqlQuery);
		System.out.println("The no. of rows updated: "+updateCount);
		con.close();
	}

}
