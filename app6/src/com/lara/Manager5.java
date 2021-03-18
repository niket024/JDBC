package com.lara;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager5
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			con=Manager3.getConnection();
			stmt=con.createStatement();
			String sql="select * from hassan";
			rs=stmt.executeQuery(sql);
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"");
				System.out.println(rs.getString(2)+"");
				System.out.println("----------------------");
			}
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
