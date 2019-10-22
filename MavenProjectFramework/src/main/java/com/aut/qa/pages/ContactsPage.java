package com.aut.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aut.qa.base.TestBase;

public class ContactsPage  extends TestBase  {



	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	 WebElement contactLabel;

    
    
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
	
	
	

}
