package com.aut.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aut.qa.base.TestBase;

public class ContactsPage  extends TestBase  {



	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactLabel;

	@FindBy(xpath = "//select[@name='title']")
	WebElement title;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement LastName;

	@FindBy(name = "client_lookup")
	WebElement company;

	@FindBy(xpath = "//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='contactForm']/table/tbody/tr/td/input[2]")
	WebElement saveButton;


	public ContactsPage() {


		PageFactory.initElements(driver, this);

	}

	//Actions
	public boolean verifyContactsLabel() {

		return contactLabel.isDisplayed();

	}



	//Will create a dynamic method for the checkbox selection based on the name , so we will not use @FindBy of the page Factory

	public void selectContactsByName(String name) {

		driver.findElement(By.xpath("//a[contains(text(),'"+ name +"')]/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();

	}

	public void createNewCOntact(String titleVisibleText , String firstName , String lastName , String comp) {

		Select sel = new Select(title);

		sel.selectByVisibleText(titleVisibleText);

		FirstName.sendKeys(firstName);

		LastName.sendKeys(lastName);

		company.sendKeys(comp);

		saveButton.click();

 
	}


}
