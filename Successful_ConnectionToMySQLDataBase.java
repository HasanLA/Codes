package com.domain.DDD_Thru_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Successful_ConnectionToMySQLDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// ideally you would want to paramaterize these
		String hostName = "localhost";
		String portNumber = "3306";
		String dataBaseName = "users";
		String tableName = "log";
		String dataBasePassword="1234";
		//Class.forName("com.mysql.jdbc.Driver");

		System.out.println("The jdbc Driver has successfully loaded.");

		Connection con = DriverManager
				.getConnection("jdbc:mysql://" + hostName + ":" + portNumber + "/" + dataBaseName + "", "root", dataBasePassword);

		System.out.println("Connection to MySQL database has been successfully established.");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM " + tableName + "");

		while (rs.next()) {

			String userID = rs.getString("username");
			String password = rs.getString("password");

			System.out.println("|"+userID+" |"+password+"|");
		}
		
	
			
		}
	


	}




