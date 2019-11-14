package com.aut.qa.testScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aut.qa.base.TestBase;
import com.aut.qa.pages.ContactsPage;
import com.aut.qa.pages.HomePage2;
import com.aut.qa.pages.LoginPage1;
import com.aut.qa.utility.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage1 login;
	HomePage2 homePage;
	TestUtil testUtil;
	ContactsPage contactPage;
	Logger log = Logger.getLogger(HomePageTest.class);
	
	
	public HomePageTest() {

		super();
	}


	@BeforeMethod
	
	public void setUp() throws InterruptedException {
		
		
		
		log.info("INVOKING initialization() method");
		
		initialization();
		
		log.info(" initialization() method successfully invoked");
		
		
		login = new LoginPage1();
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil= new TestUtil();
		contactPage = new ContactsPage();
	}



	@Test (priority = 0)
	public void homePagetitleTest() {

		log.info("Starting homePagetitleTest");
		
		String homePgaeTitle =driver.getTitle();

		Assert.assertEquals(homePgaeTitle, "CRMPRO", "HomePage Title does not match");

		
	}

	@Test(priority = 1)
	public void UserNameDisplayTest() {

		log.info("Starting UserNameDisplayTest");
		
		testUtil.switchToMainPanelFrame();
		boolean flag = homePage.verifyUserNameDisplay();
		Assert.assertTrue(flag);
	}

	@Test( priority = 2)
	public void verifyUserNametest() {
		testUtil.switchToMainPanelFrame();
		String userName = homePage.fetchUsername();
		String actualname = userName.substring(8);
		Assert.assertEquals(actualname, "Abhishek Sarkar");

	}

	@Test
	public void verifyContactLinkTest() {

		log.info("Starting verifyContactLinkTest");
		
		testUtil.switchToMainPanelFrame();
		contactPage = homePage.clickOnContactsLink();

	}



	@AfterMethod
	public void tearDown() {
		driver.close();

		log.info("Browser Successfully closed");
	}



}
