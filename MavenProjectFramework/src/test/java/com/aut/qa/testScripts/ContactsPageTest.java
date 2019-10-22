package com.aut.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aut.qa.base.TestBase;
import com.aut.qa.pages.ContactsPage;
import com.aut.qa.pages.HomePage2;
import com.aut.qa.pages.LoginPage1;
import com.aut.qa.utility.TestUtil;

public class ContactsPageTest extends TestBase{

	LoginPage1 login;
	HomePage2 homePage;
	TestUtil testUtil;
	ContactsPage contactPage;



	public ContactsPageTest() {

		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		login = new LoginPage1();
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil= new TestUtil();
		contactPage = new ContactsPage();
		
		testUtil.switchToMainPanelFrame(); 

		contactPage = homePage.clickOnContactsLink();  
		
		


	}
	
	@Test(priority = 1)
	public void verifyContactsLabel() {
		
		
		boolean flag =contactPage.verifyContactsLabel();
		Assert.assertTrue(flag, "Contacts label is missing in page");
	}
	
	
	@Test(priority = 2 , enabled=true)
	public void selectContactsName() throws InterruptedException {
		
		contactPage.selectContactsByName("Test Test Pikachoo");
		Thread.sleep(5000);
		
	}
	 
	
	
	
	


	@AfterMethod
	public void tearDown() {

		driver.quit();


	}

}
