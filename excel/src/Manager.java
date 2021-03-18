import java.sql.*;

public class Manager
{

	public static void main(String[] args)
	{

		try 
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:bbb");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from [Sheet1$]");

			ResultSetMetaData rsmd = rs.getMetaData();
			int col = rsmd.getColumnCount();
	

			while (rs.next()) 
			{

				for (int i = 1; i <= col; i++) {

					if (i > 1)
						System.out.print(", \t\t");
					// String columnValue = rs.getString(i);
					System.out.print(rs.getString(i));
				}
				System.out.println("");
			}

			st.close();
			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}