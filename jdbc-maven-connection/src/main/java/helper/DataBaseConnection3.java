package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection3 {
	
	public static  Connection createConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Cannot find the driver");
			
		}
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","Kshitiz7360");
		} catch (SQLException e) {
		  System.out.println("could not create connection");
		}
		return null;
		
		
	}

}
