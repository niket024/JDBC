package nik;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager11
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
			sb.append("create or replace procedure p5(sno int,name varchar) as begin ");
			//sb.append("as begin ");
			sb.append("insert into tab3 values(sno,name); ");
			sb.append("insert into emp values(sno,name,44,66666); ");
			sb.append("end; ");
			stmt.execute(sb.toString());
			System.out.println("done");
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			
		}
		finally{
			{
				DbUtil.closeAll(null, stmt, con);
			}
		}
	}
}
