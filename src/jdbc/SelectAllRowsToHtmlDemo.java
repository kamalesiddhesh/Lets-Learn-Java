package jdbc;
import java.sql.*;
import java.io.*;

public class SelectAllRowsToHtmlDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		
		String sqlQuery = "Select * from employees";
		ResultSet rs = st.executeQuery(sqlQuery);
		
		String data = "";
		data = data + "<html<body bgcolor='red' text='white'><center><table border='2'>" ;
		
		data = data + "<tr><td>ENO</td><td>ENAME</td><td>ESAL</td><td>EADDR</td><tr>";
		
		while(rs.next()) {
			data = data + "<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+
					"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td></tr>";
		}
		data = data + "</table></center></body></html>";
		
		FileOutputStream fos = new FileOutputStream("C:/Users/siddhesh.kamale/Downloads/emp.html");
		byte[] b = data.getBytes();
		
		fos.write(b);
		fos.flush();
		System.out.println("Open emp.html to get Employees data");
		fos.close();
		con.close();
	}

}
