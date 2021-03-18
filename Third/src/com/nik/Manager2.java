package com.nik;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager2
{
public static void main(String[] args) throws Exception
{
	Connection con=Util.getConnection();
	Statement stmt=con.createStatement();
	String sql="select * from person";
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next())
	{
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getString(5));
		System.out.println("-----------------");
	}
	Util.closeAll(rs, stmt, con);
}
}
