import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Manager1
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from EMP");
		ResultSetMetaData rsmd = rs.getMetaData();
		int col = rsmd.getColumnCount();
		System.out.println(col);
		while (rs.next())
		{
			for (int i = 1; i <= col; i++)
			{

				System.out.println(rsmd.getColumnName(i) + "="
						+ rs.getString(i));
				
			}
			System.out.println("-----------");
		}
	}
}
