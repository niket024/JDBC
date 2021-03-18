import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Manager2
{
public static void main(String[] args) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sql","great123");
	Statement stmt=con.createStatement();
	String sql="insert into test values(222,'xyz')";
	stmt.executeUpdate(sql);
	System.out.println("done");
}
}
