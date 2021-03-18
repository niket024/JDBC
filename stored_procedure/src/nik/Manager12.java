package nik;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Manager12
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=DbUtil.getConnection();
			cstmt=con.prepareCall("{call p5(?,'abc')}");
			cstmt.setInt(1, 333);
			cstmt.execute();
			
			cstmt.setInt(1, 444);
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
