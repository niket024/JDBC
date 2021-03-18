import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/nik", "root", "password");
		Statement stmt = con.createStatement();
		// String sql="insert into sd values(123,'abc')";
		String sql = "CREATE table tum(id int,name varchar(20))";
		stmt.execute(sql);
		System.out.println("done");
	}
}
