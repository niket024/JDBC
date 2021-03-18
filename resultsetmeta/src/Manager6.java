import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class Manager6
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();

		stmt.addBatch("insert into tab3 values(44,'ooo')");
		stmt.addBatch("insert into tab3 values(777,'ghhg')");
		stmt.addBatch("insert into tab3 values(54,'hghgh')");
		stmt.addBatch("insert into tab3 values(32,'tyt')");
		stmt.addBatch("insert into tab3 values(999,'ggh')");
		int x[] = stmt.executeBatch();
		System.out.println(Arrays.toString(x));
		System.out.println("done");

	}
}
