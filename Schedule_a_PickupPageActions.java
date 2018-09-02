package com.ups.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.ups.PageModel.Schedule_a_PickupPageModel;

public class Schedule_a_PickupPageActions extends ActionBase {

	Schedule_a_PickupPageModel sc;

	public Schedule_a_PickupPageActions(WebDriver driver) {
		super(driver);
		sc = new Schedule_a_PickupPageModel(driver);
	}

	public void palletPickup_Input(boolean do_you_have_prePrinted_shipping_Label, String tracking_Number,
			boolean agreemenet_to_pay_the_driver, String account_number, String company_or_customerName,
			String contact_name, String street_address, String suite_or_roomNumber, String floor_Number,
			String city_name, String state_Name, String zip_Code, String telephone_Number, String extension_Number,
			boolean residential_Address, Boolean pallet_PickUp_Answer_True_or_False, String pallet_quantity,
			String pallet_totalweight, String pallet_length, String pallet_width, String pallet_height,
			String pallet_DangerousGoods_qustion, boolean true_or_false_this_pallet_has_dangerous_goods,
			String pickupDate, String earliest_pickuptime_hours, String earliest_pickuptime_minutes, String am_orPM,
			String latest_pickuptime_hours, String latest_pickuptime_minutes, String latest_am_orPM,
			String pickupPointLocation, String pickUpReference, String instructions_ToDriver,
			String whoWillDropoff_or_Pickup, boolean true_or_false_liftgate_pickUp,
			String do_you_want_to_submit_Form_yes_orNo) {

		if (do_you_have_prePrinted_shipping_Label == true) {
			sc.yes_prePrinted_shipping_Label().sendKeys(Keys.ENTER);
			sc.tracking_Number_textbox().sendKeys(tracking_Number);
		}

		if (do_you_have_prePrinted_shipping_Label == false) {
			sc.no_prePrinted_shipping_Label();
		}
		if (agreemenet_to_pay_the_driver == true) {
			sc.will_you_Pay_theDriver_UsingCheck_or_MoneyOrder().sendKeys(Keys.RETURN);
		}

		// account number
		if (account_number != null) {
			sc.accNum().sendKeys(account_number);
		}

		// company_or_customerName
		if (company_or_customerName != null) {
			sc.custName().sendKeys(company_or_customerName);

		}

		// contact_name
		if (contact_name != null) {
			sc.cont_Name().sendKeys(contact_name);
		}

		// street_address

		if (street_address != null) {
			sc.address().sendKeys(street_address);
		}

		// suite_or_roomNumber

		if (suite_or_roomNumber != null) {
			sc.roomNumber().sendKeys(suite_or_roomNumber);
		}

		// floor_Number
		if (floor_Number != null) {

			sc.flr_Number().sendKeys(floor_Number);
		}
		// city_name
		if (city_name != null) {
			sc.city().sendKeys(city_name);
		}
		// state_Name

		if (state_Name != null) {
			sc.state_Name(state_Name);
		}

		// zip_Code
		if (city_name != null) {
			sc.city().sendKeys(city_name);
		}

		if (zip_Code != null) {

			sc.zip().sendKeys(zip_Code);
		}

		// telephone_Number
		if (telephone_Number != null) {
			sc.telephone().sendKeys(telephone_Number);
		}

		// Extension number
		if (extension_Number != null) {
			sc.extension_Number().sendKeys(extension_Number);
		}

		// residential address
		if (residential_Address == true) {
			sc.residential_address_checkbox().sendKeys(Keys.ENTER);

		}

		if (pallet_PickUp_Answer_True_or_False != true) {

			sc.pallet_Pickup_request_checkbox().sendKeys(Keys.RETURN);

		}

		if (pallet_quantity != null) {

			sc.pallet_quantity(pallet_quantity);

		}
		if (pallet_totalweight != null) {

			sc.pallet_totalweight_txtbox().sendKeys(pallet_totalweight);

		}
		if (pallet_length != null) {

			sc.pallet_length_txtbox().sendKeys(pallet_length);

		}

		if (pallet_width != null) {

			sc.pallet_width_txtbox().sendKeys(pallet_width);

		}

		if (pallet_height != null) {

			sc.pallet_height_txtbox().sendKeys(pallet_height);

		}

		if (true_or_false_this_pallet_has_dangerous_goods == true) {
			sc.true_or_false_pallet_contains_DangerousGoods_chkbox().sendKeys(Keys.RETURN);
		}

		if (whoWillDropoff_or_Pickup != null) {
			sc.pallet_PickUp_Options(whoWillDropoff_or_Pickup);

		}

		if (true_or_false_liftgate_pickUp != true) {

			sc.lift_Gate_onPickup_checkbox().sendKeys(Keys.RETURN);

		}

		if (pickupDate != null) {

			sc.pickupdate(pickupDate);
		}
		if (earliest_pickuptime_hours != null) {

			sc.earliest_Pickup_Time_Hour(earliest_pickuptime_hours);
		}
		if (earliest_pickuptime_minutes != null) {

			sc.earliest_Pickup_Time_Minutes(earliest_pickuptime_minutes);
		}

		if (am_orPM.equalsIgnoreCase("am")) {
			sc.earliest_Pickup_Time_AM_radio_button().sendKeys(Keys.RETURN);

		} else {
			sc.earliest_Pickup_Time_PM_radio_button().sendKeys(Keys.RETURN);
		}
		if (latest_pickuptime_hours != null) {
			sc.latest_Pickup_Time_Hour(latest_pickuptime_hours);
		}
		if (latest_pickuptime_minutes != null) {
			sc.latest_Pickup_Time_Minutes(latest_pickuptime_minutes);
		}

		if (latest_am_orPM.equalsIgnoreCase("am")) {
			sc.latest_Pickup_Time_AM_radio_button().sendKeys(Keys.RETURN);

		} else {
			sc.latest_Pickup_Time_AM_radio_button().sendKeys(Keys.RETURN);
		}

		if (pickupPointLocation != null) {

			sc.preferredPickup_point(pickupPointLocation);
		}
		if (pickUpReference != null) {

			sc.pick_Reference_id_Number().sendKeys(pickUpReference);
		}
		if (instructions_ToDriver != null) {

			sc.specialInstructions(instructions_ToDriver);

			if (do_you_want_to_submit_Form_yes_orNo.equalsIgnoreCase("yes")) {
				sc.next_button().sendKeys(Keys.RETURN);
			}
		}

	}

