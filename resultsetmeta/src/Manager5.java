import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Manager5
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		String sql = "select sno,name from tab3";
		ResultSet rs = stmt.executeQuery(sql);
		//rs.absolute(2);
		rs.moveToInsertRow();
		rs.updateInt(1, 6);
		rs.updateString(2, "niket");
		rs.insertRow();

//		rs.updateInt(1, 89);
//		rs.updateString(2, "PPPP");
//		
//		rs.insertRow();
		System.out.println("done");
	}
}
