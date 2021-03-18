import java.sql.Connection;
import java.sql.DatabaseMetaData;


public class DatabaseMetaData1
{
public static void main(String[] args) throws Exception
{
	Connection con=DbUtil.getConnection();
	DatabaseMetaData dbmd=con.getMetaData();
	System.out.println(dbmd.getDriverName());
	System.out.println(dbmd.getDatabaseProductName());
	System.out.println("UserName: "+dbmd.getUserName());
	System.out.println(dbmd.getDatabaseProductVersion());
	System.out.println(dbmd.getDriverVersion());



}
}
