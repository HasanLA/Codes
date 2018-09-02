package com.ups.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.ups.PageModel.HomePageModel;

public class HomePageActions extends ActionBase {

	HomePageModel homePage = null;

	public HomePageActions(WebDriver driver) {
		super(driver);
		homePage = new HomePageModel(driver);
	}

	public void selectMainMenu(String menu) {

		if (menu != null) {
			homePage.homePage_Menu(menu).sendKeys(Keys.ENTER);
		}
	}

	public void selectTrackingMenu_Items(String item) {

		if (item != null) {
			homePage.trackingMenu(item).click();
		}
	}

	public void selectShippingMenu_Items(String item) {

		if (item != null) {
			homePage.shippingMenu(item).click();
		}
	}

	public void selectservicesMenu_Items(String item) {

		if (item != null) {
			homePage.servicesMenu(item).click();
		}
	}

	// switch (menu)
	// {
	//
	// case "alerts":
	// homePage.mainMenu("alerts").click();
	// break;
	//
	// case "login":
	// homePage.mainMenu("login").click();
	// break;
	//
	// case "signup":
	// homePage.mainMenu("signup").click();
	// break;
	//
	// case "locations":
	// homePage.mainMenu("locations").click();
	// break;
	//
	// case "United States - English":
	// homePage.mainMenu("United States - English").click();
	// break;
	//
	// case "My Profile":
	// homePage.mainMenu("My Profile").click();
	// break;
	//
	// case "tracking":
	// homePage.mainMenu("tracking").click();
	// break;
	//
	// case "shipping":
	// homePage.mainMenu("shipping").click();
	// break;
	//
	// case "services":
	// homePage.mainMenu("services").click();
	// break;
	//
	// default:
	// System.out.println("match not found");
	//

	public void select_MyProfileMenu(String menu, String item) {

		// homePage.mainMenu(menu).click();

		switch (item) {

		case "Sign Up":
			homePage.myProfileMenu("SignUp");

			break;

		case "Log In":
			homePage.myProfileMenu("login");

			break;

		case "Overview":
			homePage.myProfileMenu("profilePage");

			break;

		case "My Information":
			homePage.myProfileMenu("information");

			break;

		case "Addresses":
			homePage.myProfileMenu("contactPage");

			break;

		case "Payment Options":
			homePage.myProfileMenu("payment");

			break;

		case "Preferences":
			homePage.myProfileMenu("prefereces");

			break;

		case "View & Pay Bill":
			homePage.myProfileMenu("billing-payment");

			break;

		default:
			System.out.println("match not found");

		}

	}

	// public void selectTrackingMenu(){
	//
	// }
	//
	// public void selectShippingMenu(){
	//
	// }
	//
	// public void selectServicesMenu(){
	//
	// }

}
