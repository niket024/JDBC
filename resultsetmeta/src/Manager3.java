import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Manager3
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		String sql = "select * from POOJA";
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("reading data into rverse order");
		rs.afterLast();
		while (rs.previous()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println("-------------");
		}
		System.out.println("again");
		System.out.println("forward direction");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println("-------------");
		}
		rs.beforeFirst();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println("-------------");
		}

	}
}
