package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CopyOfTableData
{
static	Statement stmt=null;
static Connection con=null;
public static void main(String[] args) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:XE", "system", "great123");
	Statement stmt=con.createStatement();
	String sql="select * from tab1";
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next())
	{
		int id=rs.getInt(1);
		String name=rs.getString(2);
		System.out.println(id);
		System.out.println(name);
		
		insert(id,name);
	
	}
	System.out.println("mission completed!");
}
public static void insert(int id,String nam) throws Exception
{
    Connection con=DbUtil.getConnection();
	String sql1="insert into tab3 values("+id+",'"+nam+"')";
	stmt=con.createStatement();
	stmt.executeUpdate(sql1);
}
}
