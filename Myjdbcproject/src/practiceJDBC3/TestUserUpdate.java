package practiceJDBC3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUserUpdate {

	public static void main(String[] args) {
		try {
			//register class
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="sachin";
			String password="password";
			//create connection
			Connection conn=DriverManager.getConnection(url,username,password);
			
			String query="Update user set uname=? where uid=?";
			
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, "sam");
			ps.setInt(2, 2);
			int executeUpdate = ps.executeUpdate();
			System.out.println("update successfully:"+executeUpdate);
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
