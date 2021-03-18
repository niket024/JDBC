package nik;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Manager7
{
 public static void main(String[] args)
{
	Connection con=null;
	CallableStatement cstmt=null;
	try
	{
		con=DbUtil.getConnection();
		cstmt=con.prepareCall("{call p3}");
		cstmt.execute();
		System.out.println("done");
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	finally
	{
		DbUtil.closeAll(null, cstmt, con);
	}
}
}
