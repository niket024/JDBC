import java.sql.Connection;
import java.sql.Statement;


public class Manager2
{
public static void main(String[] args) throws Exception
{
	Connection con=Util.getconnection();
	Statement st=con.createStatement();
	st.executeUpdate("insert into hassan values(1111,'moo')");
	System.out.println("done");
	st.close();
	con.close();
}
}
