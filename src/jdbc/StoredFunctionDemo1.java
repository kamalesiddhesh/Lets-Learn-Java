package jdbc;
import java.sql.*;

/*
------------ Stored SQL FUNCTION-----------------------

DELIMITER //
Drop FUNCTION IF EXISTS getAvgSalOfTwo;
CREATE FUNCTION getAvgSalOfTwo(
	id1 INT,
	id2 INT
)
RETURNS DECIMAL(10,2)	
DETERMINISTIC
BEGIN
	DECLARE result DECIMAL(10,2);
	DECLARE sal1 INT;
	DECLARE sal2 INT;
	
	SELECT esal into sal1 from employees where eno=id1;
	SELECT esal into sal2 from employees where eno=id2;
	
	SET result = (sal1 + sal2)/2;
	
	RETURN result;
END //

------ Call Stored FUNCTION------------

SELECT getAvgSalOfTwo(100,200) from employees;

SELECTgetAvgSalOfTwo(100,200);
 
 
 */

public class StoredFunctionDemo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		CallableStatement cst = con.prepareCall("{? = call getAvgSalOfTwo(?,?)}");
		
		int eno1 = 100;
		int eno2 = 600;
		
		cst.setInt(2,eno1);
		cst.setInt(3,eno2);
		
		cst.registerOutParameter(1,Types.DECIMAL);
		cst.execute();
		System.out.println("Result is :" + cst.getDouble(1));
		con.close();
		

	}

}
