import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Manager3
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","JDBC","GREAT123");
		Statement stmt=con.createStatement();
		String sql="select * from pooja";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString(2));
			System.out.println("------------------");
		}
		System.out.println("done");
	}
}
