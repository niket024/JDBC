package nik;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager1
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "create table emp (sno int,name varchar(90),age int,salary int)";

			stmt.execute(s1);
			System.out.println("done");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
