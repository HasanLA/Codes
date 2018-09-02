package com.ups.pageactions;

import org.openqa.selenium.WebDriver;

import com.ups.PageModel.LogInPageModel;

public class LoginPageActions extends ActionBase {

	LogInPageModel logInPageModel;

	public LoginPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		logInPageModel = new LogInPageModel(driver);
	}


	public void loginInput(String userId_or_email, String uId, String pass_word, boolean remember_Userid, boolean showpassword) {

		if (userId_or_email != null) {
			logInPageModel.email_or_Userid().sendKeys(userId_or_email);

		}

		if (pass_word != null) {
			logInPageModel.password_txt_box().sendKeys(pass_word);

		}

		if (showpassword == true) {
			logInPageModel.show_password_btn().click();
		}
		
		if (remember_Userid == true) {
			logInPageModel.email_or_Userid().click();
		}
		

		logInPageModel.submit_btn().click();

	}
}
