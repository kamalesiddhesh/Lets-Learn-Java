package jdbc;
import java.sql.*;
import java.util.*;

public class DynamicInputDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		System.out.println("Enter Employee Number: ");
		int eno = sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		String ename = sc.next();
		
		System.out.println("Enter Employee Salary: ");
		int esal = sc.nextInt();
		
		System.out.println("Enter Employee Address: ");
		String eaddress = sc.next();
		
		System.out.println("Hello, your provided information is : ");
		System.out.println(eno + "\t" + ename +"\t"+ esal+"\t"+eaddress );
		
//		String sql_query = "insert into employees values"
//				+ "(" + eno+ ",'" +ename+"',"+esal+",'"+eaddress+"')";
		
		String sql_query = String.format("insert into employees values(%d,'%s',%d,'%s')",
				eno,ename,esal,eaddress);
		System.out.println(sql_query);
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st =  con.createStatement();
		
		int updateCount =  st.executeUpdate(sql_query);
		System.out.println("No. of Rows inserted : "+updateCount);
		con.close();			
	}

}
