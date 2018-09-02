package com.ups.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ups.ScriptBase.TestBase;

public class LoginPageTest extends TestBase{		
		
//	public LoginPageTest(WebDriver driver) {
//		super(driver);
//	}

		private String chrome;

		@Test
		
		
		public void loginPositiveTest(){
			homePage().selectMainMenu("Log In");
			loginPage(chrome).loginInput("123@gmail.com", null, null, true, true);
		} 
		
//		@Test
//		public void loginWithoutName(){
//			homePage().selectMainMenu("Log In");
//			loginPage().loginInput(userId_or_email, uId, pass_word, remember_Userid, showpassword);
//		Assert.ass
//		}

}
