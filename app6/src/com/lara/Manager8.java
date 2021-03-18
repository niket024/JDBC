package com.lara;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Manager8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null;
		String sno, name, sql, decider;
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			do {
				System.out.println("enter id");
				sno = sc.next();
				System.out.println("enter name");
				name = sc.next();
				sql = "insert into hassan values(" + sno + ",'" + name + "')";
				stmt.executeUpdate(sql);
				System.out.println(sql);
				System.out.println("do u want to insert again(y/n)");
				decider = sc.next();
			} while ("y".equals(decider));
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			DbUtil.closeAll(null, stmt, con);
		}
		System.out.println("thanks");
	}
}
