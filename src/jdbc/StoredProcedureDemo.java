package jdbc;
import java.util.*;
import java.sql.*;

public class StoredProcedureDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		CallableStatement cst = con.prepareCall("{call addProc(?,?,?)}");
		cst.setInt(1,100);
		cst.setInt(2,200);
		cst.registerOutParameter(3,Types.INTEGER);
		cst.execute();		
		System.out.println("Result : "+cst.getInt(3));
		con.close();
	}
}
