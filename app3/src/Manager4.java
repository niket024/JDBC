import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Manager4
{
public static void main(String[] args) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sql","great123");
	Statement stmt=con.createStatement();
	String  sql="select * from test";
	ResultSet rs= stmt.executeQuery(sql);
	while(rs.next())
	{
		int id=rs.getInt("id");
		String name=rs.getString("name");
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("-----------------");
	}
}
}
