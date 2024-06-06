import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("create table acco (id int, name varchar(20))");
		System.out.println("done");

		statement.close();
		connection.close();
	}
}
