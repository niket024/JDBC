import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StoreFile
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = con
				.prepareStatement("insert into file1 values(?,?)");

		File f = new File("test.txt");
		FileReader fr = new FileReader(f);

		ps.setInt(1, 103);
		ps.setCharacterStream(2, fr, (int) f.length());
		int i = ps.executeUpdate();
		System.out.println(i + " records affected");
		System.out.println("done");
	}
}
