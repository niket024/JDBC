package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pack1.DbUtil;

public class Manager10
{
	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = Util.getconnection();
		String s1 = "insert into tab1 values(66,'jjj')";
			//pstmt = con.prepareStatement("insert into tab1 values(501,'abc')");
			pstmt = con.prepareStatement(s1);
			System.out.println(pstmt.executeUpdate());
			System.out.println("----");
			System.out.println(pstmt.executeUpdate());
			System.out.println("----");
			System.out.println(pstmt.executeUpdate());
			System.out.println("----");
			System.out.println("done");

		}
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		} 
		
		finally 
		{
			DbUtil.closeAll(null, pstmt, con);
		}
	}
}
