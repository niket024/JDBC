import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","JDBC","GREAT123");
		Statement stmt=con.createStatement();
		String sql="insert into pooja values(45,'ddd')";
		//String sql="UPDATE  POOJA SET NAME='POOJA' WHERE ID=8";
		//String sql="DELETE FROM  POOJA  WHERE ID=45";
		stmt.executeUpdate(sql);
		System.out.println("done");
	}
}
