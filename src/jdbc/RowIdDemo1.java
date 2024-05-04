package jdbc;
import java.sql.*;

public class RowIdDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select rowid,eno,ename,esal,eaddr from employees");
		
		while(rs.next()) {
			RowId id =rs.getRowId(1);
			byte[] b = id.getBytes();
			String rowid = new String(b);
			
			System.out.println(rowid+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
		}
		con.close();
	}

}
