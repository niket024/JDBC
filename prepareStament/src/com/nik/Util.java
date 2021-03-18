package com.nik;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util
{
 public static Connection getconnection()throws Exception
 {

	 Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "system", "great123");
	return con;
 }
}
