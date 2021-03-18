package com.lara;

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
		con=Manager3.getConnection();
		stmt=con.createStatement();
		String s1="insert into tab3 values(2,'xyz')";
		String s2="insert into tab3 values(3,'hello')";
		stmt.execute(s1);
		stmt.execute(s1);
		stmt.execute(s1);
//		stmt.execute(s2);
		System.out.println("done");
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	finally
	{
		Manager3.closeAll(null, stmt, con);
	}
}
}
