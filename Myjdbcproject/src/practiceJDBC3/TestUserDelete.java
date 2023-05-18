package practiceJDBC3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUserDelete {

	public static void main(String[] args)

	{
		try {
			//register class
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="sachin";
			String password="password";
			//create connection
			Connection conn=DriverManager.getConnection(url,username,password);
			
			String q="delete from user where uid=?";
			PreparedStatement ps=conn.prepareStatement(q);
			ps.setInt(1, 1);
			int delete = ps.executeUpdate();
			System.out.println("deleted successfully: "+delete);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
