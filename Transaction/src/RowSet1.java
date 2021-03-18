import java.sql.Connection;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSet1
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
		rowSet.addRowSetListener(new MyListener());
		while (rowSet.next()) {
			System.out.println("Id: " + rowSet.getString(1));
			System.out.println("Name: " + rowSet.getString(2));
		}
	}
}

class MyListener implements RowSetListener
{

	@Override
	public void rowSetChanged(RowSetEvent event)
	{
		System.out.println("RowSet changed...");

	}

	@Override
	public void rowChanged(RowSetEvent event)
	{
		System.out.println("Cursor Changed...");
	}

	@Override
	public void cursorMoved(RowSetEvent event)
	{
		System.out.println("Cursor Moved...");

	}
}
