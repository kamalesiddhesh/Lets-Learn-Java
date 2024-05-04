package jdbc;
import java.sql.*;
public class ResultSetTypesDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		Statement st = con.createStatement
				(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("Select * from employees");
		
		System.out.println("Records in Forward Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		System.out.println();
		System.out.println("Records in Backward Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}

	}

}
