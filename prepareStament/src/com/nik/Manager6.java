package com.nik;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Manager6
{
public static void main(String[] args) throws Exception
{
	Connection con=DbUtil.getConnection();
	Statement stmt=con.createStatement();
	String sql="select * from nik123";
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next())
	{
		System.out.println("id="+rs.getInt(1));
		System.out.println("name="+rs.getString(2));
		System.out.println("---------------------");
	}
}
}
