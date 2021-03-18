package com.lara;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager10
{
public static void main(String[] args)
{
	Connection con=null;
	PreparedStatement pstmt=null;
	try
	{
		con=Manager3.getConnection();
	String s1=	"insert into tab3 values(501,'abc')";
		pstmt=con.prepareStatement(s1);
		pstmt.executeUpdate();
		System.out.println("----");
		pstmt.executeUpdate();
		System.out.println("----");
		pstmt.executeUpdate();
		System.out.println("----");
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
