package jdbc;
import java.sql.*;
import java.io.*;

public class ClobInsertDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String fpath = "C:/Users/siddhesh.kamale/Downloads/pune.txt";
		
		File f = new File(fpath);		
		System.out.println("File Length : "+ f.length());
		
		FileReader fr = new FileReader(f); // For CLOB datatype, we use FileReader Object instead of FileInputStream
		String name =  "Pune";
		
		String sqlQuery =  "insert into city values(?,?)";
		
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setString(1,name);
		ps.setCharacterStream(2,fr); // We use characterStream for CLOB 
		
		System.out.println("inserting text file from : "+ f.getAbsolutePath());
		
		int updateCount = ps.executeUpdate();
		
		if(updateCount !=0) {
			System.out.println("Record Inserted");
		}
		else {
			System.out.println("Record Not Inserted");
		}
		con.close();
	}
}
