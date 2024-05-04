package jdbc;
import java.util.*;
import java.sql.*;

public class NTHHighestSalaryEmpDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		
		String sqlQuery = "select * from (select eno,ename,esal,eaddress,rank() "
				+ "over (order by esal DESC) my_rank from employees) as t where my_rank=" +n;
		
		ResultSet rs =  st.executeQuery(sqlQuery);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
							   rs.getInt(3)+"\t"+rs.getString(4));
		}
		con.close();
	}

}
