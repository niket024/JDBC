package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager18
{
public static void main(String[] args)
{
	Connection con=null;
	Statement stmt=null;
	try
	{
		con=DbUtil.getConnection();
		stmt=con.createStatement();
		String s1="CREATE OR REPLACE PROCEDURE P8(ARG1 INT,"+"ARG2 IN OUT INT)"+"AS BEGIN"+"UPDATE EMP SET SALARY=SALARY+ARG2 WHERE SNO=ARG1;"+"SELECT SALARY INTO ARG2 FROM EMP WHERE SNO ARG1;"+ "END;";
		stmt.execute(s1);
		System.out.println("done");
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
		
	}
	finally
		{
			DbUtil.closeAll(null, stmt, con);
		}
}
}
