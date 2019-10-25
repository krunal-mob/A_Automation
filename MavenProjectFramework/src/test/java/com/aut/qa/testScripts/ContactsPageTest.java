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

		//System.out.println("2"); 
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		//System.out.println("1"); 
		initialization();

		login = new LoginPage1();
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil= new TestUtil();
		contactPage = new ContactsPage();

		testUtil.switchToMainPanelFrame(); 

		




	}

	@Test(priority = 0)
	public void verifyContactsLabel() {

		homePage.clickOnContactsLink();  
		boolean flag =contactPage.verifyContactsLabel();
		Assert.assertTrue(flag, "Contacts label is missing in page");
	}


	@Test(priority = 1)
	public void selectContactsName() throws InterruptedException {

		 homePage.clickOnContactsLink();  
		contactPage.selectContactsByName("Test Test Pikachoo");
		
		contactPage.selectContactsByName("Benchdod Pikachoo");
		

	}

	@Test (priority = 2)
	public void validateCreateNewContact() throws InterruptedException {

		homePage.clickONNewCOntactLink();

		contactPage.createNewCOntact("Mr.","Abhi","Sarkar","pikachoo");

	}




	@AfterMethod
	public void tearDown() {

		driver.quit();


	}

}
