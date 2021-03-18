package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager6
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
		sb.append("create or replace procedure p3 ");
		sb.append("as begin ");
		sb.append("insert into tab3 values(12,'hhh'); ");
		sb.append("update emp set sno=66 where name='raja'; ");
		sb.append("delete from employee; ");
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
