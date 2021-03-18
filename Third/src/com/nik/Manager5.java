package com.nik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Manager5
{
	public static void main(String[] args) throws Exception
	{
		Connection con = Util.getConnection();
		Statement stmt = con.createStatement();
		String sql = "select * from swapn";
		FileWriter fout = new FileWriter("data.xls");
		BufferedWriter bout = new BufferedWriter(fout);
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			String s1=Integer.toString(id);
			String name = rs.getString(2);
			bout.write("[id=");
			bout.write(s1);
			bout.write(",name=");
			bout.write(name+"]");
			bout.newLine();

		}
		bout.flush();
		bout.close();
		System.out.println("done");
	}
}
