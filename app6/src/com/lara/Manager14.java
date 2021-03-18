package com.lara;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager14
{
 public static void main(String[] args)
{
 Connection con=null;
	PreparedStatement pstmt=null;
	try
		
	{
		con=Manager3.getConnection();
		pstmt=con.prepareStatement("update tab3 set name=? where sno=?");
		pstmt.setString(1, "abc");
		pstmt.setInt(2, 201);
		pstmt.executeUpdate();
		pstmt.setString(1, "xyz");
		pstmt.setInt(2, 801);
		pstmt.executeUpdate();
		System.out.println("done");
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

