package jdbc;
import javax.sql.rowset.*;

public class RowSetsCreationDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet jdbcrs = rsf.createJdbcRowSet();
		CachedRowSet crs = rsf.createCachedRowSet();
		WebRowSet wrs = rsf.createWebRowSet();
		JoinRowSet jnrs = rsf.createJoinRowSet();
		FilteredRowSet frs = rsf.createFilteredRowSet();
		
		System.out.println(rsf.getClass().getName());
		System.out.println(jdbcrs.getClass().getName());
		System.out.println(crs.getClass().getName());
		System.out.println(wrs.getClass().getName());
		System.out.println(jnrs.getClass().getName());
		System.out.println(frs.getClass().getName());

	}

}
