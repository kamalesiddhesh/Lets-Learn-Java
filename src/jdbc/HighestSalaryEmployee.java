package jdbc;
import java.sql.*;

public class HighestSalaryEmployee {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String sqlQuery = "select * from employees where esal in "
				+ "(select max(esal) from employees)";
		
		ResultSet rs = st.executeQuery(sqlQuery);
		System.out.println("Highest Salaried Employee Information");
		System.out.println("-------------------------------------");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
							   rs.getInt(3)+"\t"+rs.getString(4));
		}
		con.close();

	}

}
