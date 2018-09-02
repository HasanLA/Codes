package com.ups.pageactions;

import org.openqa.selenium.WebDriver;

import com.ups.PageModel.TrackHistoryPageModel;

public class TrackingPageActions extends TrackHistoryPageModel {

	TrackHistoryPageModel trackHistoryPageModel;

	public TrackingPageActions(WebDriver driver) {
		super(driver);
		trackHistoryPageModel = new TrackHistoryPageModel(driver);
	}

	public void trackingInput(String shipment_type) {
		trackHistoryPageModel.shipment_Reference_text_Box().click();
		trackHistoryPageModel.shipment_type(shipment_type);
		trackHistoryPageModel.shipment_Reference_text_Box();

	}

}
