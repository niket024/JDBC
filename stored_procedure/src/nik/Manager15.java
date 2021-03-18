package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager15
{
	public static void main(String[] args)
	{
		Connection con=null;
	    Statement stmt=null;
		try
		{
			con=DbUtil.getConnection();
			stmt=con.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("CREATE OR REPLACE PROCEDURE P7(ARG1 OUT INT,ARG2 OUT VARCHAR,ARG3 OUT INT,ARG4 IN INT) ");
			sb.append("AS ");
			sb.append("BEGIN ");
			sb.append("SELECT AGE INTO ARG1 FROM EMP WHERE SNO=ARG4; ");			
			sb.append("SELECT NAME INTO ARG2 FROM EMP WHERE SNO=ARG4; ");			
			sb.append("SELECT SALARY INTO ARG3 FROM EMP WHERE SNO=ARG4; ");			
			sb.append("END; ");
			stmt.execute(sb.toString());
			System.out.println("done");
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			
		}
		finally{
			
				DbUtil.closeAll(null, stmt, con);
			
		}
	}
}
