package InsertMultipleImgJdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Client {

	public static void main(String[] args) {
		try {
			Connection connection = ConnectionProvider.getConnection();
			String q="insert into images(pic) values(?)";
			PreparedStatement statement = connection.prepareStatement(q);
			//file upload logic
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			File file=jfc.getSelectedFile();
			FileInputStream fis=new FileInputStream(file); 
			
			statement.setBinaryStream(1, fis,fis.available());
			statement.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Success");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
