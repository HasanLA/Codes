package com.ups.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ups.ScriptBase.TestBase;

public class ScheduleAPickup extends TestBase {

	@Test
	public void NoCellPhoneNumber_Test() {

		homePage().selectMainMenu("Shipping");
		homePage().selectShippingMenu_Items("Schedule a Pickup");
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		schedule_A_Pickup().pickup_Notifications_Input(null, 1, "a@gmail.com", null,
				"hasan.abdulhasib94@gmail.com");

	}

