package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager8
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
			sb.append("create or replace procedure p4(arg1 int,arg2 varchar,arg3 int,arg4 int) ");
			sb.append("as begin ");
			sb.append("insert into tab3 values(arg1,arg2); ");
			sb.append("insert into emp values(arg1,arg2,arg3,arg4); ");
			sb.append("end; ");
			stmt.execute(sb.toString());
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
