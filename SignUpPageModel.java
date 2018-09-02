package com.ups.PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageModel extends ModelBase {

	public SignUpPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	protected WebElement cust_name_txt_box = null;
	protected WebElement email_txt_box = null;
	protected WebElement userName_txt_box = null;
	protected WebElement password_txt_box = null;
	protected WebElement show_password_btn = null;
	protected WebElement user_agreement_acceptance_btn = null;
	protected WebElement signUp_submit_button;

	public WebElement cust_name(){

		cust_name_txt_box = driver.findElement(By.xpath("//*[@id='ups-full_name_input']"));
		
		return cust_name_txt_box;
	}

	public WebElement email(){

		email_txt_box = driver.findElement(By.xpath("//*[@id='ups-email_input']"));
		return email_txt_box;
	}

	public WebElement userName(){
		userName_txt_box = driver.findElement(By.xpath("//*[@id='ups-user_id_input']"));

		return userName_txt_box;

	}

	public WebElement password(){
		return password_txt_box = driver.findElement(By.xpath("//*[@id='ups-user_password_input']"));

	}

	public WebElement show_password(){
		show_password_btn = driver.findElement(By.xpath("//*[@id='showButton']"));
		return show_password_btn;
	}

	public WebElement user_agreement_acceptance_btn(){
		return user_agreement_acceptance_btn = driver.findElement(By.cssSelector("#ups-terms_checkbox"));
	}

	public WebElement signUp_submit_button(){
		return signUp_submit_button = driver.findElement(By.cssSelector("#SignupDiv > div.ups-signup.ups-wrap > div > div > div.ups-application_wrapper.ups-form_wrap.ups-app_onboarding > div:nth-child(2) > form > div.ups-CTA-button-margin > div > button"));

	}
}
