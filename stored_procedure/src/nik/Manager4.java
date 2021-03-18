package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager4
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
		sb.append("create or replace procedure p2 ");
		sb.append("as begin ");
		sb.append("insert into emp values(6,'raja',33,8989); ");
		sb.append("update emp set name='kunni' where sno=2; ");
		sb.append("delete from emp where sno=3; ");
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
