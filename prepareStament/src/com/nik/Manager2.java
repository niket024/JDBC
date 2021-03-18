package com.nik;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		//String sql = "insert into nik101 values(45,'gggg')";
		String sql = "update nik101 set name='sweta' where id=45";

		// PreparedStatement pstmt =
		// con.prepareStatement("insert into nik10 values(12,'abav')");
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.executeUpdate();
		DbUtil.closeAll(null, pstmt, con);
		System.out.println("done");
	}
}
