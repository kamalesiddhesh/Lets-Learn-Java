package jdbc;
import java.util.*;
import javax.sql.rowset.*;

public class CachedRowSetInsertDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs = rsf.createCachedRowSet();
		crs.setUrl(url);
		crs.setUsername(user);
		crs.setPassword(pass);
		crs.setCommand("select * from employees");
		crs.execute();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Employee Number: ");
			int eno = sc.nextInt();
			
			System.out.println("Employee Name: ");
			String ename = sc.next();
			
			System.out.println("Employee Salary: ");
			int esal = sc.nextInt();
			
			System.out.println("Employee Address: ");
			String eaddr = sc.next();
			
			
			crs.moveToInsertRow();
			crs.updateInt(1,eno);
			crs.updateString(2,ename);
			crs.updateInt(3,esal);
			crs.updateString(4,eaddr);
			
			crs.insertRow();
			
			System.out.println("Employee inserted Successfully......");
			System.out.println("Do you want to insert one more Employee ? : [Yes/No]");
			String option = sc.next();
			if(option.equalsIgnoreCase("no")) {
				break;
			}
		}
		crs.moveToCurrentRow();
		crs.acceptChanges();
		crs.close();

	}

}
