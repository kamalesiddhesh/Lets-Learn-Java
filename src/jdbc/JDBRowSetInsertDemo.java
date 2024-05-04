package jdbc;
import java.util.*;
import javax.sql.rowset.*;

public class JDBRowSetInsertDemo {

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
		rs.setCommand("select * from students");
		rs.execute();
		
		Scanner sc = new Scanner(System.in);
		rs.moveToInsertRow(); // IMP
		
		while(true) {
			System.out.println("Student Number: ");
			int no = sc.nextInt();
			
			System.out.println("Student Name: ");
			String name = sc.next();
			
			rs.updateInt(1,no);
			rs.updateString(2,name);
			
			rs.insertRow();// inserting row to rowset and database
			System.out.println("Student Record Inserted Successfully");
			System.out.println("Do you want to insert one more Student [Yes/No]: ");
			String option = sc.next();
			if(option.equalsIgnoreCase("No")){
				break;
			}
		}
		rs.close();
	}

}
