package nik;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Manager10
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=DbUtil.getConnection();
			cstmt=con.prepareCall("{call p4(?,?,?,?)}");
			cstmt.setInt(1, 200);
			cstmt.setString(2, "xxx");
			cstmt.setInt(3, 21);
			cstmt.setInt(4, 24341);
			cstmt.execute();
			cstmt.setInt(1, 434);
			cstmt.setString(2, "yyy");
			cstmt.setInt(3, 26);
			cstmt.setInt(4, 676767);
			cstmt.execute();
			System.out.println("done");
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			
		}
		finally{
			{
				DbUtil.closeAll(null, cstmt, con);
			}
		}
	}
}
