import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "JDBC", "GREAT123");
		Statement stmt = con.createStatement();
		String sql = "select * from hassan";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("id="+rs.getInt("id"));
			System.out.println("name="+rs.getString("name"));
			System.out.println("-----------------------");
		}
		System.out.println("done");
	}
}
