import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		String sql = "insert into POOJA values(45,'kkkk')";
		stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.getGeneratedKeys();
		ResultSetMetaData rsmd = rs.getMetaData();
		int col = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= col; i++)
			{
				System.out.println(rsmd.getColumnName(i));
				System.out.println(rs.getString(1));
			}
		}

		System.out.println("done");
	}
}
