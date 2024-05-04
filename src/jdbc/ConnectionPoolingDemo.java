package jdbc;
import java.sql.*;
import javax.sql.*;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;


public class ConnectionPoolingDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.MysqlConnectionPoolDataSource ds = new com.mysql.cj.jdbc.MysqlConnectionPoolDataSource();
		
		ds.setURL("jdbc:mysql://localhost:3306/my");
		ds.setUser("root");
		ds.setPassword("password");
		
		Connection con = ds.getConnection();
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from employees");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
		                       rs.getInt(3)+"\t"+rs.getString(4));
		}
		con.close();
	}
}
