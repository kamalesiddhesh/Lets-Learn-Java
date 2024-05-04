package jdbc.date;
import java.sql.*;
import java.util.*;
import java.text.*;

public class DateRetriveDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		String sqlQuery = "select * from people";
		PreparedStatement pt = con.prepareStatement(sqlQuery);
		
		ResultSet rs = pt.executeQuery();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		while(rs.next()) {
			String name = rs.getString(1);
			java.sql.Date sdate = rs.getDate(2);
			String s = sdf.format(sdate);
			System.out.println(name +"....."+ s);
		}
		con.close();

	}

}
