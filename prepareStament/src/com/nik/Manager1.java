package com.nik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class Manager1
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement("create table nik101 (id int,name varchar(20))");
        pstmt.execute();
        DbUtil.closeAll(null, pstmt, con);
	    
		System.out.println("done");
	}
}
