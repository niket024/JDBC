import java.sql.Connection;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Rowset
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rowSet.setUsername("system");
		rowSet.setPassword("great123");

		rowSet.setCommand("select * from tab3");
		rowSet.execute();
		while (rowSet.next()) 
		{
			  System.out.println("Id: " + rowSet.getString(1));  
              System.out.println("Name: " + rowSet.getString(2));  
		}
	}

}
