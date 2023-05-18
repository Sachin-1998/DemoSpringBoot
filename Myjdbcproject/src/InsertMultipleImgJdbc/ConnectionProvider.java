package InsertMultipleImgJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class ConnectionProvider 
{
	private static Connection conn;
	
	public static Connection getConnection()
	{
		try 
		{
			if(conn==null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/youtube";
				String username="sachin";
				String pass="password";
				
				 conn=DriverManager.getConnection(url, username, pass);
				
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
		
	}

}
