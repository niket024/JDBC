import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Manager3
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DbUtil.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into image values(?,?)");
		pstmt.setInt(1, 345);
		FileInputStream fin=new FileInputStream("nik.jpg");  
		pstmt.setBinaryStream(2,fin,fin.available());  
		int i=pstmt.executeUpdate();  
		System.out.println(i+" records affected"); 
		DbUtil.closeAll(null, pstmt, con);

	}
}
