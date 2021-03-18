import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Manager4
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from image");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) 
		{

			Blob b = rs.getBlob(2);
			byte barr[] = b.getBytes(1, (int) b.length());

			FileOutputStream fout = new FileOutputStream("sonoo.jpg");
			fout.write(barr);
			System.out.println("done");
			DbUtil.closeAll(rs, ps, con);
		}
	}
}
