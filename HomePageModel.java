package com.ups.PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel extends ModelBase {

	public HomePageModel(WebDriver driver) {
		super(driver);

	}

	protected WebElement button;
	protected WebElement mainMenu;
	protected WebElement serviceMenu;
	protected WebElement myProfileMenu;
	protected WebElement trackingMenu;
	protected WebElement shippingMenu;
	protected WebElement servicesMenu;
	protected WebElement languageMenu;
	protected WebElement countryMenu;

	
	
	
	
	public WebElement homePage_Menu(String menu) {

		return mainMenu = driver
				.findElement(By.xpath("//*[@id='ups-navItems']/ul/li/a[contains(text(), '"+menu+"')]"));
	}

	public WebElement trackingMenu(String menuItem) {

		return trackingMenu = driver
				.findElement(By.xpath("//*[@id='ups-menuPanel0']/div/div/ul/li/a[contains(text (), '"+menuItem+"')]"));
	}

	public WebElement shippingMenu(String menuItem) {

		return shippingMenu = driver
				.findElement(By.xpath("//*[@id='ups-menuPanel1']/div/div/ul/li/a[contains(text (), '"+menuItem+"')]"));
	}

	public WebElement servicesMenu(String menuItem) {

		return servicesMenu = driver
				.findElement(By.xpath("//*[@id='ups-menuPanel2']/div/div/ul/li/a[contains(text (), '"+menuItem+"')]"));
	}

	public WebElement languageMenu(String menuItem) {

		return languageMenu = driver
				.findElement(By.xpath("//*[@id='ups-language-panel']/ul/li/a[contains(text (), '"+menuItem+"')]"));
	}

	public WebElement countryMenu(String menuItem) {

		return countryMenu = driver.findElement(By.xpath("//*[@id='ups-language-panel']/div/a"));
	}

	public WebElement myProfileMenu(String menuItem) {

		return myProfileMenu = driver.findElement(
				By.xpath("//*[@id='ups-navItems']/ul[2]/li[6]/div/ul/li/a[contains(text (), '"+menuItem+"')]"));
	}

//	protected WebElement quickStartTab = null;
//	protected WebElement track = null;
//	protected WebElement ship = null;
//	protected WebElement signUpPage = null;
//
//	protected WebElement billing_andPaymentPage = null;
//	protected WebElement loginPage = null;
//
//	protected WebElement language_Espanol = null;
//	protected WebElement language_selectCountryPage = null;
//	protected WebElement language_English = null;
//	protected WebElement locations_button = null;
//	protected WebElement language_button = null;
//	protected WebElement alerts_button = null;
//
//	protected WebElement quickStart_track_button = null;
//	protected WebElement quickStart_ship_button = null;
//	protected WebElement quickStart_quote_button = null;
//	protected WebElement quickStart_locations_button = null;
//	protected WebElement quickStart_viewAndPay_MyBill = null;
//	protected WebElement account_Overview_Page = null;
//	protected WebElement myInformation_Page = null;
//	protected WebElement addresses_Page = null;
//	protected WebElement paymentOptions = null;
//	protected WebElement preferences_Page = null;
//	protected WebElement viewand_Pay_myBill_Page = null;
//	protected WebElement logout_button = null;
//	protected WebElement tracking_button = null;
//	protected WebElement myProfile_button = null;
//
//	protected WebElement services_button = null;
//	protected WebElement customerService_button = null;
//	protected WebElement shipping_button = null;
//	protected WebElement emailus_Page = null;
//	protected WebElement help_and_Support_Center_Page = null;
//	protected WebElement callUs_Page = null;
//	protected WebElement get_Started_withUPS_Page = null;
//	protected WebElement seeAllContactOptions_Page = null;
//	protected WebElement changeDelivery_Page = null;
//	protected WebElement deliveryIssues_Page = null;
//	protected WebElement ask_Our_Virtual_Assistant_Page = null;
//	protected WebElement learnMore_trackingTab_button = null;
//	protected WebElement calculate_Time_and_Cost_button = null;
//	protected WebElement schedule_a_Pickup_button = null;
//	protected WebElement view_Shipping_History_button = null;
//	protected WebElement create_a_Return_button = null;
//	protected WebElement manage_Online_Orders_button = null;
//	protected WebElement void_Shipment_button = null;
//	protected WebElement batch_File_Shipping_button = null;
//	protected WebElement create_Import_button = null;
//	protected WebElement internation_Toolset_button = null;
//	protected WebElement track_and_Tracking_History_button = null;
//	protected WebElement manage_Home_Deliveries_button = null;
//	protected WebElement change_Delivery_button = null;
//	protected WebElement manage_Inbound_Outbound_Shipments_Quantum_View_button = null;
//	protected WebElement Brokerage_and_Compliance_button = null;
//	protected WebElement explore_All_tracking_button = null;
//	protected WebElement service_Guide_button = null;
//	protected WebElement order_Supplies_button = null;
//	protected WebElement explore_All_Shipping_button = null;
//	protected WebElement try_It_Now_button = null;
//	protected WebElement by_Type_Shipping_button = null;
//	protected WebElement by_Type_Tracking_button = null;
//	protected WebElement by_Type_billing_button = null;
//	protected WebElement by_Type_International_Trade_button = null;
//	protected WebElement by_Type_Contract_Logistics_button = null;
//	protected WebElement by_Type_Integrating_UPS_Technology_button = null;
//	protected WebElement by_Size_Individual_Shipper_button = null;
//	protected WebElement by_Size_Small_Business_button = null;
//	protected WebElement by_Size_Mid_to_Large_Business_button = null;
//	protected WebElement explore_UPS_Saturday_Delivery_button = null;
//	protected WebElement explore_All_Services_button = null;
//	protected WebElement seeAll_button = null;
//	protected WebElement by_Industry_Automotive_button = null;
//	protected WebElement by_Industry_Industrial_Manufacturing_and_Distribution_button = null;
//	protected WebElement by_Industry_HighTech_button = null;
//	protected WebElement by_Industry_HealthCare_button = null;
//	protected WebElement by_Industry_Consumer_Goods_and_Retail_button = null;
//	protected WebElement by_Size_Customized_Solutions_button = null;
//	protected WebElement signUp_button;
//	protected WebElement loginPage_button;
//
//	public WebElement quickStart_Panel() {
//
//		quickStartTab = driver.findElement(By.xpath("//*[@id='ups-quickStartMenu']"));
//		return quickStartTab;
//	}
//
//	public WebElement quickStart_track_button(String qstart_trackNumber) {
//
//		quickStart_track_button = driver.findElement(By.xpath("//*[@id='ups-track--qs']"));
//		return quickStart_track_button;
//	}
//
//	public WebElement quickStart_ship_button() {
//		quickStart_ship_button = driver.findElement(By.xpath("//*[@id='ups-quickStartQ']"));
//		return quickStart_ship_button;
//	}
//
//	public WebElement quickStart_quote_button() {
//		quickStart_quote_button = driver.findElement(
//				By.linkText("https://www.ups.com/us/en/w11-quote-page.page?" + "quickStart=true&widget=quote"));
//		return quickStart_quote_button;
//	}
//
//	public WebElement quickStart_locations_button() {
//		quickStart_locations_button = driver.findElement(By.linkText(
//				"https://www.ups.com/us/en/w1-location-finder-page" + ".page?quickStart=true&widget=locationFinder"));
//		return quickStart_locations_button;
//	}
//
//	public WebElement quickStart_viewAndPay_MyBill_button() {
//		quickStart_viewAndPay_MyBill = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/help-center/billing-payment.page?"));
//		return quickStart_viewAndPay_MyBill;
//	}
//
//	public WebElement signUp_button() {
//
//		signUp_button = driver.findElement(By.xpath("//*[@id='ups-navItems']/ul[2]/li[2]/a"));
//		return signUp_button;
//	}
//
//	public WebElement loginPage_button() {
//
//		loginPage_button = driver.findElement(By.linkText("https://www.ups.com/lasso/login?loc='"
//				+ "en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page"));
//		return loginPage_button;
//
//	}
//
//	public WebElement alerts_button() {
//
//		alerts_button = driver.findElement(By.xpath("//*[@id='ups-navItems']/ul[2]/li[1]/a"));
//		return alerts_button;
//
//	}
//
//	public WebElement billing_andPaymentPage() {
//
//		billing_andPaymentPage = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/help-center/billing-payment.page?"));
//		return billing_andPaymentPage;
//
//	}
//
//	public WebElement language_button() {
//
//		language_button = driver.findElement(By.xpath("//*[@id='ups-language-toggle']"));
//		return language_button;
//
//	}
//
//	public WebElement language_selectCountryPage() {
//
//		language_selectCountryPage = driver.findElement(By.linkText("https://www.ups.com/dropoff?loc=en_US"));
//		return language_selectCountryPage;
//
//	}
//
//	public WebElement language_Espanol() {
//
//		language_Espanol = driver.findElement(By.linkText("https://es-us.ups.com/us/es/Home.page?loc=es_US"));
//		return language_Espanol;
//
//	}
//
//	public WebElement language_English() {
//
//		language_English = driver.findElement(By.linkText("https://www.ups.com/us/en/global.page?"));
//		return language_English;
//
//	}
//
//	public WebElement locations_button() {
//
//		locations_button = driver.findElement(By.linkText("https://www.ups.com/dropoff?loc=en_US"));
//		return locations_button;
//
//	}
//
//	public WebElement myProfile_button() {
//
//		myProfile_button = driver.findElement(By.xpath("//*[@id='ups-account-toggle']"));
//		return myProfile_button;
//
//	}
//
//	public WebElement overview_Page() {
//
//		account_Overview_Page = driver
//				.findElement(By.linkText("https://wwwapps.ups.com/ppc/ppc.html?loc=en_US#/profilePage"));
//		return account_Overview_Page;
//
//	}
//
//	public WebElement myInformation_Page() {
//
//		myInformation_Page = driver
//				.findElement(By.linkText("https://wwwapps.ups.com/ppc/ppc.html?loc=en_US#/informationPage"));
//		return myInformation_Page;
//
//	}
//
//	public WebElement addresses_Page() {
//
//		addresses_Page = driver.findElement(By.linkText("https://wwwapps.ups.com/ppc/ppc.html?loc=en_US#/contactPage"));
//		return addresses_Page;
//
//	}
//
//	public WebElement paymentOptions_Page() {
//
//		paymentOptions = driver.findElement(By.linkText("https://wwwapps.ups.com/ppc/ppc.html?loc=en_US#/payment"));
//		return paymentOptions;
//
//	}
//
//	public WebElement preferences_Page() {
//
//		preferences_Page = driver
//				.findElement(By.linkText("https://wwwapps.ups.com/ppc/ppc.html?loc=en_US#/preferencePage"));
//		return preferences_Page;
//
//	}
//
//	public WebElement viewand_Pay_myBill_Page() {
//
//		viewand_Pay_myBill_Page = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/help-center/billing-payment.page?"));
//		return viewand_Pay_myBill_Page;
//
//	}
//
//	public WebElement logout_button() {
//
//		logout_button = driver.findElement(By.linkText(
//				"https://www.ups.com/one-to-one/logout?returnto" + "=https%3A%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page"));
//		return logout_button;
//
//	}
//
//	public WebElement tracking_button() {
//
//		tracking_button = driver.findElement(By.xpath("//*[@id='ups-menuLinks0']"));
//		return tracking_button;
//
//	}
//
//	public WebElement track_and_Tracking_History_button() {
//
//		track_and_Tracking_History_button = driver
//				.findElement(By.linkText("https://www.ups.com/WebTracking/track?loc=en_US"));
//		return track_and_Tracking_History_button;
//
//	}
//
//	public WebElement manage_Home_Deliveries_button() {
//
//		manage_Home_Deliveries_button = driver.findElement(By.linkText("https://wwwapps.ups.com/mcdp?loc=en_US"));
//		return manage_Home_Deliveries_button;
//
//	}
//
//	public WebElement change_Delivery_button() {
//
//		change_Delivery_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/help-center/sri/tracking/change-delivery.page?"));
//		return change_Delivery_button;
//
//	}
//
//	public WebElement manage_Inbound_Outbound_Shipments_Quantum_View_button() {
//
//		manage_Inbound_Outbound_Shipments_Quantum_View_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/tracking/quantum-view.page?"));
//		return manage_Inbound_Outbound_Shipments_Quantum_View_button;
//
//	}
//
//	public WebElement Brokerage_and_Compliance_button() {
//
//		Brokerage_and_Compliance_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/international-trade/brokerage.page?"));
//		return Brokerage_and_Compliance_button;
//
//	}
//
//	public WebElement explore_All_tracking_button() {
//
//		explore_All_tracking_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/tracking.page?"));
//		return explore_All_tracking_button;
//
//	}
//
//	public WebElement learnMore_trackingTab_button() {
//
//		learnMore_trackingTab_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/tracking.page?"));
//		return learnMore_trackingTab_button;
//
//	}
//
//	public WebElement shipping_button() {
//
//		shipping_button = driver.findElement(By.xpath("//*[@id='ups-menuLinks1']"));
//		return shipping_button;
//
//	}
//
//	public WebElement create_shipment_packacge_and_freight_button() {
//
//		learnMore_trackingTab_button = driver.findElement(By.linkText("https://www.ups.com/ship?loc=en_US#/step1"));
//		return learnMore_trackingTab_button;
//
//	}
//
//	public WebElement calculate_Time_and_Cost_button() {
//
//		calculate_Time_and_Cost_button = driver
//				.findElement(By.linkText("https://wwwapps.ups.com/ctc/request?loc=en_US"));
//		return calculate_Time_and_Cost_button;
//
//	}
//
//	public WebElement schedule_a_Pickup_button() {
//
//		schedule_a_Pickup_button = driver.findElement(By.linkText("https://wwwapps.ups.com/pickup/schedule?loc=en_US"));
//		return schedule_a_Pickup_button;
//
//	}
//
//	public WebElement manage_Online_Orders_button() {
//
//		manage_Online_Orders_button = driver
//				.findElement(By.linkText("https://www.ups.com/marketplaceshipping/order?loc=en_US"));
//		return manage_Online_Orders_button;
//
//	}
//
//	public WebElement create_a_Return_button() {
//
//		create_a_Return_button = driver
//				.findElement(By.linkText("https://www.ups.com/uis/create?ActionOriginPair=CreateAReturn"
//						+ "___StartSession&loc=en_US&stcWarn=true"));
//		return create_a_Return_button;
//
//	}
//
//	public WebElement view_Shipping_History_button() {
//
//		view_Shipping_History_button = driver.findElement(By.linkText(
//				"https://www.ups.com/uis/create?loc=" + "en_US&ActionOriginPair=ShippingHistory___StartSession"));
//		return view_Shipping_History_button;
//
//	}
//
//	public WebElement void_Shipment_button() {
//
//		void_Shipment_button = driver.findElement(By.linkText("https://www.ups.com/uis/create?ActionOriginPair"
//				+ "=ShippingHistory___StartSession&loc=en_US&srcLink=VOID&WT.svl=PNRO_L1"));
//		return void_Shipment_button;
//
//	}
//
//	public WebElement batch_File_Shipping_button() {
//
//		batch_File_Shipping_button = driver
//				.findElement(By.linkText("https://www.ups.com/uis/create?ActionOriginPair=BatchImportPage"
//						+ "___StartSession&loc=en_US&WT.svl=SubNav"));
//		return batch_File_Shipping_button;
//
//	}
//
//	public WebElement create_Import_button() {
//
//		create_Import_button = driver.findElement(By.linkText(
//				"https://www.ups.com/uis/create?ActionOriginPair=" + "CreateAnImport___StartSession&loc=en_US"));
//		return create_Import_button;
//
//	}
//
//	public WebElement internation_Toolset_button() {
//
//		internation_Toolset_button = driver.findElement(By.linkText("https://wwwapps.ups.com/tradeability?loc=en_US"));
//		return internation_Toolset_button;
//
//	}
//
//	public WebElement service_Guide_button() {
//
//		service_Guide_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/shipping/international/services.page?"));
//		return service_Guide_button;
//
//	}
//
//	public WebElement order_Supplies_button() {
//
//		order_Supplies_button = driver.findElement(By.linkText("https://www.ups.com/osa/orderSupplies?loc=en_US"));
//		return order_Supplies_button;
//
//	}
//
//	public WebElement explore_All_Shipping_button() {
//
//		explore_All_Shipping_button = driver.findElement(By.linkText("https://www.ups.com/us/en/shipping.page?"));
//		return explore_All_Shipping_button;
//
//	}
//
//	public WebElement try_It_Now_button() {
//
//		try_It_Now_button = driver.findElement(By.linkText("https://www.ups.com/ship?src=uis&loc=en_US#/init"));
//		return try_It_Now_button;
//
//	}
//
//	public WebElement services_button() {
//
//		services_button = driver.findElement(By.xpath("//*[@id='ups-menuLinks2']"));
//		return services_button;
//
//	}
//
//	public WebElement by_Type_Shipping_button() {
//
//		by_Type_Shipping_button = driver.findElement(By.linkText("https://www.ups.com/us/en/services/shipping.page?"));
//		return by_Type_Shipping_button;
//
//	}
//
//	public WebElement by_Type_Tracking_button() {
//
//		by_Type_Tracking_button = driver.findElement(By.linkText("https://www.ups.com/us/en/services/tracking.page?"));
//		return by_Type_Tracking_button;
//
//	}
//
//	public WebElement by_Type_billing_button() {
//
//		by_Type_billing_button = driver.findElement(By.linkText("https://www.ups.com/us/en/services/billing.page?"));
//		return by_Type_billing_button;
//
//	}
//
//	public WebElement by_Type_International_Trade_button() {
//
//		by_Type_International_Trade_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/international-trade.page?"));
//		return by_Type_International_Trade_button;
//
//	}
//
//	public WebElement by_Type_Contract_Logistics_button() {
//
//		by_Type_Contract_Logistics_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/contract-logistics.page?"));
//		return by_Type_Contract_Logistics_button;
//
//	}
//
//	public WebElement by_Type_Integrating_UPS_Technology_button() {
//
//		by_Type_Integrating_UPS_Technology_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/technology-integration.page?"));
//		return by_Type_Integrating_UPS_Technology_button;
//
//	}
//
//	public WebElement by_Size_Individual_Shipper_button() {
//
//		by_Size_Individual_Shipper_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/individual-shipper.page?"));
//		return by_Size_Individual_Shipper_button;
//
//	}
//
//	public WebElement by_Size_Small_Business_button() {
//
//		by_Size_Small_Business_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/small-business.page?"));
//		return by_Size_Small_Business_button;
//
//	}
//
//	public WebElement by_Size_Mid_to_Large_Business_button() {
//
//		by_Size_Mid_to_Large_Business_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/mid-large-business.page?"));
//		return by_Size_Mid_to_Large_Business_button;
//
//	}
//
//	public WebElement by_Size_Customized_Solutions_button() {
//
//		by_Size_Customized_Solutions_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/customer-solutions.page?"));
//		return by_Size_Customized_Solutions_button;
//
//	}
//
//	public WebElement by_Industry_HealthCare_button() {
//
//		by_Industry_HealthCare_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/healthcare.page?"));
//		return by_Industry_HealthCare_button;
//
//	}
//
//	public WebElement by_Industry_Consumer_Goods_and_Retail_button() {
//
//		by_Industry_Consumer_Goods_and_Retail_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/retail.page?"));
//		return by_Industry_Consumer_Goods_and_Retail_button;
//
//	}
//
//	public WebElement by_Industry_HighTech_button() {
//
//		by_Industry_HighTech_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/high-tech.page?"));
//		return by_Industry_HighTech_button;
//
//	}
//
//	public WebElement by_Industry_Industrial_Manufacturing_and_Distribution_button() {
//
//		by_Industry_Industrial_Manufacturing_and_Distribution_button = driver.findElement(
//				By.linkText("https://www.ups.com/us/en/services/" + "industrial-manufacturing-distribution.page?"));
//		return by_Industry_Industrial_Manufacturing_and_Distribution_button;
//
//	}
//
//	public WebElement by_Industry_Automotive_button() {
//
//		by_Industry_Automotive_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/automotive.page?"));
//		return by_Industry_Automotive_button;
//
//	}
//
//	public WebElement seeAll_button() {
//
//		seeAll_button = driver.findElement(By.linkText("https://www.ups.com/us/en/services.page?select=2"));
//		return seeAll_button;
//
//	}
//
//	public WebElement explore_All_Services_button() {
//
//		explore_All_Services_button = driver.findElement(By.linkText("https://www.ups.com/us/en/services.page?"));
//		return explore_All_Services_button;
//
//	}
//
//	public WebElement explore_UPS_Saturday_Delivery_button() {
//
//		explore_UPS_Saturday_Delivery_button = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/services/shipping/saturday-ground-consumer.page?"));
//		return explore_UPS_Saturday_Delivery_button;
//
//	}
//
//	public WebElement customerService_button() {
//
//		customerService_button = driver.findElement(By.xpath("//*[@id='ups-custServe-toggle']"));
//		return customerService_button;
//
//	}
//
//	public WebElement emailus_Page() {
//
//		emailus_Page = driver.findElement(By.linkText("https://www.ups.com/upsemail/input?loc=en_US"));
//		return emailus_Page;
//	}
//
//	public WebElement help_and_Support_Center_Page() {
//
//		help_and_Support_Center_Page = driver
//				.findElement(By.linkText("https:// www.ups.com/us/en/help-support-center.page?"));
//		return help_and_Support_Center_Page;
//	}
//
//	public WebElement callUs_Page() {
//
//		callUs_Page = driver.findElement(By.linkText("https://www.ups.com/us/en/help-center/contact.page?"));
//		return callUs_Page;
//	}
//
//	public WebElement get_Started_withUPS_Page() {
//
//		get_Started_withUPS_Page = driver
//				.findElement(By.linkText("https:// www.ups.com/us/en/help-center/get-started-with-ups.page?"));
//		return get_Started_withUPS_Page;
//	}
//
//	public WebElement seeAllContactOptions_Page() {
//
//		seeAllContactOptions_Page = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/help-center/contact.page?"));
//		return seeAllContactOptions_Page;
//	}
//
//	public WebElement changeDelivery_Page() {
//
//		changeDelivery_Page = driver
//				.findElement(By.linkText("https:// www.ups.com/us/en/help-center/sri/tracking/change-delivery.page?"));
//		return changeDelivery_Page;
//	}
//
//	public WebElement deliveryIssues_Page() {
//
//		deliveryIssues_Page = driver.findElement(
//				By.linkText("https://www.ups.com/us/en/help-center/tracking-support/receiving-shipment.page?"));
//		return deliveryIssues_Page;
//	}
//
//	public WebElement ask_Our_Virtual_Assistant_Page() {
//
//		ask_Our_Virtual_Assistant_Page = driver
//				.findElement(By.linkText("https://www.ups.com/us/en/help-support-center.page?"));
//		return ask_Our_Virtual_Assistant_Page;
//	}
//
}
