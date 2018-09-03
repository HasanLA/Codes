package com.domain.DDD_Thru_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenThroughDatabase {
	


	private final void formCompletion(final String hostName, final String portNumber, final String dataBaseName, final String tableName,
			final String dataBasePassword, final String userID_columnName, final String passwordColumnName, final String webpageURL) throws SQLException, ClassNotFoundException {

		
		

		Class.forName("com.mysql.jdbc.Driver");

		System.out.println("The jdbc Driver has successfully loaded.");

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://" + hostName + ":" + portNumber + "/" + dataBaseName + "", "root", dataBasePassword);

		System.out.println("Connection to MySQL database has been successfully established.");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM " + tableName + "");

		while (rs.next()) {

			System.setProperty("webdriver.chrome.driver", "C://Users/hasan/DDD/DDD_Thru_MySQL/driver/chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			String userID = rs.getString(userID_columnName);
			String password = rs.getString(passwordColumnName);

			
			driver.get(webpageURL);

			WebElement a = driver.findElement(By.xpath("//*[@id='email']"));
			a.sendKeys(userID);

			WebElement b = driver.findElement(By.xpath("//*[@id='pwd']"));
			b.sendKeys(password);

			WebElement d = driver.findElement(By.xpath("//*[@id='submitBtn']"));
			d.click();

			
		}

	}
	DataDrivenThroughDatabase dd;
DataDrivenThroughDatabase(String hostName, String portNumber, String dataBaseName, String tableName, String dataBasePassword, String userID_columnName, String passwordColumnName, String webpageURL) throws ClassNotFoundException, SQLException{
	dd= new DataDrivenThroughDatabase(hostName, portNumber, dataBaseName, tableName, dataBasePassword, userID_columnName, passwordColumnName, webpageURL);
	dd.formCompletion(hostName, portNumber, dataBaseName, tableName, dataBasePassword, userID_columnName, passwordColumnName, webpageURL);
	
	
}
}
