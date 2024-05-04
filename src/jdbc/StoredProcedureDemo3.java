package jdbc;
import java.sql.*;

public class StoredProcedureDemo3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		CallableStatement cst = con.prepareCall("{call getEmpInfo(?,?,?)}");
		
		int eno = 100;
		cst.setInt(1,eno);
		cst.registerOutParameter(2,Types.VARCHAR);
		cst.registerOutParameter(3,Types.INTEGER);
		
		cst.execute();
		String name = cst.getString(2);
		int sal = cst.getInt(3);
		
		System.out.println("-----Employee Info-----");
		System.out.println("name: "+name);
		System.out.println("salary: "+sal);
		con.close();
	}

}
