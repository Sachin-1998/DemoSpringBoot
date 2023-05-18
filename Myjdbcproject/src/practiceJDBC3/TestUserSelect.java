package practiceJDBC3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

public class TestUserSelect {

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
			String query="select * from user";
			ResultSet rs = sts.executeQuery(query);
			
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnCount());
			System.out.println(metaData.getColumnName(1));
			System.out.println(metaData.getColumnTypeName(1));
			System.out.println(metaData.getColumnTypeName(2));
			System.out.println(metaData.getColumnTypeName(3));
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		

	}

}