	public void packagePickup_Input(boolean do_you_have_prePrinted_shipping_Label, String tracking_Number,
			boolean agreemenet_to_pay_the_driver, String account_number, String company_or_customerName,
			String contact_name, String street_address, String suite_or_roomNumber, String floor_Number,
			String city_name, String state_Name, String zip_Code, String telephone_Number, String extension_Number,
			boolean residential_Address, String package_total,
			boolean true_or_false_this_order_has_items_over_seventy_pounds, String pickupDate,
			String earliest_pickuptime_hours, String earliest_pickuptime_minutes, String am_orPM,
			String latest_pickuptime_hours, String latest_pickuptime_minutes, String latest_am_orPM,
			String pickupPointLocation, String pickUpReference, String instructions_ToDriver,
			String do_you_want_to_submit_Form_yes_orNo) {

		if (do_you_have_prePrinted_shipping_Label == true) {
			sc.yes_prePrinted_shipping_Label().sendKeys(Keys.ENTER);
			sc.tracking_Number_textbox().sendKeys(tracking_Number);
		}

		if (do_you_have_prePrinted_shipping_Label == false) {
			sc.no_prePrinted_shipping_Label();
		}
		if (agreemenet_to_pay_the_driver == true) {
			sc.will_you_Pay_theDriver_UsingCheck_or_MoneyOrder().sendKeys(Keys.RETURN);
		}

		// account number
		if (account_number != null) {
			sc.accNum().sendKeys(account_number);
		}

		// company_or_customerName
		if (company_or_customerName != null) {
			sc.custName().sendKeys(company_or_customerName);

		}

		// contact_name
		if (contact_name != null) {
			sc.cont_Name().sendKeys(contact_name);
		}

		// street_address

		if (street_address != null) {
			sc.address().sendKeys(street_address);
		}

		// suite_or_roomNumber

		if (suite_or_roomNumber != null) {
			sc.roomNumber().sendKeys(suite_or_roomNumber);
		}

		// floor_Number
		if (floor_Number != null) {

			sc.flr_Number().sendKeys(floor_Number);
		}
		// city_name
		if (city_name != null) {
			sc.city().sendKeys(city_name);
		}
		// state_Name

		if (state_Name != null) {
			sc.state_Name(state_Name);
		}

		// zip_Code
		if (city_name != null) {
			sc.city().sendKeys(city_name);
		}

		if (zip_Code != null) {

			sc.zip().sendKeys(zip_Code);
		}

		// telephone_Number
		if (telephone_Number != null) {
			sc.telephone().sendKeys(telephone_Number);
		}

		// Extension number
		if (extension_Number != null) {
			sc.extension_Number().sendKeys(extension_Number);
		}

		// residential address
		if (residential_Address == true) {
			sc.residential_address_checkbox().sendKeys(Keys.ENTER);

			if (package_total != null) {

				sc.package_total(package_total);
			}

		}

		if (true_or_false_this_order_has_items_over_seventy_pounds == true) {
			sc.yes_these_items_weigh_over_seventypounds().sendKeys(Keys.RETURN);
		}

		if (pickupDate != null) {

			sc.pickupdate(pickupDate);
		}
		if (earliest_pickuptime_hours != null) {

			sc.earliest_Pickup_Time_Hour(earliest_pickuptime_hours);
		}
		if (earliest_pickuptime_minutes != null) {

			sc.earliest_Pickup_Time_Minutes(earliest_pickuptime_minutes);
		}

		if (am_orPM.equalsIgnoreCase("am")) {
			sc.earliest_Pickup_Time_AM_radio_button().sendKeys(Keys.RETURN);

		} else {
			sc.earliest_Pickup_Time_PM_radio_button().sendKeys(Keys.RETURN);
		}
		if (latest_pickuptime_hours != null) {
			sc.latest_Pickup_Time_Hour(latest_pickuptime_hours);
		}
		if (latest_pickuptime_minutes != null) {
			sc.latest_Pickup_Time_Minutes(latest_pickuptime_minutes);
		}

		if (latest_am_orPM.equalsIgnoreCase("am")) {
			sc.latest_Pickup_Time_AM_radio_button().sendKeys(Keys.RETURN);

		} else {
			sc.latest_Pickup_Time_AM_radio_button().sendKeys(Keys.RETURN);
		}

		if (pickupPointLocation != null) {

			sc.preferredPickup_point(pickupPointLocation);
		}
		if (pickUpReference != null) {

			sc.pick_Reference_id_Number().sendKeys(pickUpReference);
		}
		if (instructions_ToDriver != null) {

			sc.specialInstructions(instructions_ToDriver);

			if (do_you_want_to_submit_Form_yes_orNo.equalsIgnoreCase("yes")) {
				sc.next_button().sendKeys(Keys.RETURN);
			}
		}

	}

