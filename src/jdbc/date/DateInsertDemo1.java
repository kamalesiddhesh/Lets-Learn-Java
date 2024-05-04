package jdbc.date;
import java.sql.*;
import java.util.*;
import java.text.*;

public class DateInsertDemo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Person Name : ");
		String pname = sc.next();
		
		System.out.println("Enter DOP(yyyy-MM-dd): ");		
		String dop = sc.next();
		
		String sqlQuery = "insert into people values(?,?)";
		PreparedStatement pt = con.prepareStatement(sqlQuery);
		
		java.sql.Date sdate = java.sql.Date.valueOf(dop); // using valueOf() static method....
		
		pt.setString(1,pname);;
		pt.setDate(2,sdate);
		
		int rc = pt.executeUpdate();
		if(rc==0)
			System.out.println("Record Not Inserted");
		else 
			System.out.println("Record Inserted Successfully");
		
		con.close();

	}

}
