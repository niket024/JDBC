import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();

			String s1 = "insert into tab3 values(1111,'yyyy')";
			String s2 = "insert into tab3 values(22222,'hhhh')";

			con.setAutoCommit(false);// by default it is true,so if u want only
										// temp transaction then make it as
										// false
			int i = stmt.executeUpdate(s1);
			int j = stmt.executeUpdate(s2);
			System.out.println(i);
			System.out.println(j);
			// here we will get i=1,j=1 means data inserted but temp. not in
			// table becoz we r using rollback();
		
			//con.commit();
			// it will insert data even though setAutoCommit(false)

			con.rollback();// it will not insert any data into database

			System.out.println("done");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
