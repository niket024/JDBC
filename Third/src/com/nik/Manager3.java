package com.nik;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Manager3
{
	public static void main(String[] args) throws Exception
	{
		Connection con = Util.getConnection();
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter the id value");
			int id = sc.nextInt();
			System.out.println("enter the name value");
			String name = sc.next();

			String s1 = "insert into emp values(" + id + ",'" + name + "')";
			stmt.executeUpdate(s1);
			System.out.println("done");
			System.out.println("do you want to insert again?(y/n)");
		} while ("y".equalsIgnoreCase(sc.next()));
	}
}
