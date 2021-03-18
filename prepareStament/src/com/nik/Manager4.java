package com.nik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Manager4
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		PreparedStatement pstmt =
				 con.prepareStatement("insert into nik101 values(?,?)");
		Scanner sc=new Scanner(System.in);
		do
		{
			
			System.out.println("enter the id values");
			int id=sc.nextInt();
			System.out.println("enter the name ");
			String name=sc.next();
	
				 pstmt.setInt(1, id);
				 pstmt.setString(2, name);

				pstmt.executeUpdate();
				
				
				System.out.println("do you want to insert again?(y/n)");
				
		}while("y".equals(sc.next()));
		DbUtil.closeAll(null, pstmt, con);
		System.out.println("thank you!");
	}
}
