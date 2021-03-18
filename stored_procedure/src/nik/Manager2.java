package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager2
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
			sb.append("create or replace procedure p1 ");
			sb.append("as begin ");
			sb.append("insert into emp values(1,'ram',22,80000); ");
			sb.append("insert into emp values(2,'rani',24,40000); ");
			sb.append("insert into emp values(3,'sita',26,50000); ");
			sb.append("insert into emp values(4,'janki',42,70000); ");
			sb.append("insert into emp values(5,'gauri',52,880000); ");
			sb.append("end; ");
			stmt.execute(sb.toString());
			System.out.println(sb);
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
