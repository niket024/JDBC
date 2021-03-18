import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "JDBC", "GREAT123");
		Statement stmt = con.createStatement();
		String sql = "create table hassan (id int,name varchar2(20))";
		stmt.execute(sql);
		stmt.close();
		con.close();
		
		System.out.println("done");
	}
}
