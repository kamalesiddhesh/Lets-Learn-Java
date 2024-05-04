package jdbc;
import java.sql.*;

public class DatabaseMetaDataDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int count = 0;
		
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		DatabaseMetaData dbmd = con.getMetaData();
		String catalog = null;
		String schemaPattern = null;
		String tableNamePattern = null;
		String[] types = null;
		
		ResultSet rs = dbmd.getTables(catalog,schemaPattern,tableNamePattern,types);
		
		//Pattern can help limit the number of tables that are returned in the reultset
		
		//The ResultSet contains 10 columns and 3rd column represent table names.
		
		while(rs.next()) {
			count++;
			System.out.println(rs.getString(3));
		}
		System.out.println("The number of Tables : "+count);
		con.close();		
	}
}
