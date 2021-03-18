import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;


public class DatabaseMetaData2
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DbUtil.getConnection();
		DatabaseMetaData dbmd=con.getMetaData();
		//String table[]={"VIEW"};  
		String table[]={"TABLE"};  
		//String table[]={"PROCEDURE"};  
		ResultSet rs=dbmd.getTables(null,null,null,table);  
		  
		while(rs.next())
		{  
		System.out.println(rs.getString(3));  
		}  
		  
		con.close();  
		  
		
		  
		
	}
}
