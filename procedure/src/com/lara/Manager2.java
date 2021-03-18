package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager2
{
 public static void main(String[] args)
{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	catch(ClassNotFoundException ex)
	{
		ex.printStackTrace();
	}
	Connection con=null;
	Statement stmt=null;
	try
	{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","great123");
		stmt=con.createStatement();
		String s1="insert into tab3 values(1,'abc')";
		stmt.executeUpdate(s1);
		System.out.println("done");
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	finally
	{
		try
		{
			if(stmt!=null)
			{
				stmt.close();
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		try
		{
			if(con!=null)
			{
				con.close();
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
}
