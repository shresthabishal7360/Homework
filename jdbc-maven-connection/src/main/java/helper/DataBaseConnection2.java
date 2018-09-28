package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection2 {
	
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot find the driver");
			e.printStackTrace();
		}
		
		Connection conn = null;
		
		try {
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laliga","root","Kshitiz7360");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Could not create connection");
		}
		
		return conn ;
		
		
		
		
	}

}
