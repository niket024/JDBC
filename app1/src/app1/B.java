package app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement statement = connection.createStatement();
		
			String sql = "insert into nik values (123, 'abc')";
			statement.executeUpdate(sql);
			System.out.println("done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
