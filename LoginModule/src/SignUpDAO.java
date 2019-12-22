import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignUpDAO {

	public boolean insertRecord(String username,String password)
	{
		String sql="Insert into login values(?,?)";
		String url="jdbc:mysql://localhost:3306/servlet_login";
		String user="root";
		String pass="root";
		boolean result = true;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
}
