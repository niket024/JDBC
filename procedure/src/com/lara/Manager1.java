package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager1
{
public static void main(String[] args)throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","great123");
	Statement stmt=con.createStatement();
	String s1="create table tab3(sno int,name varchar(90))";
	stmt.execute(s1);
	System.out.println("done");
}
}
