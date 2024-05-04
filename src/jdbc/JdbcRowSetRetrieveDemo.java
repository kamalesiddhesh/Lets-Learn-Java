package jdbc;
import javax.sql.rowset.*;

public class JdbcRowSetRetrieveDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet rs = rsf.createJdbcRowSet();
		rs.setUrl(url);
		rs.setUsername(user);
		rs.setPassword(pass);
		rs.setCommand("select * from employees");
		rs.execute();

		System.out.println("Employee Details in Forward Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		System.out.println();
		System.out.println("Employee Details in Backward Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		System.out.println();
		
		System.out.println("Accessing Randomly...........");
		System.out.println();
		
		rs.absolute(3);	
		System.out.println(rs.getRow()+"---->"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		
		System.out.println();
		
		rs.first();	
		System.out.println(rs.getRow()+"---->"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		System.out.println();
		
		rs.last();	
		System.out.println(rs.getRow()+"---->"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		System.out.println();
		rs.close();
	}

}
