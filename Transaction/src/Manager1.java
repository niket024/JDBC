import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager1
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();

			String s1 = "insert into tab3 values(89,'ppp')";
			

			con.setAutoCommit(false);
			int i = stmt.executeUpdate(s1);
			System.out.println(i);
			con.rollback();
			//here due to roll back 1st query will also not execute
			String s2 = "insert into tab3 values(6,xyz')";
			int j = stmt.executeUpdate(s2);
			
			System.out.println(j);
			
		

			System.out.println("done");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
