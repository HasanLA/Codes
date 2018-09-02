package com.ups.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author hasan
 *
 */
public class PracticeWithMySQLConnection {
	

	public static void main(String[] args) throws SQLException {
		
		
		String host = "localhost";
		String port = "1443";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/users", "root", "root");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from log where username IS NOT NULL");
		while (rs.next()) {

			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));

		}

	}

}
