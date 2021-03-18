package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DbUtil.getConnection();
		Statement stmt=con.createStatement();
		String sql="insert into tab3 values(67,'kkkk')";
		int i=stmt.executeUpdate(sql);
		int j=stmt.executeUpdate(sql);
		System.out.println(i);
		System.out.println("done");
	}
}
