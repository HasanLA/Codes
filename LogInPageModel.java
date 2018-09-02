package com.ups.PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageModel extends ModelBase {

	protected WebElement email_or_Userid;
	protected WebElement remember_Userid;
	protected WebElement show_password_btn;
	protected WebElement password_txt_box;
	protected WebElement submit_btn;

	public LogInPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement email_or_Userid() {

		email_or_Userid = driver.findElement(By.xpath("//*[@id='email']"));
		return email_or_Userid;
	}

	public WebElement password_txt_box() {
		return password_txt_box = driver.findElement(By.xpath("//*[@id='pwd']"));

	}

	public WebElement remember_Userid() {
		return remember_Userid = driver.findElement(By.xpath("//*[@id='ups-offers_checkbox_non-US']"));

	}

	public WebElement show_password_btn() {
		return show_password_btn = driver.findElement(By.xpath("//*[@id='showHide']"));

	}
	
	
	public WebElement submit_btn() {
		return submit_btn = driver.findElement(By.xpath("//*[@id='submitBtn']"));

	}
}
