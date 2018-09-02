package com.ups.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.ups.PageModel.SignUpPageModel;

public class SignUpPageActions extends ActionBase {
	SignUpPageModel signupPageModel;

	public SignUpPageActions(WebDriver driver) {
		super(driver);
		signupPageModel = new SignUpPageModel(driver);
	}

	public void signupInput(String name, String email, String userID, String pass_word, boolean showpassword,
			boolean confirm_UserAgreement) {

		if (name != null) {
			signupPageModel.cust_name().sendKeys(name);

		}

		if (email != null) {
			signupPageModel.email().sendKeys(email);

		}
		if (userID != null) {
			signupPageModel.userName().sendKeys(userID);

		}

		if (pass_word != null) {
			signupPageModel.password().sendKeys(pass_word);

		}

		if (showpassword == true) {
			signupPageModel.show_password().sendKeys(Keys.RETURN);
		}

		if (confirm_UserAgreement == true) {
			signupPageModel.user_agreement_acceptance_btn().sendKeys(Keys.ENTER);
		}

		signupPageModel.signUp_submit_button().sendKeys(Keys.RETURN);

	}
}
