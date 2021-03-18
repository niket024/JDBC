package com.nik;
import java.sql.*;
import java.util.Scanner;

public class Manager5
{
	public static void main(String[] args)throws Exception 
	{
	Connection con=DbUtil.getConnection();
	PreparedStatement pstmt=con.prepareStatement("insert into nik123 values(?,?)");
	Scanner in=new Scanner(System.in);
	do{
		System.out.println("enter the id vales");
		int id=in.nextInt();
		System.out.println("eter the name");
		String name=in.next();
		 pstmt.setInt(1, id);
		 pstmt.setString(2,name);
		 pstmt.executeUpdate();
		 System.out.println("do u want to insert again?(y/n)");
	}while("y".equals(in.next()));
	DbUtil.closeAll(null, pstmt, con);
	System.out.println("thank you!");

	
	}

}
