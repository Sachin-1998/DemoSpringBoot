package DemoJdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update_class
{
	public static void main(String[] args) {
		try 
		{
			//load the class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create a connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="sachin";
			String pass="password";

			Connection con=DriverManager.getConnection(url, username, pass);
			//create statement
			String q="update person set City=? where PersonId=?";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the new city");
			String city = sc.next();
			System.out.println("Enter the existing id");
			int pid = sc.nextInt();
			PreparedStatement statement = con.prepareStatement(q);
			statement.setString(1, city);
			statement.setInt(2, pid);
			
			
			int update = statement.executeUpdate();
			
			System.out.println("upadted..."+update);
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
