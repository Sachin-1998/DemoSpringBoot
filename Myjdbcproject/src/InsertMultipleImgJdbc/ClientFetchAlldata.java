package InsertMultipleImgJdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClientFetchAlldata {

	public static void main(String[] args) {
		try {
			Connection connection = ConnectionProvider.getConnection();
			String q="select * from person";
			Statement sts=connection.createStatement();
			ResultSet resultSet = sts.executeQuery(q);
			while(resultSet.next())
			{
//				int id=resultSet.getInt(1);
//				String lname=resultSet.getString(2);
//				String fname=resultSet.getString(3);
//				String address=resultSet.getString(4);
//			    String city=resultSet.getString(5);
		        System.out.println(resultSet.getInt(1)+" : "+resultSet.getString(2)+" : "+resultSet.getString(3)+" : "+resultSet.getString(4)+" : "+resultSet.getString(5));

			}
			
         
         connection.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		} 
	}

	

}
