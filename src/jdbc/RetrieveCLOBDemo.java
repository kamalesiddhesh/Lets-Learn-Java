package jdbc;

import java.sql.*;
import java.io.*;

public class RetrieveCLOBDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		String sqlQuery = "select * from city where name='Mumbai'";
		PreparedStatement pt = con.prepareStatement(sqlQuery);
		FileWriter fw = new FileWriter("History_of_Mumbai.txt");
		
		ResultSet rs = pt.executeQuery();
		if(rs.next()) {
			String name = rs.getString(1);
			Reader r = rs.getCharacterStream(2);
			char[] buffer =  new char[1024];
			while(r.read(buffer)>0) {
				fw.write(buffer);
			}
			fw.flush();
			System.out.println("File is available in  "+ "History_of_Mumbai.txt");
		}
		
		con.close();
	}

}
