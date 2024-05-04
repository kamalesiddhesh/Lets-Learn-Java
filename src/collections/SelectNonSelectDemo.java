package collections;
import java.util.*;
import java.sql.*;

public class SelectNonSelectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Query: ");
		String sqlQuery = sc.nextLine();
		
		boolean b = st.execute(sqlQuery);
		
		if(b==true)// Select Sql Query
		{
			ResultSet rs = st.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
						rs.getInt(3)+"\t"+rs.getString(4));
			}
		}
		else // Non-Select Sql Query
		{
			int rowCount = st.getUpdateCount();
			System.out.println("The number of records effected is : "+ rowCount);
		}
		con.close();
	}

}
