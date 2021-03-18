package com.lara;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager11
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			con=Manager3.getConnection();
			pstmt=con.prepareStatement("insert into hassan values(?,?)");//generics
			pstmt.setInt(1, 701);
			pstmt.setString(2,"hello");
			pstmt.executeUpdate();
			System.out.println("-------");
			pstmt.setInt(1, 702);
			pstmt.setString(2,"ram");
			pstmt.executeUpdate();
			System.out.println("-------");
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
