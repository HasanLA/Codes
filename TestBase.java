package com.ups.ScriptBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ups.pageactions.HomePageActions;
import com.ups.pageactions.LoginPageActions;
import com.ups.pageactions.Schedule_a_PickupPageActions;
import com.ups.pageactions.SignUpPageActions;

public class TestBase {

	WebDriverWait wait;
protected WebDriver driver;
//	public TestBase(WebDriver driver){
//		 driver=this.driver;
//	}
	
	
	public SignUpPageActions signUp_Page(){
		return new SignUpPageActions(driver);
	}
	
	public HomePageActions homePage(){
		return new HomePageActions(driver);
	}
	
	
	public Schedule_a_PickupPageActions schedule_A_Pickup(){
		return new Schedule_a_PickupPageActions(driver);
		
	}
	public LoginPageActions loginPage(String browserName){
		beforeMethod(browserName);
		return new LoginPageActions(driver);}
	
	@Parameters("browser")
	
	  @BeforeMethod
	  public void beforeMethod( String browserName) {
		  
		  
		  if (browserName.equalsIgnoreCase("chrome")) {
			  
			  driver= new ChromeDriver();
			  System.setProperty("webdriver.chrome.driver", "C:/Users/hasan/Documents/TestProjects/"
					  +"UPS_Automation_05_27_2018/driver/chromedriver.exe");
			
		}
		  
		  
		
		  driver.get("https://www.ups.com/us/en/Home.page");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  new WebDriverWait(driver, 30);
		  
		  
		  
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	  @BeforeTest
	  public void beforeTest() {
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}

