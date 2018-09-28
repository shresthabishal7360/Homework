package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import helper.DataBaseConnection1;


public class Application {

	public static void main(String[] args) {
		System.out.println("test run");
		Connection c = DataBaseConnection1.createConnection1();
		String insertSql="insert into performances(players_id,speed,accuracy,dribbling,shot_power)" +
				"values('11','77','88','48','98')";
		
		try {
			Statement stmt=c.createStatement();
			stmt.executeUpdate(insertSql);
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
