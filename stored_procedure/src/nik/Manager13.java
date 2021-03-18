package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager13
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
			sb.append("CREATE OR REPLACE PROCEDURE P6(ARG1 OUT VARCHAR) ");
			sb.append("AS ");
			sb.append("BEGIN ");
			sb.append("SELECT NAME INTO ARG1 FROM EMP WHERE SNO=111; ");			
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
