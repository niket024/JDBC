import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Manager4
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		String sql = "select * from POOJA";
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.absolute(4))
		{
			System.out.println(rs.getInt(1)+","+rs.getString(2));
		}
		if(rs.relative(3))
		{
			System.out.println(rs.getInt(1)+","+rs.getString(2));
		}
	}
}
