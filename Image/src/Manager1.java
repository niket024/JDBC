import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Manager1
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		PreparedStatement pstmt = con
				.prepareStatement("insert into image values(?,?)");
		pstmt.setInt(1, 7);
		pstmt.setObject(2, getByte());
		pstmt.execute();
		System.out.println("done");
	}

	public static byte[] getByte() throws IOException
	{

		File f1 = new File("Koala.jpg");
		byte b[] = new byte[(int) f1.length()];
		FileInputStream fin = new FileInputStream(f1);
		fin.read(b);
		return b;
	}
}
