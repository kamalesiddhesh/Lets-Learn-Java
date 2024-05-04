package jdbc;
import java.sql.*;

public class StoredProcedureDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		CallableStatement cst = con.prepareCall("{call getSal(?,?)}");
		
		cst.setInt(1,500);
		cst.registerOutParameter(2,Types.INTEGER);
		cst.execute();
		int salary = cst.getInt(2);
		System.out.println("The salary of employee is: "+salary);
	}

}
