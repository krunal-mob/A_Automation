package com.aut.qa.testScripts;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aut.qa.base.TestBase;
import com.aut.qa.pages.HomePage2;
import com.aut.qa.pages.LoginPage1;

import testNGListener.TestNGListener;


@Listeners(testNGListener.TestNGListener.class)

public class LoginPageTest extends TestBase {


	LoginPage1 loginPage;
	HomePage2 homePage; 


	public LoginPageTest() {

		super();
	}


	@BeforeMethod
	public void setUp() {

		initialization();

		//Create the object of LoginPage1 Class
		loginPage = new LoginPage1();
	}

	//1
	@Test(priority = 0 , enabled = false)
	public void loginPagetitleTest() {

		String LoginTitle = loginPage.validateLoginTitle();

		Assert.assertEquals(LoginTitle,"CRMPRO - CRM software for customer relationship management, sales, and support.");

	}

	//2
	@Test (priority = 1, enabled = false)
	public void CRMImageTest() {
		boolean Flag = loginPage.validateCRMImagePresent();

		Assert.assertTrue(Flag);

	}

	@Test (priority = 2, enabled = false)
	public void loginTest() throws InterruptedException {

		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));


	}
	
	@Test
	public void failMethod3()	{
		
		Assert.assertEquals(false, true);
		
	}


	@AfterMethod
	public void tearDown() {
		driver.close();

	}


}
