package com.lara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager17
{
public static void main(String[] args)
{
	Connection con=null;
	PreparedStatement pstmt=null;
	try
	{
		con=Manager3.getConnection();
		pstmt=con.prepareStatement("insert into tab3 values(?,?)");
		FileReader fin=null;
		BufferedReader bin=null;
		System.out.println("done");
		try
		{
			fin=new FileReader("data.txt");
			bin=new BufferedReader(fin);
			String sno ,name,line;
			int index;
		line=bin.readLine();
			while(line!=null)
			{
				index=line.indexOf("-");
				sno=line.substring(0,index);
				name=line.substring(index+1,line.length());
				pstmt.setInt(1, Integer.parseInt(sno));
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				line=bin.readLine();
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(bin!=null)
					bin.close();
				bin=null;
			}
			catch(IOException ex)
			{
			ex.printStackTrace();
			}
			try
			{
				if(fin!=null)
					fin.close();
				fin=null;
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Manager3.closeAll(null, pstmt, con);
		}
	}
}

