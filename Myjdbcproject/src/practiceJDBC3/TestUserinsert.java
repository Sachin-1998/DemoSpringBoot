package practiceJDBC3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUserinsert {

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
			
			//create statement
			Statement sts=conn.createStatement();
			//create query
			String query="insert into user(uname,phone) values('gomu','98456')";
			int insertData = sts.executeUpdate(query);
			System.out.println("data inserted successfully: "+insertData);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
