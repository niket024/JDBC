import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		connection.setAutoCommit(true);
		Statement statement = connection.createStatement();
		statement.executeUpdate("insert into acco values(3, 'aaa')");
		System.out.println("done");
	}
}
