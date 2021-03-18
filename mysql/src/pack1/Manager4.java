package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Manager4
{
	
	public static void main(String[] args) throws Exception
	{
		Connection con=DbUtil.getConnection();
		Statement stmt=con.createStatement();
		String sql="select * from tab1 WHERE ID=556";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2));
			System.out.println("\n------------");
		}
		System.out.println("THATS ALL");
}
}