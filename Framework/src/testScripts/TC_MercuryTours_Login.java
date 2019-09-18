package testScripts;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.Configaration;
import library.ApplicationLibrary;
import pages.FlightFInderPage_2;
import pages.HomePage_1;

public class TC_MercuryTours_Login {


	WebDriver driver;
	ApplicationLibrary lib;


	@BeforeClass
	public void initialize() {

		lib = new ApplicationLibrary();
		driver = lib.launchBrowser("Chrome");

		Assert.assertTrue(driver!=null);


	}

	@Test
	public void Script1() {

		driver.get(Configaration.url);
		HomePage_1 page1 = new HomePage_1(driver);

		//Log in to the application
		page1.login(Configaration.globalUsername, Configaration.globalPassword);
		


		//Verify login

		FlightFInderPage_2 page2 = new FlightFInderPage_2(driver);
		
		Assert.assertTrue(lib.isElementPresent(driver, page2.tripType));
	}


	@AfterClass
	public void tearDown() {

		driver.quit();


	}





}
