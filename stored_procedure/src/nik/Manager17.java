package nik;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Manager17
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=DbUtil.getConnection();
			cstmt=con.prepareCall("{call p7(?,?,?,?)}");
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.setInt(4, 434);
			cstmt.execute();
			int age=cstmt.getInt(1);
			String name=cstmt.getString(2);
			int salary=cstmt.getInt(3);
			System.out.println(age);
			System.out.println(name);
			System.out.println(salary);
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
