package com.lara;

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
			con=Manager3.getConnection();
			stmt=con.createStatement();
			String s1="insert into tab3 values(4,'raju')";
			String s2="insert into tab3 values(5,'kumar)";
			stmt.execute(s1);
			
			System.out.println("one query done");
			stmt.execute(s2);
			System.out.println("2nd query also done");
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
