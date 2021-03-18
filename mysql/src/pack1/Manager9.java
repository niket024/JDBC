package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;

public class Manager9
{

	 public static void main(String[] args) throws Exception
	 {
		    Connection con=DbUtil.getConnection();
		 	Statement stmt=con.createStatement();
		
		 	FileReader fin=new FileReader("sql.txt");
		 	BufferedReader bin=new BufferedReader(fin);
		 	String sql=bin.readLine();
		 	while(sql!=null)
		 	{
		 		stmt.execute(sql);
		 		sql=bin.readLine();
		 	}
		 	System.out.println("done");
	 }
	 
}
