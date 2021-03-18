package com.nik;

import java.sql.Connection;
import java.sql.Statement;

public class Manager1
{
public static void main(String[] args) throws Exception
{
	Connection con=Util.getConnection();
	Statement stmt=con.createStatement();
	String sql="update  person set id=101 where fname='abc'";
	stmt.executeUpdate(sql);
	System.out.println("done");
	Util.closeAll(null, stmt, con);
}
}
