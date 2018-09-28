package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection1 {
	
	public static Connection createConnection1() {
		System.out.println("JDBC connection testing...");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		    System.out.println("Where is Mysql jdbc Driver");
			e.printStackTrace();
			
		}
		
		Connection conn = null;
		
	
		try {
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laliga","root","Kshitiz7360");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			
		}
		return conn;
		
	}

}
