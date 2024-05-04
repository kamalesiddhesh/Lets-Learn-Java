package jdbc;
import java.sql.*;
import java.io.*;

/*
	desc celebrity;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| name  | varchar(20) | YES  |     | NULL    |       |
| image | longblob    | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
 */

public class BLOBInsertDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		String fpath = "C:/Users/siddhesh.kamale/Downloads/robert.jpg";
		File f = new File(fpath);
		String name = "Robert";
		System.out.println("File Length : "+ f.length());
		
		FileInputStream fis = new FileInputStream(f);
//		BufferedInputStream bis = new BufferedInputStream(fis);
		
		String sqlQuery =  "insert into celebrity values(?,?)";
		
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		ps.setString(1,name);
		ps.setBinaryStream(2,fis,fis.available()); // We use binaryStream for BLOB 
				
		System.out.println("inserting image from : "+ f.getAbsolutePath());
		
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