	// do NOT merge these two Shipping methods with any of the other methods for
	// this webpage.
	public void domestic_Shipping(String domestic_service_speed) {
		// the maximum amount of times this method and the
		// international_Shipping() method can be invoked must be less than or
		// equal to the value of the pallet_quantity of
		// serviceAndPackageInformation().

		if (domestic_service_speed != null) {
			sc.ups_DomesticServices_checkbox(domestic_service_speed);
		}
	}

	public void international_Shipping(String international_service_speed) {
		// the maximum amount of times this method and the domestic_Shipping()
		// method can be invoked must be less than or equal to the value of the
		// pallet_quantity of serviceAndPackageInformation().
		if (international_service_speed != null) {
			sc.ups_InternationalServices_checkbox(international_service_speed);
		}

	}

	public void palletShipping_Speed(String service_speed) {
		if (service_speed != null) {
			sc.ups_palletShipping_Speed_checkbox(service_speed);

		}
	}

	// Question5: PICKUP NOTIFICATIONS, do NOT merge this

	public void pickup_Notifications_Input(String phoneNumber, Integer total_amount_of_emails_you_would_like_to_notify,
			String emailAdress, String personalizedMessage, String input_your_email_address) {

		sc.showPickUpNotifications_btn().sendKeys(Keys.ENTER);
		if (phoneNumber != null) {
			sc.phoneNumber(phoneNumber);
		}
		if (total_amount_of_emails_you_would_like_to_notify != null) {
			sc.email_textBox(total_amount_of_emails_you_would_like_to_notify, emailAdress);
		}
		if (personalizedMessage != null) {
			sc.personalizedMessage_txt_box().sendKeys(personalizedMessage);
		}
		if (input_your_email_address != null) {
			sc.yourEmailAddress_txt_box().sendKeys(input_your_email_address);

		}

	}

	// PICKUP NOTIFICATIONSQuestion completed

}
