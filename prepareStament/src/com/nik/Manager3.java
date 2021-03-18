package com.nik;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Manager3
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		
		 PreparedStatement pstmt =
		 con.prepareStatement("insert into nik101 values(?,?)");
		 pstmt.setInt(1, 56);
		 pstmt.setString(2, "kapil");

		pstmt.executeUpdate();
		DbUtil.closeAll(null, pstmt, con);
		System.out.println("done");
	}
}
