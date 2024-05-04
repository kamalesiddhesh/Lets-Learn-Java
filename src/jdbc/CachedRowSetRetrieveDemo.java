package jdbc;
import javax.sql.rowset.*;

public class CachedRowSetRetrieveDemo {

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
		
		System.out.println("Data in forward Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		
		while(crs.next()) {
			System.out.println(crs.getInt(1)+"\t"+crs.getString(2)+"\t"+crs.getInt(3)+"\t"+crs.getString(4));
		}
		System.out.println();
		System.out.println("Data in backward Direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		while(crs.previous()) {
			System.out.println(crs.getInt(1)+"\t"+crs.getString(2)+"\t"+crs.getInt(3)+"\t"+crs.getString(4));
		}
		
	}

}
