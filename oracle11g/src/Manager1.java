import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Manager1
{
public static void main(String[] args) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","great123");
	Statement stmt=con.createStatement();
	String sql="create table pooja (id int ,name varchar(20))";
	stmt.execute(sql);
	stmt.close();
	con.close();
	System.out.println("done");
}
}
