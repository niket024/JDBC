import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class Final_Jdbc
{
public static void main(String[] args) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","JDBC","GREAT123");
	Statement stmt=con.createStatement();
	String sql="create table saurabh (id int,name varchar(20))";
	stmt.execute(sql);
	System.out.println("done");
	
}
}
