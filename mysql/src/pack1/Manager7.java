package pack1;

import java.sql.Connection;
import java.sql.Statement;

public class Manager7
{
 public static void main(String[] args) throws Throwable
{
	Connection con=DbUtil.getConnection();
	Statement stmt=con.createStatement();
	String sql="insert into tab1 values(12,'aaaa')";
	stmt.execute(sql);
	System.out.println("done");
}
}
