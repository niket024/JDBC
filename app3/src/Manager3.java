import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Manager3
{
public static void main(String[] args) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sql","great123");
	Statement stmt=con.createStatement();
	//String sql="update test set name='divya' where id=222";
	String sql="delete from test where id=222";
	stmt.executeUpdate(sql);
	System.out.println("done");
}
}
