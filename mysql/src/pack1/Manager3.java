package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager3
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DbUtil.getConnection();
		Statement stmt=con.createStatement();
		String sql="delete from tab3 where id=14";
		//String sql="update  tab3 set name='shilpa' where id=89";
		int i=stmt.executeUpdate(sql);
		System.out.println(i);
		System.out.println("done");
	}
}
