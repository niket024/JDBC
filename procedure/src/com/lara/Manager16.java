package com.lara;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager16
{
	public static void main(String[] args)
	{
	 Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try
			
		{
			con=Manager3.getConnection();
			pstmt=con.prepareStatement("select * from tab3 where sno>?");
			pstmt.setInt(1, 100);
			rs=pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}
		catch(SQLException ex)
		{
		ex.printStackTrace();
		}
		finally
		{
			Manager3.closeAll(null, pstmt, con);
		}
				
			}
}
