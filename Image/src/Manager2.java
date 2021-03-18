import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DbUtil.getConnection();
		Statement stmt=con.createStatement();
		String sql="select * from image  where sno=7";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			Blob b1=rs.getBlob(2);
			byte b2[]=b1.getBytes(1, (int)b1.length());
			writeInToFile(b2);
			System.out.println("done");
		}
	}
	public static void writeInToFile(byte []y) throws IOException
	{
		File f2=new File("nik1.jpg");
		FileOutputStream fout=new FileOutputStream(f2);
		fout.write(y);
	}
}
