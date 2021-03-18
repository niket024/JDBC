import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "JDBC", "GREAT123");
		Statement stmt = con.createStatement();
		String sql = "create table pooja1 (id int ,name varchar(20))";
		stmt.execute(sql);
		System.out.println("done");
	}
}
