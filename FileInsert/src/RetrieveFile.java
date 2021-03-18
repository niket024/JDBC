import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class RetrieveFile
{
	public static void main(String[] args) throws Exception
	{
		Connection con = DbUtil.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from file1 where sno=102");  
		ResultSet rs=ps.executeQuery();  
		rs.next();
		              
		Clob c=rs.getClob(2);  
		Reader r=c.getCharacterStream();              
		              
		FileWriter fw=new FileWriter("retrivefile.txt");  
		              
		int i;  
		while((i=r.read())!=-1)  
		fw.write((char)i);  
		              
		DbUtil.closeAll(rs, ps, con) ; 
		              
		System.out.println("success");  
	}
}
