package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager11
{
	public static void main(String[] args) throws Exception
	{
		Connection con=null;
		
		
		PreparedStatement pstmt=null;
		try
		{
			con=Util.getconnection();
			pstmt=con.prepareStatement("insert into tab1 values(?,?)");
			
			pstmt.setInt(1, 701);
			pstmt.setString(2,"hello");
			pstmt.executeUpdate();
			System.out.println("-------");
			pstmt.setInt(1, 702);
			pstmt.setString(2,"ram");
			pstmt.executeUpdate();
			System.out.println("-------");
		}
		catch(SQLException ex)
		{
		ex.printStackTrace();
		}
		finally
		{
	    DbUtil.closeAll(null, pstmt, con);
		}
	}
}
