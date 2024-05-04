package jdbc;
import java.sql.*;
import javax.sql.rowset.*;
import java.io.*;

public class JoinRowSetRetrieveDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		RowSetFactory rsf = RowSetProvider.newFactory();
		
		CachedRowSet rs1 = rsf.createCachedRowSet();
		rs1.setCommand("select * from students");
		rs1.execute(con);
		
		CachedRowSet rs2 = rsf.createCachedRowSet();
		rs2.setCommand("select * from courses");
		rs2.execute(con);
		
		JoinRowSet rs = rsf.createJoinRowSet();
		rs.addRowSet(rs1,4);
		rs.addRowSet(rs2,1);
		
		
		  System.out.println("SID\tSNAME\tSADDR\tCID\tCNAME\tCCOST");
		  System.out.println("-------------------------------------");
		 
//		rs.moveToCurrentRow();
		
		
		  while(rs.next()) { System.out.print(rs.getInt(1)+"\t");
		  System.out.print(rs.getString(2)+"\t");
		  System.out.print(rs.getString(3)+"\t");
		  System.out.print(rs.getString(4)+"\t");
		  System.out.print(rs.getString(5)+"\t"); System.out.print(rs.getInt(6)+"\n");
		  }
		 
		
		/*
		 * FileWriter fw = new FileWriter("studentsInfo.xml"); rs.writeXml(fw);;
		 * System.out.println("Employee Data Transfered to studentsInfo.xml file");
		 * fw.close();
		 */
		
		con.close();
	}

}
