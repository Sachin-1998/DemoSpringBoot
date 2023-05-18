package DemoJdbc;
import java.sql.*;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		try {
			//load the driver class name
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="sachin";
			String pass="password";
			
			Connection con=DriverManager.getConnection(url, username, pass);
//			if(con.isClosed())
//			{
//				System.out.println("conn closed");
//			}else
//			{
//				System.out.println("conn is created");
//			}
			//create a query
//			String q="create table person( PersonID int(20) primary key auto_increment,\n"
//					+ "					    LastName varchar(255),\n"
//					+ "					    FirstName varchar(255),\n"
//					+ "					    Address varchar(255),\n"
//					+ "					    City varchar(255))";
//			//create a insert query
			String q="INSERT INTO person(LastName,FirstName,Address,City) VALUES(?,?,?,?)";
			//create statement
//			Statement createStatement = con.createStatement();
//			int executeUpdate = createStatement.executeUpdate(q);
//			System.out.println("Table created: "+executeUpdate);
			
			//take input from scanner
			
			Scanner ab=new Scanner(System.in);
			
			System.out.println("Enter the person last name");
			String lastname = ab.next();
			System.out.println("Enter the person first name");
			String firstname = ab.next();
			System.out.println("Enter the person address");
			String address= ab.next();
			System.out.println("Enter the person city");
			String city = ab.next();
			//create person object and set the values
			
			person p=new person();
			
			p.setLastName(lastname);
			p.setFirstName(firstname);
			p.setAddress(address);
			p.setCity(city);
			
			//create a prepareStatement
			PreparedStatement statement = con.prepareStatement(q);
			//set values
			//statement.setInteger(1, p.getPersonId());
			statement.setString(1, p.getLastName());
			statement.setString(2, p.getFirstName());
			statement.setString(3, p.getAddress());
			statement.setString(4, p.getCity());
			//execute the query
			int executeUpdate = statement.executeUpdate();
			System.out.println("Data Inserted Successfully: "+executeUpdate);
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
