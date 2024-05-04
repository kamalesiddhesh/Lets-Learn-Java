package jdbc;
import java.sql.*;
import java.util.*;

public class BatchUpdateDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String sqlQuery = "insert into employees values (?,?,?,?)";
		
		PreparedStatement pt = con.prepareStatement(sqlQuery);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Employee Number: ");
			int eno = sc.nextInt();
			
			System.out.println("Enter Employee Name: ");
			String ename = sc.next();
			
			System.out.println("Enter Employee Salary: ");
			int esal = sc.nextInt();
			
			System.out.println("Enter Employee City: ");
			String eaddress = sc.next();
			
			pt.setInt(1,eno);
			pt.setString(2,ename);
			pt.setInt(3,esal);
			pt.setString(4,eaddress);
			pt.addBatch();
			
			System.out.println("Do You Want to Enter another Record [Yes/No] :");
			String option = sc.next();
			
			if(option.equalsIgnoreCase("No")) {
				break;
			}
		}
		pt.executeBatch();
		System.out.println("Records inserted Successfully...");
		con.close();
	}
}
