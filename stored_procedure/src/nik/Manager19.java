package nik;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Manager19
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=DbUtil.getConnection();
			cstmt=con.prepareCall("{call P8(?,?)}");
			
			cstmt.setInt(1, 111);
			cstmt.setInt(2, 10000);
			cstmt.registerOutParameter(2, Types.INTEGER);

			cstmt.execute();
			int age=cstmt.getInt(2);
			
			System.out.println(age);
			
			System.out.println("done");
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
			
		}
		finally
			{
				DbUtil.closeAll(null, cstmt, con);
			}
		}
}
