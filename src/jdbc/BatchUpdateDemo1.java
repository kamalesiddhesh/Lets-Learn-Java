package jdbc;
import java.sql.*;

public class BatchUpdateDemo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		Statement st = con.createStatement();
//		st.addBatch("Select * from employees"); // Error - select query can't be executed in BatchUpdates
		st.addBatch("insert into employees values (700,'Vinny',6000,'Indore')");
		st.addBatch("update employees set esal = esal +777 where esal <=4000");
		st.addBatch("delete from employees where esal >=8000");
		
		int[] count = st.executeBatch();
		
		int updateCount =  0;
		
		for(int x:count) {
			updateCount = updateCount + x;
		}
		System.out.println("The number of rows updated: "+ updateCount);
		con.close();
	}
}
