package com.ups.Test;

import org.testng.annotations.Test;

import com.ups.ScriptBase.TestBase;

public class SignUpPageTest extends TestBase {

	

	@Test
	public void signUpWithNoName() {
		homePage().selectMainMenu("Sign Up");
		signUp_Page().signupInput(null, "abc@gmail.com", "intel5", "Athlon1234!", false, true);
		//Assert.assertEquals(insertNameErrMsg, expectedErrMsgForInsertName);
	}

	@Test
	public void signUpShowPassword_option() {

		homePage().selectMainMenu("Sign Up");
		signUp_Page().signupInput("Hasan", "hahaha123@gmail.com", "haha1238", "n?O1234567890", false, true);
	}

	// Next Class, do login, signup, tracking, shipping

	// @Test
	// public void signUpWithOutEmail() {
	//
	// }
	//
	// @Test
	// public void signUpWithOutUid() {
	//
	// }
	//

}
