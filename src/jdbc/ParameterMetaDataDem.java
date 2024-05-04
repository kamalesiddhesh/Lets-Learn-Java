package jdbc;
import java.sql.*;

public class ParameterMetaDataDem {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my?generateSimpleParameterMetadata=true";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		PreparedStatement pst = con.prepareStatement("insert into employees values (?,?,?,?)");
		ParameterMetaData pmd = pst.getParameterMetaData();
		int count = pmd.getParameterCount();
		
		for(int i=1;i<=count;i++) {
			System.out.println("Parameter Number: "+ i);
			System.out.println("Parameter Mode: "+pmd.getParameterMode(i));
			System.out.println("Parameter Type: "+pmd.getParameterType(i));
			System.out.println("Parameter Precision: "+pmd.getPrecision(i));
			System.out.println("Parameter Scale: "+pmd.getScale(i));
			System.out.println("Parameter isSigned: "+pmd.isSigned(i));
//			System.out.println("Parameter isNullable: "+pmd.isNullable(i));
		    System.out.println("--------------------------");
		}
		con.close();
	}

}
