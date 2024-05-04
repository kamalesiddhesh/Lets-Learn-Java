package jdbc;
import java.sql.*;
import java.io.*;

public class RetrieveBLOBDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		PreparedStatement ps = con.prepareStatement("select * from celebrity where name = 'Brad'");
		ResultSet rs = ps.executeQuery();
		
		FileOutputStream os = new FileOutputStream("Brad_fromDB.jpg");
		if(rs.next()) {
			String name = rs.getString(1);
			InputStream is = rs.getBinaryStream(2);
			byte[] buffer = new byte[2048];
			
			while(is.read(buffer)>0) {
				os.write(buffer);
			}
			os.flush();
			System.out.println("image is available in : Brad_fromDB.jpg");
		}
		con.close();
	}

}
