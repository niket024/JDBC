package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DbUtil.getConnection();
		Statement stmt=con.createStatement();
		String sql="CREATE table tab33(id int,name varchar(20))";
		stmt.execute(sql);
		System.out.println("done");
	}
}
