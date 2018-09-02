package com.ups.PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Schedule_a_PickupPageModel extends ModelBase {

	public Schedule_a_PickupPageModel(WebDriver driver) {
		super(driver);

	}

	Select sel;

	protected WebElement ups_Domestic_Services;

	protected String package_total;

	protected Boolean palletOrPackage_pickup_Question_True_or_False;

	protected String pallet_service;

	protected String pallet_quantity;

	protected String pallet_totalweight;

	protected String pallet_length;

	protected String pallet_width;

	protected String pallet_height;

	protected String pallet_DangerousGoods_qustion;

	protected String gross_weight;

	protected String domestic_Services;

	protected String international_Services;

	protected WebElement choose_package_or_Freight_pickup;

	protected WebElement prePrinted_shipping_Label;

	protected WebElement no_prePrinted_shipping_Label;

	protected WebElement package_quantity_ele;

	protected WebElement pallet_pickup;

	protected WebElement pallet_middayExpress;

	protected WebElement pickup_Information_and_Location;

	protected WebElement ups_InternationalServices_checkbox;

	protected WebElement do_pickup_items_weigh_over_seventypounds;

	protected WebElement tracking_Number_textbox;

	protected WebElement will_you_Pay_theDriver_UsingCheck_or_MoneyOrder;

	protected WebElement earliest_Pickup_Time_AM_radio_button;

	protected WebElement earliest_Pickup_Time_PM_radio_button;

	protected WebElement pickupdate;

	protected WebElement readyHours;

	protected WebElement pick_Reference_id_Number;

	protected WebElement specialInstructions;

	protected WebElement nextButton;

	protected String pallet;

	protected WebElement showPickUpNotifications_btn;

	protected WebElement email_textBox;

	protected WebElement personalizedMessage;

	protected WebElement yourEmail_txt_box;

	protected WebElement yes_items_weigh_over_seventypounds;

	protected WebElement pallet_Pickup_request_checkbox;

	protected WebElement no_items_weigh_over_seventypounds;

	protected WebElement accNum;

	protected WebElement custName;

	protected WebElement cont_Name;

	protected WebElement address;

	protected WebElement roomNumber;

	protected WebElement flr_Number;

	protected WebElement city;

	protected WebElement residential_address_checkbox;

	protected WebElement zip;

	protected WebElement telephone;

	protected WebElement extension_Number;

	protected WebElement yes_prePrinted_shipping_Label;

	protected WebElement dangerous_goods;

	protected WebElement pallet_totalweight_txtbox;

	protected WebElement pallet_length_txtbox;

	protected WebElement pallet_height_txtbox;

	protected WebElement pallet_width_txtbox;

	protected WebElement ups_palletShipping_checkbox;

	protected WebElement lift_Gate_onPickup_checkbox;

	// Question 1 shipping_Label_Questions

	public WebElement prePrinted_shipping_Label() {
		return prePrinted_shipping_Label = driver.findElement(By.xpath("//*[@id='radioShippingY']"));
	}

	public WebElement tracking_Number_textbox() {
		// In the actions package if you answer yes or true to the prePrinting
		// Shipping label question whilst creating the method. Also don't forget
		// to parameterize using sendKeys.
		return tracking_Number_textbox = driver.findElement(By.xpath("//*[@id='trkNbrAreaId']"));
	}

	public WebElement yes_prePrinted_shipping_Label() {
		return yes_prePrinted_shipping_Label = driver.findElement(By.xpath("//*[@id='radioShippingY']"));
	}

	public WebElement no_prePrinted_shipping_Label() {
		return no_prePrinted_shipping_Label = driver.findElement(By.xpath("//*[@id='radioShippingN']"));
	}

	public WebElement will_you_Pay_theDriver_UsingCheck_or_MoneyOrder() {
		// attach the click() method at the end of this whilst making the
		// actions pacakge method to be boolean
		return will_you_Pay_theDriver_UsingCheck_or_MoneyOrder = driver
				.findElement(By.xpath("//*[@id='payCashCheckDiv']/div/div/label"));
	}

	// Question No. 2 PickUp Info and Location

	public WebElement accNum() {
		return accNum = driver.findElement(By.xpath("//*[@id='acctNbrId']"));

	}

	// company_or_customerName

	public WebElement custName() {
		return custName = driver.findElement(By.xpath("//*[@id='addrMDCompanyId']"));

	}

	// contact_name

	public WebElement cont_Name() {
		return cont_Name = driver.findElement(By.xpath("//*[@id='addrMDCustNameId']"));
	}
	// street_address

	public WebElement address() {
		return address = driver.findElement(By.xpath("//*[@id='addressId']"));

	}

	// suite_or_roomNumber

	public WebElement roomNumber() {
		return roomNumber = driver.findElement(By.xpath("//*[@id='addrMDRoomId']"));

	}

	// floor_Number

	public WebElement flr_Number() {
		return flr_Number = driver.findElement(By.xpath("//*[@id='addrMDFloorId']"));

	}
	// city_name

	public WebElement city() {
		return city = driver.findElement(By.xpath("//*[@id='pd2Id']"));

	}

	// state_Name

	public void state_Name(String state_Name) {
		WebElement stateName_ele = driver.findElement(By.xpath("//*[@id='pd1']"));
		sel = new Select(stateName_ele);

		sel.selectByVisibleText(state_Name);
	}
	// zip_Code

	public WebElement zip() {
		return zip = driver.findElement(By.xpath("//*[@id='postalcode']"));

	}
	// telephone_Number

	public WebElement telephone() {
		return telephone = driver.findElement(By.xpath("//*[@id='addrMDPhoneId']"));
	}

	// extension_Number

	public WebElement extension_Number() {
		return extension_Number = driver.findElement(By.xpath("//*[@id='addrMDExtId']"));
	}

	// residential_Address

	public WebElement residential_address_checkbox() {

		return residential_address_checkbox = driver.findElement(By.xpath("//*[@id='chkResiAddr']"));
	}

	// PickUp Info and Location question completed

	// Question No.3 SERVICE AND PACKAGE INFORMATION

	public void package_total(String number_of_packages_inYourPickup) {
		package_quantity_ele = driver.findElement(By.xpath("//'[@id='dtotalpkgs']"));
		sel = new Select(package_quantity_ele);

		sel.selectByVisibleText(number_of_packages_inYourPickup);
	}

	public WebElement pallet_Pickup_request_checkbox() {
		return pallet_Pickup_request_checkbox = driver.findElement(By.xpath("//*[@id='palletPickupId']"));
	}

	public void pallet_quantity(String pallet_quantity) {
		WebElement pq = driver.findElement(By.xpath("//*[@id='dtotalpallets']"));
		sel = new Select(pq);
		sel.deselectByVisibleText(pallet_quantity);
	}

	public WebElement pallet_totalweight_txtbox() {
		return pallet_totalweight_txtbox = driver.findElement(By.xpath("//*[@id='pTotweightId']"));
	}

	public WebElement pallet_length_txtbox() {
		return pallet_length_txtbox = driver.findElement(By.xpath("//*[@id='length']"));
	}

	public WebElement pallet_width_txtbox() {
		return pallet_width_txtbox = driver.findElement(By.xpath("//*[@id='width']"));
	}

	public WebElement pallet_height_txtbox() {
		return pallet_height_txtbox = driver.findElement(By.xpath("//*[@id='height']"));
	}

	public WebElement ups_palletShipping_Speed_checkbox(String deliveryspeed) {
		return ups_palletShipping_checkbox = driver
				.findElement(By.xpath("//*[@id='expSrvDiv']/div[contains(text(), '" + deliveryspeed + "')]"));
	}

	public WebElement true_or_false_pallet_contains_DangerousGoods_chkbox() {
		return dangerous_goods = driver.findElement(By.xpath("//*[@id='dangGoods']"));
	}

	public WebElement ups_DomesticServices_checkbox(String deliveryspeed) {
		return pickup_Information_and_Location = driver
				.findElement(By.xpath("//*[@id='domSrvDiv']/div/label[contains(text(), '" + deliveryspeed + "')]"));
	}

	public WebElement ups_InternationalServices_checkbox(String deliveryspeed) {
		return ups_InternationalServices_checkbox = driver
				.findElement(By.xpath("//*[@id='intlSrvDiv']/div[contains(text(), '" + deliveryspeed + "')]"));
	}

	public WebElement yes_these_items_weigh_over_seventypounds() {
		return yes_items_weigh_over_seventypounds = driver.findElement(By.xpath("//*[@id='radioWeight70Y']"));

	}

	public WebElement no_these_items_weigh_over_seventypounds() {
		return no_items_weigh_over_seventypounds = driver.findElement(By.xpath("//*[@id='radioWeight70N']"));

	}
	// SERVICE AND PACKAGE INFORMATION Question completed

	// Question 4: PICKUP DATE AND TIME

	public void pallet_PickUp_Options(String whoWillPickUp) {
		WebElement pc = driver.findElement(By.xpath("//*[@id='exppickup']"));
		sel = new Select(pc);

		sel.selectByVisibleText(whoWillPickUp);
	}

	public WebElement lift_Gate_onPickup_checkbox() {
		
		 return lift_Gate_onPickup_checkbox = driver.findElement(By.xpath("//*[@id='liftGatePkpChkBx']"));

	}

	public void pickupdate(String date) {
		pickupdate = driver.findElement(By.xpath("//*[@id='pickupdate']"));
		sel = new Select(pickupdate);

		sel.selectByVisibleText(date);

	}

	public void earliest_Pickup_Time_Hour(String pickupHour) {
		WebElement readyHours = driver.findElement(By.xpath("//*[@id='readyHours']"));
		sel = new Select(readyHours);

		sel.selectByVisibleText(pickupHour);
	}

	public void earliest_Pickup_Time_Minutes(String pickupMins) {
		WebElement readyMins = driver.findElement(By.xpath("//*[@id='readyMinutes']"));
		sel = new Select(readyMins);

		sel.selectByVisibleText(pickupMins);

	}

	public WebElement earliest_Pickup_Time_AM_radio_button() {
		return earliest_Pickup_Time_AM_radio_button = driver.findElement(By.xpath("//*[@id='readyAMId']"));
	}

	public WebElement earliest_Pickup_Time_PM_radio_button() {
		return earliest_Pickup_Time_PM_radio_button = driver.findElement(By.xpath("//*[@id='readyPMId']"));
	}

	public void latest_Pickup_Time_Hour(String latest_pickupHour) {
		WebElement latest_time_Hours = driver.findElement(By.xpath("//*[@id='closeHours']"));
		sel = new Select(latest_time_Hours);

		sel.selectByVisibleText(latest_pickupHour);
	}

	public void latest_Pickup_Time_Minutes(String pickupMins) {
		WebElement latest_time_Mins = driver.findElement(By.xpath("//*[@id='closeMinutes']"));
		sel = new Select(latest_time_Mins);

		sel.selectByVisibleText(pickupMins);
	}

	public WebElement latest_Pickup_Time_AM_radio_button() {
		return earliest_Pickup_Time_AM_radio_button = driver.findElement(By.xpath("//*[@id='closeAMId']"));
	}

	public WebElement latest_Pickup_Time_PM_radio_button() {
		return earliest_Pickup_Time_PM_radio_button = driver.findElement(By.xpath("//*[@id='closePMId']"));
	}

	public void preferredPickup_point(String pickupLocation) {
		WebElement pickupLoc = driver.findElement(By.xpath("//*[@id='pickuppoint']"));
		sel = new Select(pickupLoc);

		sel.selectByVisibleText(pickupLocation);
	}

	public WebElement pick_Reference_id_Number() {
		return pick_Reference_id_Number = driver.findElement(By.xpath("//*[@id='pickupReferenceId']"));
	}

	public WebElement specialInstructions(String insertInstructions) {
		return specialInstructions = driver.findElement(By.xpath("//*[@id='spInstrId']"));
	}

	// PICKUP DATE AND TIME Question completed

	// Question5: PICKUP NOTIFICATIONS
	public WebElement showPickUpNotifications_btn() {
		// make a boolean expression to make this WebElement get clicked.
		return showPickUpNotifications_btn = driver.findElement(By.xpath("//*[@id='showHideNotiId']"));
	}

	public void phoneNumber(String phoneNumber) {
		// make a boolean expression to make this WebElement get clicked.
		WebElement phNumber = driver.findElement(By.xpath("//*[@id='phoneList']"));
		sel = new Select(phNumber);
		sel.selectByVisibleText(phoneNumber);
	}

	public  void email_textBox(Integer total_amount_of_emails_you_would_like_to_notify, String emailAdress) {
		 email_textBox = driver.findElement(By.xpath("//input[@name='email" + total_amount_of_emails_you_would_like_to_notify + "']"));
email_textBox.sendKeys(emailAdress);
	}

	public WebElement personalizedMessage_txt_box() {
		return personalizedMessage = driver.findElement(By.xpath("//*[@id='emailmessageId']"));
	}

	public WebElement yourEmailAddress_txt_box() {
		return yourEmail_txt_box = driver.findElement(By.xpath("//*[@id='failedemailId']"));

	}

	// Question5: PICKUP NOTIFICATIONSQuestion completed

	public WebElement next_button() {
		return nextButton = driver.findElement(By.xpath("//*[@id='nextButtonId']"));
	}

}
