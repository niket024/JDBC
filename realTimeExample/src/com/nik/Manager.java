package com.nik;
import java.sql.Connection;

import java.util.Scanner;

public class Manager
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("**************Employee Details****************");
		System.out.println("1.Add");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Display");
		System.out.println("5.Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener your choice?");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			addEmployee();
			break;
		case 2:
			updateEmployee();
			break;
		case 3:
			delEmployee();
			break;
		case 4:
			displayEmployee();
			break;
		case 5:
			System.out.println("Thank you!!");
			System.exit(0);
			break;
		default:
			System.out.println("please enter the crrect choice");
			break;
		}
	}

	static void addEmployee()
	{
		System.out.println("enter your id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		pstmt.setInt(1, id);
		 pstmt.setString(2, name);

		pstmt.executeUpdate();
	}

	static void updateEmployee()
	{
		System.out.println("update");
	}

	static void delEmployee()
	{
		System.out.println("delete");
	}

	static void displayEmployee()
	{
		System.out.println("select");
	}
}
