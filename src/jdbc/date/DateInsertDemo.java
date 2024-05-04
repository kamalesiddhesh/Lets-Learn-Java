package jdbc.date;
import java.sql.*;
import java.util.*;
import java.text.*;

public class DateInsertDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Person Name : ");
		String pname = sc.next();
		
		System.out.println("Enter DOP(dd-MM-yyyy): ");		
		String dop = sc.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate = sdf.parse(dop);
		System.out.println("util date : "+udate);
		
		long l = udate.getTime();
		System.out.println(l);
		java.sql.Date sdate = new java.sql.Date(l);
		
		String sqlQuery = "insert into people values(?,?)";
		PreparedStatement pt = con.prepareStatement(sqlQuery);
		
		pt.setString(1,pname);
		pt.setDate(2,sdate);
		
		int rc = pt.executeUpdate();
		if(rc==0)
			System.out.println("Record Not Inserted");
		else 
			System.out.println("Record Inserted Successfully");
		
		con.close();
	}
}
