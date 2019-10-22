package com.aut.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aut.qa.base.TestBase;

public class LoginPage1  extends TestBase{

	//Page Factory - OR

	//Step 1 --> Create  the elements of the page
	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name =  "password")
	WebElement passWord;

	@FindBy(xpath = "//input[@class='btn btn-small']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement imgCRM; 

	//Step 2 --> Create the constructor of the page to initialize the elements
	//Need to initialize the object repository   / Page  Factory 
	//Will create the constructor 

	public LoginPage1() {

		PageFactory.initElements(driver, this); //this means current object

	}


	//Step 3 --> Define the methods or action on the elements.
	//Define different actions/ features
	//1
	public String validateLoginTitle() {

		return driver.getTitle();

	}

	//2
	public  boolean validateCRMImagePresent() {

		return 	imgCRM.isDisplayed();

	}

	//3
	public HomePage2 login(String UN , String PWD) throws InterruptedException {

		userName.sendKeys(UN);
		passWord.sendKeys(PWD);

		Thread.sleep(5000); //The click was to fast, was getting WebElementClickIntercept


		loginBtn.click();

		//After clicking the login button , user is landed on the home page , so the 
		//return type of the login method should be HomePage Object.

		return new HomePage2();

	}

}
