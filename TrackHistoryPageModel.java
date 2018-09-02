package com.ups.PageModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrackHistoryPageModel extends ModelBase {

	private WebElement shipment_type_Mail_Innovations;
	private WebElement ship_By_Reference_text_Box;
	private WebElement destination_Postal_code_text_Box;
	private WebElement destination_Country_Select_menu;
	private WebElement shipper_Account_number_text_box;
	private WebElement track_submit_button;
	private WebElement table;
	private WebElement shipment_type;

	public TrackHistoryPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement track_By_Reference() {

		return driver.findElement(By.xpath("//*[@id='ui-id-3']/a"));

	}

	public WebElement shipment_type(String type) {

		shipment_type = driver.findElement(By.xpath(
				"//*[@id='ui-id-4']/form/div/fieldset/div/fieldset/div/label[contains(text(), '" + type + "')]"));
		return shipment_type;
	}

	public WebElement shipment_type_Mail_Innovations_Button() {
		// *[@id="mailRadio"]
		shipment_type_Mail_Innovations = driver.findElement(By.xpath("//*[@id='mailRadio']"));
		return shipment_type_Mail_Innovations;
	}

	public WebElement shipment_Reference_text_Box() {
		// sendKeys
		ship_By_Reference_text_Box = driver
				.findElement(By.xpath("//*[@id='ui-id-4']/form/div/fieldset/div/div[1]/div/input"));
		return ship_By_Reference_text_Box;
	}

	public void shipmentDayRange_starting(String dayParameter) throws InterruptedException {

		List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
		for (WebElement row : tableRows) {
			List<WebElement> cells = row.findElements(By.xpath("//td"));

			for (WebElement cell : cells) {
				if (cell.getText().equals(dayParameter)) {
					driver.findElement(By.linkText(dayParameter)).click();
				}
			}
		}
	}

	public WebElement shipper_Account_number_text_box() {
		// sendKeys
		shipper_Account_number_text_box = driver.findElement(By.xpath("//*[@id='acctNum']"));
		return shipper_Account_number_text_box;
	}

	public WebElement destination_Country_Select_menu() {
		// sendKeys
		destination_Country_Select_menu = driver.findElement(By.xpath("//*[@id='DestCountry']"));
		return destination_Country_Select_menu;
	}

	public WebElement destination_Postal_code_text_Box() {
		// sendKeys
		destination_Postal_code_text_Box = driver.findElement(By.xpath("//*[@id='DestinationPostalCode']"));
		return destination_Postal_code_text_Box;
	}

	public WebElement track_submit_button() {
		// sendKeys
		track_submit_button = driver
				.findElement(By.xpath("//*[@id='ui-id-4']/form/div/fieldset/div/div[10]/div/input"));
		return track_submit_button;
	}

}
