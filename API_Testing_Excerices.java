package com.ups.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class API_Testing_Excerices {
	@Test
	public void linkTest() {

		WebDriver driver = new ChromeDriver();
		System.setProperty(null, null);
		driver.get(null);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		// to receive the total number of links on the webpage
		System.out.println("Total Number of links: " + links.size());
		for (WebElement link : links) {

			String url = link.getAttribute("href");

			verifyLink(url);

		}
	}

public void verifyLink(String url){
		try{
		URL link = new URL(url);
		HttpURLConnection urlConnection=(HttpURLConnection) link.openConnection();
		urlConnection.setConnectTimeout(1000);
		
		urlConnection.connect();
		
		
		if (condition) {
			
		} else {

		}
		}
}
}
		

