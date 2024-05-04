package jdbc;
import javax.sql.*;
import javax.sql.rowset.*;

class RowSetListenerImpl implements RowSetListener{

	@Override
	public void rowSetChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("RowSetChanged");		
	}

	@Override
	public void rowChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("RowChanged");		
	}

	@Override
	public void cursorMoved(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("CursorMoved");		
	}	
}

public class RowSetListenerDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet rs = rsf.createJdbcRowSet();
		
		rs.setUrl(url);
		rs.setUsername(user);
		rs.setPassword(pass);
		rs.setCommand("select * from employees");
		
		rs.addRowSetListener(new RowSetListenerImpl());
		rs.execute(); // RowSetChanged
		
		rs.moveToInsertRow();
		rs.updateInt(1,900);
		rs.updateString(2,"Rakul");
		rs.updateInt(3,9000);
		rs.updateString(4,"Shimla");
		rs.insertRow();//RowChanged
		
		
		System.out.println("Data Before Inserting");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			//CursorMoved
		}
		
		
		
				
		rs.close();
	}
}
