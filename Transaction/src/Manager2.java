import java.sql.Connection;
import java.sql.Statement;


public class Manager2
{
public static void main(String[] args) throws Exception
{
	Connection con=DbUtil.getConnection();
	Statement stmt=con.createStatement();
	String sql="insert into sweta values(78,'hhh')";
	con.setAutoCommit(false);
	int i=stmt.executeUpdate(sql);
	con.rollback();
	System.out.println(i);
}
}
