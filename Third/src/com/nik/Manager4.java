package com.nik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;

public class Manager4
{
	public static void main(String[] args) throws Exception
	{
		Connection con = Util.getConnection();
		Statement stmt = con.createStatement();
	
		FileReader fr=new FileReader("sql.txt");
		BufferedReader bin=new BufferedReader(fr);
		String s1=bin.readLine();
		while(s1!=null)
		{
			stmt.execute(s1);
			s1=bin.readLine();
		}
		System.out.println("done");
	}
}
