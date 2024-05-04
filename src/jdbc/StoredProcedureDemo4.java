package jdbc;
import java.sql.*;

public class StoredProcedureDemo4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
        CallableStatement cst = con.prepareCall("{CALL create_temp_table(?)}");
        cst.registerOutParameter(1,Types.VARCHAR);
        
        cst.execute();
        
        String table_name = cst.getString(1);
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from " + table_name);
        
        
        while (rs.next()) {
            int empId = rs.getInt(1);
            String empName = rs.getString(2);
            int esal = rs.getInt(3);
            String eaddr = rs.getString(4);
            System.out.println("Employee ID: " + empId + ", Name: " + empName
            			+" Salary: "+esal+" City: "+ eaddr);
            }
        con.close();

	}

}
