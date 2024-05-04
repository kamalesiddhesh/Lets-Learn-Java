package jdbc;
import java.util.*;
import java.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String sqlQuery = "insert into employees values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Employee Number:");
			int eno = sc.nextInt();
			
			System.out.println("Employee Name: ");
			String ename = sc.next();
			
			System.out.println("Employee Salary: ");
			int esal = sc.nextInt();
			
			System.out.println("Employee Address: ");
			String eaddr = sc.next();
			
			//Inserting values in Dynamic Query.....
			
			pst.setInt(1,eno);
			pst.setString(2,ename);
			pst.setInt(3,esal);
			pst.setString(4,eaddr);
			
			//Executing Dynamic SQL Query......
			pst.executeUpdate();
			
			System.out.println("Successfully Inserted Record...");
			System.out.println();
			System.out.println("Do you want to insert one more record[Yes/No]: ");
			String option = sc.next();
			if(option.equalsIgnoreCase("No")) {
				break;
			}
		}
		System.out.println("Program Ended......");
		con.close();
	}

}
