package pack1;

import java.sql.Connection;
import java.sql.Statement;

public class Managerr
{
public static void main(String[] args) throws Exception
{
	Connection con=Util.getconnection();
	Statement stmt=con.createStatement();
	String sql="CREATE table roop(id int,name varchar(20))";
	stmt.execute(sql);
	System.out.println("done");
}
}
