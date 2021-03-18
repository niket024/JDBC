package com.nik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Util
{
	
  static 
  {
	  try
	  {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  }
	  catch(ClassNotFoundException ex)
	  {
		  ex.printStackTrace();
	  }
  }
  public static Connection getConnection() throws Exception
  {
	  Connection con=null;
	 
		   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","great123");
		  
	 
	  return con;
			  
  }
  public static void closeAll(ResultSet rs,Statement stmt,Connection con)
  {
	  try
		{
			if(rs!=null)
			{
				rs.close();
				rs=null;
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		try
		{
			if(stmt!=null)
			{
				stmt.close();
				stmt=null;
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
				con=null;
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
  }
}
