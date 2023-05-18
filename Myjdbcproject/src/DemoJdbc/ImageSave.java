package DemoJdbc;
import java.io.FileInputStream;
import java.sql.*;
public class ImageSave 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="sachin";
			String pass="password";
			Connection connection = DriverManager.getConnection(url,username,pass);
			
			String q="insert into images(pic) values(?)";
			PreparedStatement statement = connection.prepareStatement(q);
			
			FileInputStream fis=new  FileInputStream("/home/sachin/Downloads/sachinimage.jpg"); 
			statement.setBinaryStream(1, fis,fis.available());
			int imageadded= statement.executeUpdate();
			System.out.println("Image added"+imageadded);
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
