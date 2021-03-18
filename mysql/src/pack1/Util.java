package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util
{
 public static Connection getconnection()throws Exception
 {

	 Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/niket","root","great123");
	return con;
 }
}
