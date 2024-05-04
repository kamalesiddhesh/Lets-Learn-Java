package jdbc;
import java.sql.*;

public class DatabaseMetaDataDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		DatabaseMetaData dbmd =  con.getMetaData();
		
		System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
		System.out.println("Database Product Version: "+ dbmd.getDatabaseProductVersion());
		System.out.println("Database Major Version: "+ dbmd.getDatabaseMajorVersion());
		System.out.println("Database Minor Version: "+ dbmd.getDatabaseMinorVersion());
		
		System.out.println("JDBC Major Version: "+ dbmd.getJDBCMajorVersion());
		System.out.println("JDBC Minor Version: "+ dbmd.getJDBCMinorVersion());
		
		System.out.println("Driver Name: "+ dbmd.getDriverName());
		System.out.println("Driver Version: "+ dbmd.getDriverVersion());
		
		System.out.println("URL: "+ dbmd.getURL());
		System.out.println("User Name: "+ dbmd.getUserName());
		
		System.out.println("Max Column In Table : "+ dbmd.getMaxColumnsInTable());
		System.out.println("Max Row Size: "+dbmd.getMaxRowSize());
		System.out.println("Max Statement Length: "+ dbmd.getMaxStatementLength());
		System.out.println("Max Tables In Select: "+ dbmd.getMaxTablesInSelect());
		System.out.println("Max Table Name In Length: "+dbmd.getMaxTableNameLength());
		System.out.println();
		
		System.out.println("SQL Keywords: "+ dbmd.getSQLKeywords());
		System.out.println("Numeric Functions: "+ dbmd.getNumericFunctions());
		
		System.out.println("String Functions: "+ dbmd.getStringFunctions());
		System.out.println("System Functions: "+ dbmd.getSystemFunctions());
		
		System.out.println("Supports Full-Outer Joins: "+ dbmd.supportsFullOuterJoins());
		System.out.println("Supports Stored Procedure: "+ dbmd.supportsStoredProcedures());
		
		

	}

}
