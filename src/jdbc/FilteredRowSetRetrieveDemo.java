package jdbc;
import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;

class EmployeeSalaryFilter implements Predicate{
	int low;
	int high;
	
	public EmployeeSalaryFilter(int low,int high) {
		this.low = low;
		this.high = high;		
	}
	//this method will be called at the time of row insertion
	public boolean evaluate(Object value,String columnName) throws SQLException{
		return false;
	}
	
	//this method will be called at the time of row insertion
	public boolean evaluate(Object value, int columnIndex) throws SQLException{
		return false;
	}
	
	public boolean evaluate(RowSet rs) {
		boolean eval = false;
		try {
			FilteredRowSet frs = (FilteredRowSet)rs;
			int esal = frs.getInt(3);
			
			if((esal<=low) && (esal<=high)) {
				eval = true;
			}
			else {
				eval = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		return eval;
	}

	
}

public class FilteredRowSetRetrieveDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		RowSetFactory rsf = RowSetProvider.newFactory();
		FilteredRowSet rs = rsf.createFilteredRowSet();
		
		rs.setUrl(url);
		rs.setUsername(user);
		rs.setPassword(pass);
		
		rs.setCommand("select * from employees");
		rs.execute();
		System.out.println("Data Before Filtering");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		
		EmployeeSalaryFilter f = new EmployeeSalaryFilter(4500,8000);
		rs.setFilter(f);
		rs.beforeFirst();
		System.out.println();
		System.out.println("Data After Filtering");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		rs.close();
	}

}
