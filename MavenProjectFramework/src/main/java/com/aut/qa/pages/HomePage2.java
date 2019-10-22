package com.aut.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aut.qa.base.TestBase;

public class HomePage2 extends TestBase {


	@FindBy(xpath="//td[contains(text(),'User: Abhishek Sarkar')]")
	WebElement userNameText;

	@FindBy(xpath ="//a[contains(text(),'Contacts')]")
	WebElement contactLink;

	@FindBy(linkText = "Deals")
	WebElement dealsLink; 

	@FindBy(linkText = "Tasks")
	WebElement tasksLink;


	public HomePage2() {

		PageFactory.initElements(driver, this);

	}



	public boolean verifyUserNameDisplay() {
		return userNameText.isDisplayed();
	}


	public String fetchUsername() {

		return userNameText.getText();

	}




	public String verifyHomePageTitle() {

		return	driver.getTitle();
	}

	public ContactsPage clickOnContactsLink() {

		contactLink.click(); 
		return new ContactsPage();

	}

	public DealsPage clickOnDealsLink() {

		dealsLink.click();
		return new DealsPage();

	}

	public TasksPage clickOnTasksLink() {


		tasksLink.click();
		return new TasksPage();
	}


}
