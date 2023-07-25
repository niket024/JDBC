package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil
{
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection()
	{
		try {
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
